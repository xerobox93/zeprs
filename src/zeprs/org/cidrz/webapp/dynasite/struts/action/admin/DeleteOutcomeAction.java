/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.webapp.dynasite.struts.action.admin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.cidrz.webapp.dynasite.exception.ObjectNotFoundException;
import org.cidrz.webapp.dynasite.rules.Outcome;
import org.cidrz.webapp.dynasite.session.SessionUtil;
import org.cidrz.webapp.dynasite.struts.action.generic.BaseAction;
import org.cidrz.webapp.dynasite.utils.DatabaseUtils;
import org.cidrz.webapp.dynasite.utils.PatientRecordUtils;
import org.cidrz.webapp.dynasite.utils.struts.ParameterActionForward;
import org.cidrz.webapp.dynasite.valueobject.Site;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: ckelley
 * Date: April 3, 2006
 * Time: 9:51 AM
 */
public final class DeleteOutcomeAction extends BaseAction {

    /**
     * Commons Logging instance.
     */
    private static Log log = LogFactory.getFactory().getInstance(DeleteOutcomeAction.class);

    protected ActionForward doExecute(ActionMapping mapping,
                                      ActionForm actionForm,
                                      HttpServletRequest request,
                                      HttpServletResponse response)
            throws Exception {

        HttpSession session = request.getSession();
        Site site = SessionUtil.getInstance(session).getClientSettings().getSite();
        Principal user = request.getUserPrincipal();
        String username = user.getName();
        Connection conn = null;

        Long outcomeId = null;
        if (request.getParameter("outcomeId") != null) {
            outcomeId = Long.valueOf(request.getParameter("outcomeId"));
        }

        try {
            conn = DatabaseUtils.getSpecialRootConnection("zeprsAdmin");
            if (outcomeId != null) {
                try {
                    Outcome outcome = PatientRecordUtils.deleteOutcome(conn, outcomeId, username, site);
                    Long patientId = outcome.getPatientId();
                    ParameterActionForward forward = new ParameterActionForward(mapping.findForward("problem"));
                    forward.addParameter("patientId", patientId);
                    return forward;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ObjectNotFoundException e) {
                    e.printStackTrace();
                    return mapping.findForward("error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("exception", e);
            return mapping.findForward("error");
        } finally {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
        return mapping.findForward("success");
    }

}
