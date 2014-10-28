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
 * JavaBean LatentFirstStageLabourReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Observations for Latent Phase of 1st Stage of Labour
 *         Form Id: 17
 */

/**
 * @hibernate.joined-subclass table="latentfirststagelabour"
 * @hibernate.joined-subclass-key column="id"
 */
public class LatentFirstStageLabourReport extends EncounterData {

private transient Time time_exam;	//time_exam
private String time_examR;
private transient Integer foetal_heart_rate_230;	//foetal_heart_rate_230
private String foetal_heart_rate_230R;
private transient Integer pulse_171;	//pulse_171
private String pulse_171R;
private transient Integer bp_systolic_224;	//bp_systolic_224
private String bp_systolic_224R;
private transient Integer bp_diastolic_225;	//bp_diastolic_225
private String bp_diastolic_225R;
private transient Float temperature_266;	//temperature_266
private String temperature_266R;
private transient Integer urinalysis_240;	//urinalysis_240
private String urinalysis_240R;
private transient Integer urinalysis_alb_242;	//urinalysis_alb_242
private String urinalysis_alb_242R;
private transient Integer urinalysis_glu_243;	//urinalysis_glu_243
private String urinalysis_glu_243R;
private transient Integer urinalysis_ace_244;	//urinalysis_ace_244
private String urinalysis_ace_244R;
private transient Integer contractions_367;	//contractions_367
private String contractions_367R;
private transient Integer contraction_freq_10_mins_368;	//contraction_freq_10_mins_368
private String contraction_freq_10_mins_368R;
private transient Integer cervix_dilatation325;	//cervix_dilatation325
private String cervix_dilatation325R;
private transient String remarks_369;	//remarks_369
private String remarks_369R;
private transient Integer diagnosis;	//diagnosis
private String diagnosisR;
private transient Integer priority_of_referral;	//priority_of_referral
private String priority_of_referralR;
private transient Integer transport;	//transport
private String transportR;


 /**
  * @return
  * @hibernate.property column="time_exam"
  */
    public Time getTime_exam() {
        return this.time_exam;
    }

    public void setTime_exam(Time time_exam) {
        this.time_exam = time_exam;
    }



    public String getTime_examR() {
        return this.time_examR;
    }

    public void setTime_examR(String time_examR) {
        this.time_examR = time_examR;
    }



 /**
  * @return
  * @hibernate.property column="foetal_heart_rate_230"
  */
    public Integer getFoetal_heart_rate_230() {
        return this.foetal_heart_rate_230;
    }

    public void setFoetal_heart_rate_230(Integer foetal_heart_rate_230) {
        this.foetal_heart_rate_230 = foetal_heart_rate_230;
    }



    public String getFoetal_heart_rate_230R() {
        return this.foetal_heart_rate_230R;
    }

    public void setFoetal_heart_rate_230R(String foetal_heart_rate_230R) {
        this.foetal_heart_rate_230R = foetal_heart_rate_230R;
    }



 /**
  * @return
  * @hibernate.property column="pulse_171"
  */
    public Integer getPulse_171() {
        return this.pulse_171;
    }

    public void setPulse_171(Integer pulse_171) {
        this.pulse_171 = pulse_171;
    }



    public String getPulse_171R() {
        return this.pulse_171R;
    }

    public void setPulse_171R(String pulse_171R) {
        this.pulse_171R = pulse_171R;
    }



 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getBp_systolic_224() {
        return this.bp_systolic_224;
    }

    public void setBp_systolic_224(Integer bp_systolic_224) {
        this.bp_systolic_224 = bp_systolic_224;
    }



    public String getBp_systolic_224R() {
        return this.bp_systolic_224R;
    }

    public void setBp_systolic_224R(String bp_systolic_224R) {
        this.bp_systolic_224R = bp_systolic_224R;
    }



 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getBp_diastolic_225() {
        return this.bp_diastolic_225;
    }

    public void setBp_diastolic_225(Integer bp_diastolic_225) {
        this.bp_diastolic_225 = bp_diastolic_225;
    }



    public String getBp_diastolic_225R() {
        return this.bp_diastolic_225R;
    }

    public void setBp_diastolic_225R(String bp_diastolic_225R) {
        this.bp_diastolic_225R = bp_diastolic_225R;
    }



 /**
  * @return
  * @hibernate.property column="temperature_266"
  */
    public Float getTemperature_266() {
        return this.temperature_266;
    }

    public void setTemperature_266(Float temperature_266) {
        this.temperature_266 = temperature_266;
    }



    public String getTemperature_266R() {
        return this.temperature_266R;
    }

    public void setTemperature_266R(String temperature_266R) {
        this.temperature_266R = temperature_266R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_240"
  */
    public Integer getUrinalysis_240() {
        return this.urinalysis_240;
    }

    public void setUrinalysis_240(Integer urinalysis_240) {
        this.urinalysis_240 = urinalysis_240;
    }



    public String getUrinalysis_240R() {
        return this.urinalysis_240R;
    }

    public void setUrinalysis_240R(String urinalysis_240R) {
        this.urinalysis_240R = urinalysis_240R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_alb_242"
  */
    public Integer getUrinalysis_alb_242() {
        return this.urinalysis_alb_242;
    }

    public void setUrinalysis_alb_242(Integer urinalysis_alb_242) {
        this.urinalysis_alb_242 = urinalysis_alb_242;
    }



    public String getUrinalysis_alb_242R() {
        return this.urinalysis_alb_242R;
    }

    public void setUrinalysis_alb_242R(String urinalysis_alb_242R) {
        this.urinalysis_alb_242R = urinalysis_alb_242R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_glu_243"
  */
    public Integer getUrinalysis_glu_243() {
        return this.urinalysis_glu_243;
    }

    public void setUrinalysis_glu_243(Integer urinalysis_glu_243) {
        this.urinalysis_glu_243 = urinalysis_glu_243;
    }



    public String getUrinalysis_glu_243R() {
        return this.urinalysis_glu_243R;
    }

    public void setUrinalysis_glu_243R(String urinalysis_glu_243R) {
        this.urinalysis_glu_243R = urinalysis_glu_243R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_ace_244"
  */
    public Integer getUrinalysis_ace_244() {
        return this.urinalysis_ace_244;
    }

    public void setUrinalysis_ace_244(Integer urinalysis_ace_244) {
        this.urinalysis_ace_244 = urinalysis_ace_244;
    }



    public String getUrinalysis_ace_244R() {
        return this.urinalysis_ace_244R;
    }

    public void setUrinalysis_ace_244R(String urinalysis_ace_244R) {
        this.urinalysis_ace_244R = urinalysis_ace_244R;
    }



 /**
  * @return
  * @hibernate.property column="contractions_367"
  */
    public Integer getContractions_367() {
        return this.contractions_367;
    }

    public void setContractions_367(Integer contractions_367) {
        this.contractions_367 = contractions_367;
    }



    public String getContractions_367R() {
        return this.contractions_367R;
    }

    public void setContractions_367R(String contractions_367R) {
        this.contractions_367R = contractions_367R;
    }



 /**
  * @return
  * @hibernate.property column="contraction_freq_10_mins_368"
  */
    public Integer getContraction_freq_10_mins_368() {
        return this.contraction_freq_10_mins_368;
    }

    public void setContraction_freq_10_mins_368(Integer contraction_freq_10_mins_368) {
        this.contraction_freq_10_mins_368 = contraction_freq_10_mins_368;
    }



    public String getContraction_freq_10_mins_368R() {
        return this.contraction_freq_10_mins_368R;
    }

    public void setContraction_freq_10_mins_368R(String contraction_freq_10_mins_368R) {
        this.contraction_freq_10_mins_368R = contraction_freq_10_mins_368R;
    }



 /**
  * @return
  * @hibernate.property column="cervix_dilatation325"
  */
    public Integer getCervix_dilatation325() {
        return this.cervix_dilatation325;
    }

    public void setCervix_dilatation325(Integer cervix_dilatation325) {
        this.cervix_dilatation325 = cervix_dilatation325;
    }



    public String getCervix_dilatation325R() {
        return this.cervix_dilatation325R;
    }

    public void setCervix_dilatation325R(String cervix_dilatation325R) {
        this.cervix_dilatation325R = cervix_dilatation325R;
    }



 /**
  * @return
  * @hibernate.property column="remarks_369" type="text"
  */
    public String getRemarks_369() {
        return this.remarks_369;
    }

    public void setRemarks_369(String remarks_369) {
        this.remarks_369 = remarks_369;
    }



    public String getRemarks_369R() {
        return this.remarks_369R;
    }

    public void setRemarks_369R(String remarks_369R) {
        this.remarks_369R = remarks_369R;
    }



 /**
  * @return
  * @hibernate.property column="diagnosis"
  */
    public Integer getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(Integer diagnosis) {
        this.diagnosis = diagnosis;
    }



    public String getDiagnosisR() {
        return this.diagnosisR;
    }

    public void setDiagnosisR(String diagnosisR) {
        this.diagnosisR = diagnosisR;
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



}
