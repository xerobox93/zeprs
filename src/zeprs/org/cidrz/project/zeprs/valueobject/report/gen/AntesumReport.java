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
 * JavaBean AntesumReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Antenatal Hospitalization Summary
 *         Form Id: 63
 */

/**
 * @hibernate.joined-subclass table="antesum"
 * @hibernate.joined-subclass-key column="id"
 */
public class AntesumReport extends EncounterData {

private transient Date date_of_discharge_1268;	//date_of_discharge_1268
private String date_of_discharge_1268R;
private transient Integer hospital_ward_1269;	//hospital_ward_1269
private String hospital_ward_1269R;
private transient Boolean anaemia;	//anaemia
private String anaemiaR;
private transient Integer anaemia_measurement;	//anaemia_measurement
private String anaemia_measurementR;
private transient Boolean cardiac_disease;	//cardiac_disease
private String cardiac_diseaseR;
private transient Boolean diabetes_gestational;	//diabetes_gestational
private String diabetes_gestationalR;
private transient Boolean diabetes_pregestational;	//diabetes_pregestational
private String diabetes_pregestationalR;
private transient Boolean dysentary;	//dysentary
private String dysentaryR;
private transient Boolean epilepsy;	//epilepsy
private String epilepsyR;
private transient Boolean gastroenteritis;	//gastroenteritis
private String gastroenteritisR;
private transient Boolean hemoglobinopathy_sickle;	//hemoglobinopathy_sickle
private String hemoglobinopathy_sickleR;
private transient Boolean hemoglobinopathy_thallasemia;	//hemoglobinopathy_thallasemia
private String hemoglobinopathy_thallasemiaR;
private transient Boolean hepatitis;	//hepatitis
private String hepatitisR;
private transient Boolean malaria_suspected;	//malaria_suspected
private String malaria_suspectedR;
private transient Boolean missed_abortion;	//missed_abortion
private String missed_abortionR;
private transient Boolean polyarthritis;	//polyarthritis
private String polyarthritisR;
private transient Boolean psychosis;	//psychosis
private String psychosisR;
private transient Boolean tuberculosis;	//tuberculosis
private String tuberculosisR;
private transient Boolean preterm_labour;	//preterm_labour
private String preterm_labourR;
private transient Boolean prom;	//prom
private String promR;
private transient Boolean breech_presentation;	//breech_presentation
private String breech_presentationR;
private transient Byte aph;	//aph
private String aphR;
private transient Boolean uti;	//uti
private String utiR;
private transient Boolean antepartum_hemhorrhage;	//antepartum_hemhorrhage
private String antepartum_hemhorrhageR;
private transient Boolean draining;	//draining
private String drainingR;
private transient Boolean malpresentations;	//malpresentations
private String malpresentationsR;
private transient Boolean previous_c_s;	//previous_c_s
private String previous_c_sR;
private transient Boolean wrong_dates;	//wrong_dates
private String wrong_datesR;
private transient Integer hypertensive_disorders;	//Hypertensive_disorders
private String hypertensive_disordersR;
private transient Integer miscarriage;	//miscarriage
private String miscarriageR;
private transient String diag_other;	//diag_other
private String diag_otherR;
private transient Integer drug_1_1136;	//drug_1_1136
private String drug_1_1136R;
private transient Integer drug_2_1137;	//drug_2_1137
private String drug_2_1137R;
private transient Integer drug_3_1138;	//drug_3_1138
private String drug_3_1138R;
private transient Integer drug_4_1139;	//drug_4_1139
private String drug_4_1139R;
private transient Integer drug_5_1140;	//drug_5_1140
private String drug_5_1140R;
private transient Integer drug_6_1141;	//drug_6_1141
private String drug_6_1141R;
private transient Integer drug_7_1142;	//drug_7_1142
private String drug_7_1142R;
private transient Integer drug_8_1143;	//drug_8_1143
private String drug_8_1143R;
private transient Integer drug_9_1144;	//drug_9_1144
private String drug_9_1144R;
private transient Integer drug_10_1145;	//drug_10_1145
private String drug_10_1145R;
private transient String med_treatments_other_desc;	//med_treatments_other_desc
private String med_treatments_other_descR;
private transient Boolean mva;	//mva
private String mvaR;
private transient Boolean dilatation_and_curettage;	//dilatation_and_curettage
private String dilatation_and_curettageR;
private transient Boolean laparotomy;	//laparotomy
private String laparotomyR;
private transient Boolean hysterectomy;	//hysterectomy
private String hysterectomyR;
private transient Boolean salpingostomy;	//salpingostomy
private String salpingostomyR;
private transient Boolean cervical_suture;	//cervical_suture
private String cervical_sutureR;
private transient String surg_treat_other_desc;	//surg_treat_other_desc
private String surg_treat_other_descR;
private transient String medications_discharge;	//medications_discharge
private String medications_dischargeR;
private transient Float temperature_266;	//temperature_266
private String temperature_266R;
private transient Integer pulse_171;	//pulse_171
private String pulse_171R;
private transient Integer respiratory_system_167;	//respiratory_system_167
private String respiratory_system_167R;
private transient String respiratory_system_other;	//respiratory_system_other
private String respiratory_system_otherR;
private transient Integer respiration_rate_269;	//respiration_rate_269
private String respiration_rate_269R;
private transient Integer bp_systolic_224;	//bp_systolic_224
private String bp_systolic_224R;
private transient Integer bp_diastolic_225;	//bp_diastolic_225
private String bp_diastolic_225R;
private transient Date scheduled_followup_1293;	//scheduled_followup_1293
private String scheduled_followup_1293R;
private transient String place_of_next_visit_1213;	//place_of_next_visit_1213
private String place_of_next_visit_1213R;
private transient Integer referring_encounter_id;	//referring_encounter_id
private String referring_encounter_idR;


 /**
  * @return
  * @hibernate.property column="date_of_discharge_1268"
  */
    public Date getDate_of_discharge_1268() {
        return this.date_of_discharge_1268;
    }

    public void setDate_of_discharge_1268(Date date_of_discharge_1268) {
        this.date_of_discharge_1268 = date_of_discharge_1268;
    }



    public String getDate_of_discharge_1268R() {
        return this.date_of_discharge_1268R;
    }

    public void setDate_of_discharge_1268R(String date_of_discharge_1268R) {
        this.date_of_discharge_1268R = date_of_discharge_1268R;
    }



 /**
  * @return
  * @hibernate.property column="hospital_ward_1269"
  */
    public Integer getHospital_ward_1269() {
        return this.hospital_ward_1269;
    }

    public void setHospital_ward_1269(Integer hospital_ward_1269) {
        this.hospital_ward_1269 = hospital_ward_1269;
    }



    public String getHospital_ward_1269R() {
        return this.hospital_ward_1269R;
    }

    public void setHospital_ward_1269R(String hospital_ward_1269R) {
        this.hospital_ward_1269R = hospital_ward_1269R;
    }



 /**
  * @return
  * @hibernate.property column="anaemia"
  */
    public Boolean getAnaemia() {
        return this.anaemia;
    }

    public void setAnaemia(Boolean anaemia) {
        this.anaemia = anaemia;
    }



    public String getAnaemiaR() {
        return this.anaemiaR;
    }

    public void setAnaemiaR(String anaemiaR) {
        this.anaemiaR = anaemiaR;
    }



 /**
  * @return
  * @hibernate.property column="anaemia_measurement"
  */
    public Integer getAnaemia_measurement() {
        return this.anaemia_measurement;
    }

    public void setAnaemia_measurement(Integer anaemia_measurement) {
        this.anaemia_measurement = anaemia_measurement;
    }



    public String getAnaemia_measurementR() {
        return this.anaemia_measurementR;
    }

    public void setAnaemia_measurementR(String anaemia_measurementR) {
        this.anaemia_measurementR = anaemia_measurementR;
    }



 /**
  * @return
  * @hibernate.property column="cardiac_disease"
  */
    public Boolean getCardiac_disease() {
        return this.cardiac_disease;
    }

    public void setCardiac_disease(Boolean cardiac_disease) {
        this.cardiac_disease = cardiac_disease;
    }



    public String getCardiac_diseaseR() {
        return this.cardiac_diseaseR;
    }

    public void setCardiac_diseaseR(String cardiac_diseaseR) {
        this.cardiac_diseaseR = cardiac_diseaseR;
    }



 /**
  * @return
  * @hibernate.property column="diabetes_gestational"
  */
    public Boolean getDiabetes_gestational() {
        return this.diabetes_gestational;
    }

    public void setDiabetes_gestational(Boolean diabetes_gestational) {
        this.diabetes_gestational = diabetes_gestational;
    }



    public String getDiabetes_gestationalR() {
        return this.diabetes_gestationalR;
    }

    public void setDiabetes_gestationalR(String diabetes_gestationalR) {
        this.diabetes_gestationalR = diabetes_gestationalR;
    }



 /**
  * @return
  * @hibernate.property column="diabetes_pregestational"
  */
    public Boolean getDiabetes_pregestational() {
        return this.diabetes_pregestational;
    }

    public void setDiabetes_pregestational(Boolean diabetes_pregestational) {
        this.diabetes_pregestational = diabetes_pregestational;
    }



    public String getDiabetes_pregestationalR() {
        return this.diabetes_pregestationalR;
    }

    public void setDiabetes_pregestationalR(String diabetes_pregestationalR) {
        this.diabetes_pregestationalR = diabetes_pregestationalR;
    }



 /**
  * @return
  * @hibernate.property column="dysentary"
  */
    public Boolean getDysentary() {
        return this.dysentary;
    }

    public void setDysentary(Boolean dysentary) {
        this.dysentary = dysentary;
    }



    public String getDysentaryR() {
        return this.dysentaryR;
    }

    public void setDysentaryR(String dysentaryR) {
        this.dysentaryR = dysentaryR;
    }



 /**
  * @return
  * @hibernate.property column="epilepsy"
  */
    public Boolean getEpilepsy() {
        return this.epilepsy;
    }

    public void setEpilepsy(Boolean epilepsy) {
        this.epilepsy = epilepsy;
    }



    public String getEpilepsyR() {
        return this.epilepsyR;
    }

    public void setEpilepsyR(String epilepsyR) {
        this.epilepsyR = epilepsyR;
    }



 /**
  * @return
  * @hibernate.property column="gastroenteritis"
  */
    public Boolean getGastroenteritis() {
        return this.gastroenteritis;
    }

    public void setGastroenteritis(Boolean gastroenteritis) {
        this.gastroenteritis = gastroenteritis;
    }



    public String getGastroenteritisR() {
        return this.gastroenteritisR;
    }

    public void setGastroenteritisR(String gastroenteritisR) {
        this.gastroenteritisR = gastroenteritisR;
    }



 /**
  * @return
  * @hibernate.property column="hemoglobinopathy_sickle"
  */
    public Boolean getHemoglobinopathy_sickle() {
        return this.hemoglobinopathy_sickle;
    }

    public void setHemoglobinopathy_sickle(Boolean hemoglobinopathy_sickle) {
        this.hemoglobinopathy_sickle = hemoglobinopathy_sickle;
    }



    public String getHemoglobinopathy_sickleR() {
        return this.hemoglobinopathy_sickleR;
    }

    public void setHemoglobinopathy_sickleR(String hemoglobinopathy_sickleR) {
        this.hemoglobinopathy_sickleR = hemoglobinopathy_sickleR;
    }



 /**
  * @return
  * @hibernate.property column="hemoglobinopathy_thallasemia"
  */
    public Boolean getHemoglobinopathy_thallasemia() {
        return this.hemoglobinopathy_thallasemia;
    }

    public void setHemoglobinopathy_thallasemia(Boolean hemoglobinopathy_thallasemia) {
        this.hemoglobinopathy_thallasemia = hemoglobinopathy_thallasemia;
    }



    public String getHemoglobinopathy_thallasemiaR() {
        return this.hemoglobinopathy_thallasemiaR;
    }

    public void setHemoglobinopathy_thallasemiaR(String hemoglobinopathy_thallasemiaR) {
        this.hemoglobinopathy_thallasemiaR = hemoglobinopathy_thallasemiaR;
    }



 /**
  * @return
  * @hibernate.property column="hepatitis"
  */
    public Boolean getHepatitis() {
        return this.hepatitis;
    }

    public void setHepatitis(Boolean hepatitis) {
        this.hepatitis = hepatitis;
    }



    public String getHepatitisR() {
        return this.hepatitisR;
    }

    public void setHepatitisR(String hepatitisR) {
        this.hepatitisR = hepatitisR;
    }



 /**
  * @return
  * @hibernate.property column="malaria_suspected"
  */
    public Boolean getMalaria_suspected() {
        return this.malaria_suspected;
    }

    public void setMalaria_suspected(Boolean malaria_suspected) {
        this.malaria_suspected = malaria_suspected;
    }



    public String getMalaria_suspectedR() {
        return this.malaria_suspectedR;
    }

    public void setMalaria_suspectedR(String malaria_suspectedR) {
        this.malaria_suspectedR = malaria_suspectedR;
    }



 /**
  * @return
  * @hibernate.property column="missed_abortion"
  */
    public Boolean getMissed_abortion() {
        return this.missed_abortion;
    }

    public void setMissed_abortion(Boolean missed_abortion) {
        this.missed_abortion = missed_abortion;
    }



    public String getMissed_abortionR() {
        return this.missed_abortionR;
    }

    public void setMissed_abortionR(String missed_abortionR) {
        this.missed_abortionR = missed_abortionR;
    }



 /**
  * @return
  * @hibernate.property column="polyarthritis"
  */
    public Boolean getPolyarthritis() {
        return this.polyarthritis;
    }

    public void setPolyarthritis(Boolean polyarthritis) {
        this.polyarthritis = polyarthritis;
    }



    public String getPolyarthritisR() {
        return this.polyarthritisR;
    }

    public void setPolyarthritisR(String polyarthritisR) {
        this.polyarthritisR = polyarthritisR;
    }



 /**
  * @return
  * @hibernate.property column="psychosis"
  */
    public Boolean getPsychosis() {
        return this.psychosis;
    }

    public void setPsychosis(Boolean psychosis) {
        this.psychosis = psychosis;
    }



    public String getPsychosisR() {
        return this.psychosisR;
    }

    public void setPsychosisR(String psychosisR) {
        this.psychosisR = psychosisR;
    }



 /**
  * @return
  * @hibernate.property column="tuberculosis"
  */
    public Boolean getTuberculosis() {
        return this.tuberculosis;
    }

    public void setTuberculosis(Boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }



    public String getTuberculosisR() {
        return this.tuberculosisR;
    }

    public void setTuberculosisR(String tuberculosisR) {
        this.tuberculosisR = tuberculosisR;
    }



 /**
  * @return
  * @hibernate.property column="preterm_labour"
  */
    public Boolean getPreterm_labour() {
        return this.preterm_labour;
    }

    public void setPreterm_labour(Boolean preterm_labour) {
        this.preterm_labour = preterm_labour;
    }



    public String getPreterm_labourR() {
        return this.preterm_labourR;
    }

    public void setPreterm_labourR(String preterm_labourR) {
        this.preterm_labourR = preterm_labourR;
    }



 /**
  * @return
  * @hibernate.property column="prom"
  */
    public Boolean getProm() {
        return this.prom;
    }

    public void setProm(Boolean prom) {
        this.prom = prom;
    }



    public String getPromR() {
        return this.promR;
    }

    public void setPromR(String promR) {
        this.promR = promR;
    }



 /**
  * @return
  * @hibernate.property column="breech_presentation"
  */
    public Boolean getBreech_presentation() {
        return this.breech_presentation;
    }

    public void setBreech_presentation(Boolean breech_presentation) {
        this.breech_presentation = breech_presentation;
    }



    public String getBreech_presentationR() {
        return this.breech_presentationR;
    }

    public void setBreech_presentationR(String breech_presentationR) {
        this.breech_presentationR = breech_presentationR;
    }



 /**
  * @return
  * @hibernate.property column="aph"
  */
    public Byte getAph() {
        return this.aph;
    }

    public void setAph(Byte aph) {
        this.aph = aph;
    }



    public String getAphR() {
        return this.aphR;
    }

    public void setAphR(String aphR) {
        this.aphR = aphR;
    }



 /**
  * @return
  * @hibernate.property column="uti"
  */
    public Boolean getUti() {
        return this.uti;
    }

    public void setUti(Boolean uti) {
        this.uti = uti;
    }



    public String getUtiR() {
        return this.utiR;
    }

    public void setUtiR(String utiR) {
        this.utiR = utiR;
    }



 /**
  * @return
  * @hibernate.property column="antepartum_hemhorrhage"
  */
    public Boolean getAntepartum_hemhorrhage() {
        return this.antepartum_hemhorrhage;
    }

    public void setAntepartum_hemhorrhage(Boolean antepartum_hemhorrhage) {
        this.antepartum_hemhorrhage = antepartum_hemhorrhage;
    }



    public String getAntepartum_hemhorrhageR() {
        return this.antepartum_hemhorrhageR;
    }

    public void setAntepartum_hemhorrhageR(String antepartum_hemhorrhageR) {
        this.antepartum_hemhorrhageR = antepartum_hemhorrhageR;
    }



 /**
  * @return
  * @hibernate.property column="draining"
  */
    public Boolean getDraining() {
        return this.draining;
    }

    public void setDraining(Boolean draining) {
        this.draining = draining;
    }



    public String getDrainingR() {
        return this.drainingR;
    }

    public void setDrainingR(String drainingR) {
        this.drainingR = drainingR;
    }



 /**
  * @return
  * @hibernate.property column="malpresentations"
  */
    public Boolean getMalpresentations() {
        return this.malpresentations;
    }

    public void setMalpresentations(Boolean malpresentations) {
        this.malpresentations = malpresentations;
    }



    public String getMalpresentationsR() {
        return this.malpresentationsR;
    }

    public void setMalpresentationsR(String malpresentationsR) {
        this.malpresentationsR = malpresentationsR;
    }



 /**
  * @return
  * @hibernate.property column="previous_c_s"
  */
    public Boolean getPrevious_c_s() {
        return this.previous_c_s;
    }

    public void setPrevious_c_s(Boolean previous_c_s) {
        this.previous_c_s = previous_c_s;
    }



    public String getPrevious_c_sR() {
        return this.previous_c_sR;
    }

    public void setPrevious_c_sR(String previous_c_sR) {
        this.previous_c_sR = previous_c_sR;
    }



 /**
  * @return
  * @hibernate.property column="wrong_dates"
  */
    public Boolean getWrong_dates() {
        return this.wrong_dates;
    }

    public void setWrong_dates(Boolean wrong_dates) {
        this.wrong_dates = wrong_dates;
    }



    public String getWrong_datesR() {
        return this.wrong_datesR;
    }

    public void setWrong_datesR(String wrong_datesR) {
        this.wrong_datesR = wrong_datesR;
    }



 /**
  * @return
  * @hibernate.property column="Hypertensive_disorders"
  */
    public Integer getHypertensive_disorders() {
        return this.hypertensive_disorders;
    }

    public void setHypertensive_disorders(Integer hypertensive_disorders) {
        this.hypertensive_disorders = hypertensive_disorders;
    }



    public String getHypertensive_disordersR() {
        return this.hypertensive_disordersR;
    }

    public void setHypertensive_disordersR(String hypertensive_disordersR) {
        this.hypertensive_disordersR = hypertensive_disordersR;
    }



 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getMiscarriage() {
        return this.miscarriage;
    }

    public void setMiscarriage(Integer miscarriage) {
        this.miscarriage = miscarriage;
    }



    public String getMiscarriageR() {
        return this.miscarriageR;
    }

    public void setMiscarriageR(String miscarriageR) {
        this.miscarriageR = miscarriageR;
    }



 /**
  * @return
  * @hibernate.property column="diag_other" type="text"
  */
    public String getDiag_other() {
        return this.diag_other;
    }

    public void setDiag_other(String diag_other) {
        this.diag_other = diag_other;
    }



    public String getDiag_otherR() {
        return this.diag_otherR;
    }

    public void setDiag_otherR(String diag_otherR) {
        this.diag_otherR = diag_otherR;
    }



 /**
  * @return
  * @hibernate.property column="drug_1_1136"
  */
    public Integer getDrug_1_1136() {
        return this.drug_1_1136;
    }

    public void setDrug_1_1136(Integer drug_1_1136) {
        this.drug_1_1136 = drug_1_1136;
    }



    public String getDrug_1_1136R() {
        return this.drug_1_1136R;
    }

    public void setDrug_1_1136R(String drug_1_1136R) {
        this.drug_1_1136R = drug_1_1136R;
    }



 /**
  * @return
  * @hibernate.property column="drug_2_1137"
  */
    public Integer getDrug_2_1137() {
        return this.drug_2_1137;
    }

    public void setDrug_2_1137(Integer drug_2_1137) {
        this.drug_2_1137 = drug_2_1137;
    }



    public String getDrug_2_1137R() {
        return this.drug_2_1137R;
    }

    public void setDrug_2_1137R(String drug_2_1137R) {
        this.drug_2_1137R = drug_2_1137R;
    }



 /**
  * @return
  * @hibernate.property column="drug_3_1138"
  */
    public Integer getDrug_3_1138() {
        return this.drug_3_1138;
    }

    public void setDrug_3_1138(Integer drug_3_1138) {
        this.drug_3_1138 = drug_3_1138;
    }



    public String getDrug_3_1138R() {
        return this.drug_3_1138R;
    }

    public void setDrug_3_1138R(String drug_3_1138R) {
        this.drug_3_1138R = drug_3_1138R;
    }



 /**
  * @return
  * @hibernate.property column="drug_4_1139"
  */
    public Integer getDrug_4_1139() {
        return this.drug_4_1139;
    }

    public void setDrug_4_1139(Integer drug_4_1139) {
        this.drug_4_1139 = drug_4_1139;
    }



    public String getDrug_4_1139R() {
        return this.drug_4_1139R;
    }

    public void setDrug_4_1139R(String drug_4_1139R) {
        this.drug_4_1139R = drug_4_1139R;
    }



 /**
  * @return
  * @hibernate.property column="drug_5_1140"
  */
    public Integer getDrug_5_1140() {
        return this.drug_5_1140;
    }

    public void setDrug_5_1140(Integer drug_5_1140) {
        this.drug_5_1140 = drug_5_1140;
    }



    public String getDrug_5_1140R() {
        return this.drug_5_1140R;
    }

    public void setDrug_5_1140R(String drug_5_1140R) {
        this.drug_5_1140R = drug_5_1140R;
    }



 /**
  * @return
  * @hibernate.property column="drug_6_1141"
  */
    public Integer getDrug_6_1141() {
        return this.drug_6_1141;
    }

    public void setDrug_6_1141(Integer drug_6_1141) {
        this.drug_6_1141 = drug_6_1141;
    }



    public String getDrug_6_1141R() {
        return this.drug_6_1141R;
    }

    public void setDrug_6_1141R(String drug_6_1141R) {
        this.drug_6_1141R = drug_6_1141R;
    }



 /**
  * @return
  * @hibernate.property column="drug_7_1142"
  */
    public Integer getDrug_7_1142() {
        return this.drug_7_1142;
    }

    public void setDrug_7_1142(Integer drug_7_1142) {
        this.drug_7_1142 = drug_7_1142;
    }



    public String getDrug_7_1142R() {
        return this.drug_7_1142R;
    }

    public void setDrug_7_1142R(String drug_7_1142R) {
        this.drug_7_1142R = drug_7_1142R;
    }



 /**
  * @return
  * @hibernate.property column="drug_8_1143"
  */
    public Integer getDrug_8_1143() {
        return this.drug_8_1143;
    }

    public void setDrug_8_1143(Integer drug_8_1143) {
        this.drug_8_1143 = drug_8_1143;
    }



    public String getDrug_8_1143R() {
        return this.drug_8_1143R;
    }

    public void setDrug_8_1143R(String drug_8_1143R) {
        this.drug_8_1143R = drug_8_1143R;
    }



 /**
  * @return
  * @hibernate.property column="drug_9_1144"
  */
    public Integer getDrug_9_1144() {
        return this.drug_9_1144;
    }

    public void setDrug_9_1144(Integer drug_9_1144) {
        this.drug_9_1144 = drug_9_1144;
    }



    public String getDrug_9_1144R() {
        return this.drug_9_1144R;
    }

    public void setDrug_9_1144R(String drug_9_1144R) {
        this.drug_9_1144R = drug_9_1144R;
    }



 /**
  * @return
  * @hibernate.property column="drug_10_1145"
  */
    public Integer getDrug_10_1145() {
        return this.drug_10_1145;
    }

    public void setDrug_10_1145(Integer drug_10_1145) {
        this.drug_10_1145 = drug_10_1145;
    }



    public String getDrug_10_1145R() {
        return this.drug_10_1145R;
    }

    public void setDrug_10_1145R(String drug_10_1145R) {
        this.drug_10_1145R = drug_10_1145R;
    }



 /**
  * @return
  * @hibernate.property column="med_treatments_other_desc" type="text"
  */
    public String getMed_treatments_other_desc() {
        return this.med_treatments_other_desc;
    }

    public void setMed_treatments_other_desc(String med_treatments_other_desc) {
        this.med_treatments_other_desc = med_treatments_other_desc;
    }



    public String getMed_treatments_other_descR() {
        return this.med_treatments_other_descR;
    }

    public void setMed_treatments_other_descR(String med_treatments_other_descR) {
        this.med_treatments_other_descR = med_treatments_other_descR;
    }



 /**
  * @return
  * @hibernate.property column="mva"
  */
    public Boolean getMva() {
        return this.mva;
    }

    public void setMva(Boolean mva) {
        this.mva = mva;
    }



    public String getMvaR() {
        return this.mvaR;
    }

    public void setMvaR(String mvaR) {
        this.mvaR = mvaR;
    }



 /**
  * @return
  * @hibernate.property column="dilatation_and_curettage"
  */
    public Boolean getDilatation_and_curettage() {
        return this.dilatation_and_curettage;
    }

    public void setDilatation_and_curettage(Boolean dilatation_and_curettage) {
        this.dilatation_and_curettage = dilatation_and_curettage;
    }



    public String getDilatation_and_curettageR() {
        return this.dilatation_and_curettageR;
    }

    public void setDilatation_and_curettageR(String dilatation_and_curettageR) {
        this.dilatation_and_curettageR = dilatation_and_curettageR;
    }



 /**
  * @return
  * @hibernate.property column="laparotomy"
  */
    public Boolean getLaparotomy() {
        return this.laparotomy;
    }

    public void setLaparotomy(Boolean laparotomy) {
        this.laparotomy = laparotomy;
    }



    public String getLaparotomyR() {
        return this.laparotomyR;
    }

    public void setLaparotomyR(String laparotomyR) {
        this.laparotomyR = laparotomyR;
    }



 /**
  * @return
  * @hibernate.property column="hysterectomy"
  */
    public Boolean getHysterectomy() {
        return this.hysterectomy;
    }

    public void setHysterectomy(Boolean hysterectomy) {
        this.hysterectomy = hysterectomy;
    }



    public String getHysterectomyR() {
        return this.hysterectomyR;
    }

    public void setHysterectomyR(String hysterectomyR) {
        this.hysterectomyR = hysterectomyR;
    }



 /**
  * @return
  * @hibernate.property column="salpingostomy"
  */
    public Boolean getSalpingostomy() {
        return this.salpingostomy;
    }

    public void setSalpingostomy(Boolean salpingostomy) {
        this.salpingostomy = salpingostomy;
    }



    public String getSalpingostomyR() {
        return this.salpingostomyR;
    }

    public void setSalpingostomyR(String salpingostomyR) {
        this.salpingostomyR = salpingostomyR;
    }



 /**
  * @return
  * @hibernate.property column="cervical_suture"
  */
    public Boolean getCervical_suture() {
        return this.cervical_suture;
    }

    public void setCervical_suture(Boolean cervical_suture) {
        this.cervical_suture = cervical_suture;
    }



    public String getCervical_sutureR() {
        return this.cervical_sutureR;
    }

    public void setCervical_sutureR(String cervical_sutureR) {
        this.cervical_sutureR = cervical_sutureR;
    }



 /**
  * @return
  * @hibernate.property column="surg_treat_other_desc" type="text"
  */
    public String getSurg_treat_other_desc() {
        return this.surg_treat_other_desc;
    }

    public void setSurg_treat_other_desc(String surg_treat_other_desc) {
        this.surg_treat_other_desc = surg_treat_other_desc;
    }



    public String getSurg_treat_other_descR() {
        return this.surg_treat_other_descR;
    }

    public void setSurg_treat_other_descR(String surg_treat_other_descR) {
        this.surg_treat_other_descR = surg_treat_other_descR;
    }



 /**
  * @return
  * @hibernate.property column="medications_discharge" type="text"
  */
    public String getMedications_discharge() {
        return this.medications_discharge;
    }

    public void setMedications_discharge(String medications_discharge) {
        this.medications_discharge = medications_discharge;
    }



    public String getMedications_dischargeR() {
        return this.medications_dischargeR;
    }

    public void setMedications_dischargeR(String medications_dischargeR) {
        this.medications_dischargeR = medications_dischargeR;
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
  * @hibernate.property column="respiratory_system_167"
  */
    public Integer getRespiratory_system_167() {
        return this.respiratory_system_167;
    }

    public void setRespiratory_system_167(Integer respiratory_system_167) {
        this.respiratory_system_167 = respiratory_system_167;
    }



    public String getRespiratory_system_167R() {
        return this.respiratory_system_167R;
    }

    public void setRespiratory_system_167R(String respiratory_system_167R) {
        this.respiratory_system_167R = respiratory_system_167R;
    }



 /**
  * @return
  * @hibernate.property column="respiratory_system_other" type="text"
  */
    public String getRespiratory_system_other() {
        return this.respiratory_system_other;
    }

    public void setRespiratory_system_other(String respiratory_system_other) {
        this.respiratory_system_other = respiratory_system_other;
    }



    public String getRespiratory_system_otherR() {
        return this.respiratory_system_otherR;
    }

    public void setRespiratory_system_otherR(String respiratory_system_otherR) {
        this.respiratory_system_otherR = respiratory_system_otherR;
    }



 /**
  * @return
  * @hibernate.property column="respiration_rate_269"
  */
    public Integer getRespiration_rate_269() {
        return this.respiration_rate_269;
    }

    public void setRespiration_rate_269(Integer respiration_rate_269) {
        this.respiration_rate_269 = respiration_rate_269;
    }



    public String getRespiration_rate_269R() {
        return this.respiration_rate_269R;
    }

    public void setRespiration_rate_269R(String respiration_rate_269R) {
        this.respiration_rate_269R = respiration_rate_269R;
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
  * @hibernate.property column="scheduled_followup_1293"
  */
    public Date getScheduled_followup_1293() {
        return this.scheduled_followup_1293;
    }

    public void setScheduled_followup_1293(Date scheduled_followup_1293) {
        this.scheduled_followup_1293 = scheduled_followup_1293;
    }



    public String getScheduled_followup_1293R() {
        return this.scheduled_followup_1293R;
    }

    public void setScheduled_followup_1293R(String scheduled_followup_1293R) {
        this.scheduled_followup_1293R = scheduled_followup_1293R;
    }



 /**
  * @return
  * @hibernate.property column="place_of_next_visit_1213"
  */
    public String getPlace_of_next_visit_1213() {
        return this.place_of_next_visit_1213;
    }

    public void setPlace_of_next_visit_1213(String place_of_next_visit_1213) {
        this.place_of_next_visit_1213 = place_of_next_visit_1213;
    }



    public String getPlace_of_next_visit_1213R() {
        return this.place_of_next_visit_1213R;
    }

    public void setPlace_of_next_visit_1213R(String place_of_next_visit_1213R) {
        this.place_of_next_visit_1213R = place_of_next_visit_1213R;
    }



 /**
  * @return
  * @hibernate.property column="referring_encounter_id"
  */
    public Integer getReferring_encounter_id() {
        return this.referring_encounter_id;
    }

    public void setReferring_encounter_id(Integer referring_encounter_id) {
        this.referring_encounter_id = referring_encounter_id;
    }



    public String getReferring_encounter_idR() {
        return this.referring_encounter_idR;
    }

    public void setReferring_encounter_idR(String referring_encounter_idR) {
        this.referring_encounter_idR = referring_encounter_idR;
    }



}
