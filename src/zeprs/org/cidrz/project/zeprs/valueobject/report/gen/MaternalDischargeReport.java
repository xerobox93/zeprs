package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean MaternalDischargeReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Maternal Discharge Summary
 *         Form Id: 68
 */

/**
 * @hibernate.joined-subclass table="maternaldischarge"
 * @hibernate.joined-subclass-key column="id"
 */
public class MaternalDischargeReport extends EncounterData {

private transient Byte breast_feedi_576;	//breast_feedi_576
private String breast_feedi_576R;
private transient Integer feeding_type;	//feeding_type
private String feeding_typeR;
private transient Byte bonding_well_577;	//bonding_well_577
private String bonding_well_577R;
private transient Boolean cs;	//cs
private String csR;
private transient Integer involution_uterus_578;	//involution_uterus_578
private String involution_uterus_578R;
private transient Integer outcome_of_mother_582;	//outcome_of_mother_582
private String outcome_of_mother_582R;
private transient Integer postpartum_i_66;	//postpartum_i_66
private String postpartum_i_66R;
private transient Integer postpartum_complications_584;	//postpartum_complications_584
private String postpartum_complications_584R;
private transient Byte mother_receive_vit_a_585;	//mother_receive_vit_a_585
private String mother_receive_vit_a_585R;
private transient Byte patient_received_arv;	//patient_received_arv
private String patient_received_arvR;
private transient Integer medication_586;	//medication_586
private String medication_586R;
private transient String medication_other_587;	//medication_other_587
private String medication_other_587R;
private transient Byte unplanned_pregnancy_588;	//unplanned_pregnancy_588
private String unplanned_pregnancy_588R;
private transient Integer if_cs_cond_wound_1205;	//if_cs_cond_wound_1205
private String if_cs_cond_wound_1205R;
private transient String if_cs_cond_other_1206;	//if_cs_cond_other_1206
private String if_cs_cond_other_1206R;
private transient Byte family_planning_discussed_594;	//family_planning_discussed_594
private String family_planning_discussed_594R;
private transient String treatment_on_discharge_595;	//treatment_on_discharge_595
private String treatment_on_discharge_595R;
private transient Integer general_condition_260;	//general_condition_260
private String general_condition_260R;
private transient String comments_maternal_discharge_597;	//comments_maternal_discharge_597
private String comments_maternal_discharge_597R;
private transient Integer maternal_summary_discharge;	//maternal_summary_discharge
private String maternal_summary_dischargeR;
private transient Integer priority_of_referral;	//priority_of_referral
private String priority_of_referralR;
private transient Integer transport;	//transport
private String transportR;
private transient Integer reason_for_referral_592;	//reason_for_referral_592
private String reason_for_referral_592R;
private transient String reason_for_referral_1202;	//reason_for_referral_1202
private String reason_for_referral_1202R;
private transient Date date_followup_visit;	//date_followup_visit
private String date_followup_visitR;
private transient Integer place_followup_visit;	//place_followup_visit
private String place_followup_visitR;
private transient Byte autopsy_requested_598;	//autopsy_requested_598
private String autopsy_requested_598R;
private transient Integer autopsy_consent_599;	//autopsy_consent_599
private String autopsy_consent_599R;




    public String getBreast_feedi_576R() {
        return this.breast_feedi_576R;
    }

    public void setBreast_feedi_576R(String breast_feedi_576R) {
        this.breast_feedi_576R = breast_feedi_576R;
    }



 /**
  * @return
  * @hibernate.property column="feeding_type"
  */
    public Integer getFeeding_type() {
        return this.feeding_type;
    }

    public void setFeeding_type(Integer feeding_type) {
        this.feeding_type = feeding_type;
    }



    public String getFeeding_typeR() {
        return this.feeding_typeR;
    }

    public void setFeeding_typeR(String feeding_typeR) {
        this.feeding_typeR = feeding_typeR;
    }



 /**
  * @return
  * @hibernate.property column="bonding_well_577"
  */
    public Byte getBonding_well_577() {
        return this.bonding_well_577;
    }

    public void setBonding_well_577(Byte bonding_well_577) {
        this.bonding_well_577 = bonding_well_577;
    }



    public String getBonding_well_577R() {
        return this.bonding_well_577R;
    }

    public void setBonding_well_577R(String bonding_well_577R) {
        this.bonding_well_577R = bonding_well_577R;
    }



 /**
  * @return
  * @hibernate.property column="cs"
  */
    public Boolean getCs() {
        return this.cs;
    }

    public void setCs(Boolean cs) {
        this.cs = cs;
    }



    public String getCsR() {
        return this.csR;
    }

    public void setCsR(String csR) {
        this.csR = csR;
    }



 /**
  * @return
  * @hibernate.property column="involution_uterus_578"
  */
    public Integer getInvolution_uterus_578() {
        return this.involution_uterus_578;
    }

    public void setInvolution_uterus_578(Integer involution_uterus_578) {
        this.involution_uterus_578 = involution_uterus_578;
    }



    public String getInvolution_uterus_578R() {
        return this.involution_uterus_578R;
    }

    public void setInvolution_uterus_578R(String involution_uterus_578R) {
        this.involution_uterus_578R = involution_uterus_578R;
    }





    public String getOutcome_of_mother_582R() {
        return this.outcome_of_mother_582R;
    }

    public void setOutcome_of_mother_582R(String outcome_of_mother_582R) {
        this.outcome_of_mother_582R = outcome_of_mother_582R;
    }



 /**
  * @return
  * @hibernate.property column="postpartum_i_66"
  */
    public Integer getPostpartum_i_66() {
        return this.postpartum_i_66;
    }

    public void setPostpartum_i_66(Integer postpartum_i_66) {
        this.postpartum_i_66 = postpartum_i_66;
    }



    public String getPostpartum_i_66R() {
        return this.postpartum_i_66R;
    }

    public void setPostpartum_i_66R(String postpartum_i_66R) {
        this.postpartum_i_66R = postpartum_i_66R;
    }



 /**
  * @return
  * @hibernate.property column="postpartum_complications_584"
  */
    public Integer getPostpartum_complications_584() {
        return this.postpartum_complications_584;
    }

    public void setPostpartum_complications_584(Integer postpartum_complications_584) {
        this.postpartum_complications_584 = postpartum_complications_584;
    }



    public String getPostpartum_complications_584R() {
        return this.postpartum_complications_584R;
    }

    public void setPostpartum_complications_584R(String postpartum_complications_584R) {
        this.postpartum_complications_584R = postpartum_complications_584R;
    }



 /**
  * @return
  * @hibernate.property column="mother_receive_vit_a_585"
  */
    public Byte getMother_receive_vit_a_585() {
        return this.mother_receive_vit_a_585;
    }

    public void setMother_receive_vit_a_585(Byte mother_receive_vit_a_585) {
        this.mother_receive_vit_a_585 = mother_receive_vit_a_585;
    }



    public String getMother_receive_vit_a_585R() {
        return this.mother_receive_vit_a_585R;
    }

    public void setMother_receive_vit_a_585R(String mother_receive_vit_a_585R) {
        this.mother_receive_vit_a_585R = mother_receive_vit_a_585R;
    }



 /**
  * @return
  * @hibernate.property column="patient_received_arv"
  */
    public Byte getPatient_received_arv() {
        return this.patient_received_arv;
    }

    public void setPatient_received_arv(Byte patient_received_arv) {
        this.patient_received_arv = patient_received_arv;
    }



    public String getPatient_received_arvR() {
        return this.patient_received_arvR;
    }

    public void setPatient_received_arvR(String patient_received_arvR) {
        this.patient_received_arvR = patient_received_arvR;
    }



 /**
  * @return
  * @hibernate.property column="medication_586"
  */
    public Integer getMedication_586() {
        return this.medication_586;
    }

    public void setMedication_586(Integer medication_586) {
        this.medication_586 = medication_586;
    }



    public String getMedication_586R() {
        return this.medication_586R;
    }

    public void setMedication_586R(String medication_586R) {
        this.medication_586R = medication_586R;
    }



 /**
  * @return
  * @hibernate.property column="medication_other_587" type="text"
  */
    public String getMedication_other_587() {
        return this.medication_other_587;
    }

    public void setMedication_other_587(String medication_other_587) {
        this.medication_other_587 = medication_other_587;
    }



    public String getMedication_other_587R() {
        return this.medication_other_587R;
    }

    public void setMedication_other_587R(String medication_other_587R) {
        this.medication_other_587R = medication_other_587R;
    }





    public String getUnplanned_pregnancy_588R() {
        return this.unplanned_pregnancy_588R;
    }

    public void setUnplanned_pregnancy_588R(String unplanned_pregnancy_588R) {
        this.unplanned_pregnancy_588R = unplanned_pregnancy_588R;
    }





    public String getIf_cs_cond_wound_1205R() {
        return this.if_cs_cond_wound_1205R;
    }

    public void setIf_cs_cond_wound_1205R(String if_cs_cond_wound_1205R) {
        this.if_cs_cond_wound_1205R = if_cs_cond_wound_1205R;
    }





    public String getIf_cs_cond_other_1206R() {
        return this.if_cs_cond_other_1206R;
    }

    public void setIf_cs_cond_other_1206R(String if_cs_cond_other_1206R) {
        this.if_cs_cond_other_1206R = if_cs_cond_other_1206R;
    }



 /**
  * @return
  * @hibernate.property column="family_planning_discussed_594"
  */
    public Byte getFamily_planning_discussed_594() {
        return this.family_planning_discussed_594;
    }

    public void setFamily_planning_discussed_594(Byte family_planning_discussed_594) {
        this.family_planning_discussed_594 = family_planning_discussed_594;
    }



    public String getFamily_planning_discussed_594R() {
        return this.family_planning_discussed_594R;
    }

    public void setFamily_planning_discussed_594R(String family_planning_discussed_594R) {
        this.family_planning_discussed_594R = family_planning_discussed_594R;
    }



 /**
  * @return
  * @hibernate.property column="treatment_on_discharge_595" type="text"
  */
    public String getTreatment_on_discharge_595() {
        return this.treatment_on_discharge_595;
    }

    public void setTreatment_on_discharge_595(String treatment_on_discharge_595) {
        this.treatment_on_discharge_595 = treatment_on_discharge_595;
    }



    public String getTreatment_on_discharge_595R() {
        return this.treatment_on_discharge_595R;
    }

    public void setTreatment_on_discharge_595R(String treatment_on_discharge_595R) {
        this.treatment_on_discharge_595R = treatment_on_discharge_595R;
    }



 /**
  * @return
  * @hibernate.property column="general_condition_260"
  */
    public Integer getGeneral_condition_260() {
        return this.general_condition_260;
    }

    public void setGeneral_condition_260(Integer general_condition_260) {
        this.general_condition_260 = general_condition_260;
    }



    public String getGeneral_condition_260R() {
        return this.general_condition_260R;
    }

    public void setGeneral_condition_260R(String general_condition_260R) {
        this.general_condition_260R = general_condition_260R;
    }



 /**
  * @return
  * @hibernate.property column="comments_maternal_discharge_597" type="text"
  */
    public String getComments_maternal_discharge_597() {
        return this.comments_maternal_discharge_597;
    }

    public void setComments_maternal_discharge_597(String comments_maternal_discharge_597) {
        this.comments_maternal_discharge_597 = comments_maternal_discharge_597;
    }



    public String getComments_maternal_discharge_597R() {
        return this.comments_maternal_discharge_597R;
    }

    public void setComments_maternal_discharge_597R(String comments_maternal_discharge_597R) {
        this.comments_maternal_discharge_597R = comments_maternal_discharge_597R;
    }



 /**
  * @return
  * @hibernate.property column="maternal_summary_discharge"
  */
    public Integer getMaternal_summary_discharge() {
        return this.maternal_summary_discharge;
    }

    public void setMaternal_summary_discharge(Integer maternal_summary_discharge) {
        this.maternal_summary_discharge = maternal_summary_discharge;
    }



    public String getMaternal_summary_dischargeR() {
        return this.maternal_summary_dischargeR;
    }

    public void setMaternal_summary_dischargeR(String maternal_summary_dischargeR) {
        this.maternal_summary_dischargeR = maternal_summary_dischargeR;
    }



 /**
  * @return
  * @hibernate.property column="priority_of_referral"
  */
    public Integer getPriority_of_referral() {
        return this.priority_of_referral;
    }

    public void setPriority_of_referral(Integer priority_of_referral) {
        this.priority_of_referral = priority_of_referral;
    }



    public String getPriority_of_referralR() {
        return this.priority_of_referralR;
    }

    public void setPriority_of_referralR(String priority_of_referralR) {
        this.priority_of_referralR = priority_of_referralR;
    }



 /**
  * @return
  * @hibernate.property column="transport"
  */
    public Integer getTransport() {
        return this.transport;
    }

    public void setTransport(Integer transport) {
        this.transport = transport;
    }



    public String getTransportR() {
        return this.transportR;
    }

    public void setTransportR(String transportR) {
        this.transportR = transportR;
    }



 /**
  * @return
  * @hibernate.property column="reason_for_referral_592"
  */
    public Integer getReason_for_referral_592() {
        return this.reason_for_referral_592;
    }

    public void setReason_for_referral_592(Integer reason_for_referral_592) {
        this.reason_for_referral_592 = reason_for_referral_592;
    }



    public String getReason_for_referral_592R() {
        return this.reason_for_referral_592R;
    }

    public void setReason_for_referral_592R(String reason_for_referral_592R) {
        this.reason_for_referral_592R = reason_for_referral_592R;
    }



 /**
  * @return
  * @hibernate.property column="reason_for_referral_1202" type="text"
  */
    public String getReason_for_referral_1202() {
        return this.reason_for_referral_1202;
    }

    public void setReason_for_referral_1202(String reason_for_referral_1202) {
        this.reason_for_referral_1202 = reason_for_referral_1202;
    }



    public String getReason_for_referral_1202R() {
        return this.reason_for_referral_1202R;
    }

    public void setReason_for_referral_1202R(String reason_for_referral_1202R) {
        this.reason_for_referral_1202R = reason_for_referral_1202R;
    }



 /**
  * @return
  * @hibernate.property column="date_followup_visit"
  */
    public Date getDate_followup_visit() {
        return this.date_followup_visit;
    }

    public void setDate_followup_visit(Date date_followup_visit) {
        this.date_followup_visit = date_followup_visit;
    }



    public String getDate_followup_visitR() {
        return this.date_followup_visitR;
    }

    public void setDate_followup_visitR(String date_followup_visitR) {
        this.date_followup_visitR = date_followup_visitR;
    }



 /**
  * @return
  * @hibernate.property column="place_followup_visit"
  */
    public Integer getPlace_followup_visit() {
        return this.place_followup_visit;
    }

    public void setPlace_followup_visit(Integer place_followup_visit) {
        this.place_followup_visit = place_followup_visit;
    }



    public String getPlace_followup_visitR() {
        return this.place_followup_visitR;
    }

    public void setPlace_followup_visitR(String place_followup_visitR) {
        this.place_followup_visitR = place_followup_visitR;
    }



 /**
  * @return
  * @hibernate.property column="autopsy_requested_598"
  */
    public Byte getAutopsy_requested_598() {
        return this.autopsy_requested_598;
    }

    public void setAutopsy_requested_598(Byte autopsy_requested_598) {
        this.autopsy_requested_598 = autopsy_requested_598;
    }



    public String getAutopsy_requested_598R() {
        return this.autopsy_requested_598R;
    }

    public void setAutopsy_requested_598R(String autopsy_requested_598R) {
        this.autopsy_requested_598R = autopsy_requested_598R;
    }



 /**
  * @return
  * @hibernate.property column="autopsy_consent_599"
  */
    public Integer getAutopsy_consent_599() {
        return this.autopsy_consent_599;
    }

    public void setAutopsy_consent_599(Integer autopsy_consent_599) {
        this.autopsy_consent_599 = autopsy_consent_599;
    }



    public String getAutopsy_consent_599R() {
        return this.autopsy_consent_599R;
    }

    public void setAutopsy_consent_599R(String autopsy_consent_599R) {
        this.autopsy_consent_599R = autopsy_consent_599R;
    }



}
