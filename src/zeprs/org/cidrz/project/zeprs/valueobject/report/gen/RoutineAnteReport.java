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
 * JavaBean RoutineAnteReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Routine Antenatal Visits
 *         Form Id: 80
 */

/**
 * @hibernate.joined-subclass table="routineante"
 * @hibernate.joined-subclass-key column="id"
 */
public class RoutineAnteReport extends EncounterData {

private transient Integer ega_129;	//ega_129
private String ega_129R;
private transient Integer fundal_height_232;	//fundal_height_232
private String fundal_height_232R;
private transient Integer lie_313;	//lie_313
private String lie_313R;
private transient String position_337;	//position_337
private String position_337R;
private transient Integer presentation_314;	//presentation_314
private String presentation_314R;
private transient Integer engaged_234;	//engaged_234
private String engaged_234R;
private transient Integer descent_315;	//descent_315
private String descent_315R;
private transient Integer oedema_231;	//oedema_231
private String oedema_231R;
private transient Integer foetal_heart_rate_230;	//foetal_heart_rate_230
private String foetal_heart_rate_230R;
private transient Integer foetal_heart_rhythm_229;	//foetal_heart_rhythm_229
private String foetal_heart_rhythm_229R;
private transient Integer bp_systolic_224;	//bp_systolic_224
private String bp_systolic_224R;
private transient Integer bp_diastolic_225;	//bp_diastolic_225
private String bp_diastolic_225R;
private transient Float weight_228;	//weight_228
private String weight_228R;
private transient Integer urinalysis_ace_244;	//urinalysis_ace_244
private String urinalysis_ace_244R;
private transient Integer urinalysis_alb_242;	//urinalysis_alb_242
private String urinalysis_alb_242R;
private transient Integer urinalysis_glu_243;	//urinalysis_glu_243
private String urinalysis_glu_243R;
private transient Integer pallor_193;	//pallor_193
private String pallor_193R;
private transient Byte deworming;	//deworming
private String dewormingR;
private transient Byte folate;	//folate
private String folateR;
private transient Byte iron;	//iron
private String ironR;
private transient Integer malaria_sp_dosage;	//malaria_sp_dosage
private String malaria_sp_dosageR;
private transient Date date_next_appt;	//date_next_appt
private String date_next_apptR;
private transient Boolean is_problem;	//is_problem
private String is_problemR;


 /**
  * @return
  * @hibernate.property column="ega_129"
  */
    public Integer getEga_129() {
        return this.ega_129;
    }

    public void setEga_129(Integer ega_129) {
        this.ega_129 = ega_129;
    }



    public String getEga_129R() {
        return this.ega_129R;
    }

    public void setEga_129R(String ega_129R) {
        this.ega_129R = ega_129R;
    }



 /**
  * @return
  * @hibernate.property column="fundal_height_232"
  */
    public Integer getFundal_height_232() {
        return this.fundal_height_232;
    }

    public void setFundal_height_232(Integer fundal_height_232) {
        this.fundal_height_232 = fundal_height_232;
    }



    public String getFundal_height_232R() {
        return this.fundal_height_232R;
    }

    public void setFundal_height_232R(String fundal_height_232R) {
        this.fundal_height_232R = fundal_height_232R;
    }



 /**
  * @return
  * @hibernate.property column="lie_313"
  */
    public Integer getLie_313() {
        return this.lie_313;
    }

    public void setLie_313(Integer lie_313) {
        this.lie_313 = lie_313;
    }



    public String getLie_313R() {
        return this.lie_313R;
    }

    public void setLie_313R(String lie_313R) {
        this.lie_313R = lie_313R;
    }





    public String getPosition_337R() {
        return this.position_337R;
    }

    public void setPosition_337R(String position_337R) {
        this.position_337R = position_337R;
    }



 /**
  * @return
  * @hibernate.property column="presentation_314"
  */
    public Integer getPresentation_314() {
        return this.presentation_314;
    }

    public void setPresentation_314(Integer presentation_314) {
        this.presentation_314 = presentation_314;
    }



    public String getPresentation_314R() {
        return this.presentation_314R;
    }

    public void setPresentation_314R(String presentation_314R) {
        this.presentation_314R = presentation_314R;
    }





    public String getEngaged_234R() {
        return this.engaged_234R;
    }

    public void setEngaged_234R(String engaged_234R) {
        this.engaged_234R = engaged_234R;
    }



 /**
  * @return
  * @hibernate.property column="descent_315"
  */
    public Integer getDescent_315() {
        return this.descent_315;
    }

    public void setDescent_315(Integer descent_315) {
        this.descent_315 = descent_315;
    }



    public String getDescent_315R() {
        return this.descent_315R;
    }

    public void setDescent_315R(String descent_315R) {
        this.descent_315R = descent_315R;
    }



 /**
  * @return
  * @hibernate.property column="oedema_231"
  */
    public Integer getOedema_231() {
        return this.oedema_231;
    }

    public void setOedema_231(Integer oedema_231) {
        this.oedema_231 = oedema_231;
    }



    public String getOedema_231R() {
        return this.oedema_231R;
    }

    public void setOedema_231R(String oedema_231R) {
        this.oedema_231R = oedema_231R;
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
  * @hibernate.property column="foetal_heart_rhythm_229"
  */
    public Integer getFoetal_heart_rhythm_229() {
        return this.foetal_heart_rhythm_229;
    }

    public void setFoetal_heart_rhythm_229(Integer foetal_heart_rhythm_229) {
        this.foetal_heart_rhythm_229 = foetal_heart_rhythm_229;
    }



    public String getFoetal_heart_rhythm_229R() {
        return this.foetal_heart_rhythm_229R;
    }

    public void setFoetal_heart_rhythm_229R(String foetal_heart_rhythm_229R) {
        this.foetal_heart_rhythm_229R = foetal_heart_rhythm_229R;
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
  * @hibernate.property column="weight_228"
  */
    public Float getWeight_228() {
        return this.weight_228;
    }

    public void setWeight_228(Float weight_228) {
        this.weight_228 = weight_228;
    }



    public String getWeight_228R() {
        return this.weight_228R;
    }

    public void setWeight_228R(String weight_228R) {
        this.weight_228R = weight_228R;
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
  * @hibernate.property column="pallor_193"
  */
    public Integer getPallor_193() {
        return this.pallor_193;
    }

    public void setPallor_193(Integer pallor_193) {
        this.pallor_193 = pallor_193;
    }



    public String getPallor_193R() {
        return this.pallor_193R;
    }

    public void setPallor_193R(String pallor_193R) {
        this.pallor_193R = pallor_193R;
    }



 /**
  * @return
  * @hibernate.property column="deworming"
  */
    public Byte getDeworming() {
        return this.deworming;
    }

    public void setDeworming(Byte deworming) {
        this.deworming = deworming;
    }



    public String getDewormingR() {
        return this.dewormingR;
    }

    public void setDewormingR(String dewormingR) {
        this.dewormingR = dewormingR;
    }



 /**
  * @return
  * @hibernate.property column="folate"
  */
    public Byte getFolate() {
        return this.folate;
    }

    public void setFolate(Byte folate) {
        this.folate = folate;
    }



    public String getFolateR() {
        return this.folateR;
    }

    public void setFolateR(String folateR) {
        this.folateR = folateR;
    }



 /**
  * @return
  * @hibernate.property column="iron"
  */
    public Byte getIron() {
        return this.iron;
    }

    public void setIron(Byte iron) {
        this.iron = iron;
    }



    public String getIronR() {
        return this.ironR;
    }

    public void setIronR(String ironR) {
        this.ironR = ironR;
    }



 /**
  * @return
  * @hibernate.property column="malaria_sp_dosage"
  */
    public Integer getMalaria_sp_dosage() {
        return this.malaria_sp_dosage;
    }

    public void setMalaria_sp_dosage(Integer malaria_sp_dosage) {
        this.malaria_sp_dosage = malaria_sp_dosage;
    }



    public String getMalaria_sp_dosageR() {
        return this.malaria_sp_dosageR;
    }

    public void setMalaria_sp_dosageR(String malaria_sp_dosageR) {
        this.malaria_sp_dosageR = malaria_sp_dosageR;
    }



 /**
  * @return
  * @hibernate.property column="date_next_appt"
  */
    public Date getDate_next_appt() {
        return this.date_next_appt;
    }

    public void setDate_next_appt(Date date_next_appt) {
        this.date_next_appt = date_next_appt;
    }



    public String getDate_next_apptR() {
        return this.date_next_apptR;
    }

    public void setDate_next_apptR(String date_next_apptR) {
        this.date_next_apptR = date_next_apptR;
    }



 /**
  * @return
  * @hibernate.property column="is_problem"
  */
    public Boolean getIs_problem() {
        return this.is_problem;
    }

    public void setIs_problem(Boolean is_problem) {
        this.is_problem = is_problem;
    }



    public String getIs_problemR() {
        return this.is_problemR;
    }

    public void setIs_problemR(String is_problemR) {
        this.is_problemR = is_problemR;
    }



}
