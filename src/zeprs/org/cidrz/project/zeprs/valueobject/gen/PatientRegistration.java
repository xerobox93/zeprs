package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean PatientRegistration generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Patient Registration and Identification
 *         Form Id: 1
 */

/**
 * @hibernate.joined-subclass table="patientregistration"
 * @hibernate.joined-subclass-key column="id"
 */
public class PatientRegistration extends EncounterData {

private String field6;	//surname_6
private String field7;	//forenames_7
private Integer field490;	//sex_490
private String field9;	//nrc_no_9
private String field1134;	//obstetric_record_number_1134
private String field2145;	//alternate_id
private String field1971;	//firm
private Integer field2053;	//uth_referral_type
private Byte field2144;	//disable_lab_import
private String field13;	//district_pat_13
private String field1511;	//new_patient_site_id
private String field1513;	//patient_id_number
private Date field17;	//birth_date_17
private Integer field1135;	//age_at_first_attendence_1135
private Integer field11;	//education_st_11
private Integer field10;	//marital_stat_10
private String field19;	//residential_19
private String field20;	//residential_20
private String field39;	//nearby_place_worship_39
private String field2126;	//phone
private Integer field12;	//occupation_12
private String field1924;	//occupation_other
private Integer field1239;	//religion_1239
private String field1240;	//religion_other_1240
private String field24;	//surname_p_father_24
private String field25;	//forenames_p_father_25
private String field26;	//surname_husband_26
private String field27;	//forenames_husband_27
private Integer field28;	//occupation_husband_28
private String field32;	//tel_no_husband_32
private String field33;	//surname_guardian_33
private String field34;	//forenames_guardian_34
private String field35;	//surname_emerg_contact_35
private String field36;	//forenames_emerg_contact_36
private String field37;	//address_emerg_contact_37
private String field38;	//tel_no_emerg_contact_38


 /**
  * @return
  * @hibernate.property column="surname_6"
  */
    public String getField6() {
        return this.field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }





 /**
  * @return
  * @hibernate.property column="forenames_7"
  */
    public String getField7() {
        return this.field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }





 /**
  * @return
  * @hibernate.property column="sex_490"
  */
    public Integer getField490() {
        return this.field490;
    }

    public void setField490(Integer field490) {
        this.field490 = field490;
    }





 /**
  * @return
  * @hibernate.property column="nrc_no_9"
  */
    public String getField9() {
        return this.field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }





 /**
  * @return
  * @hibernate.property column="obstetric_record_number_1134"
  */
    public String getField1134() {
        return this.field1134;
    }

    public void setField1134(String field1134) {
        this.field1134 = field1134;
    }





 /**
  * @return
  * @hibernate.property column="alternate_id"
  */
    public String getField2145() {
        return this.field2145;
    }

    public void setField2145(String field2145) {
        this.field2145 = field2145;
    }





 /**
  * @return
  * @hibernate.property column="firm"
  */
    public String getField1971() {
        return this.field1971;
    }

    public void setField1971(String field1971) {
        this.field1971 = field1971;
    }





 /**
  * @return
  * @hibernate.property column="uth_referral_type"
  */
    public Integer getField2053() {
        return this.field2053;
    }

    public void setField2053(Integer field2053) {
        this.field2053 = field2053;
    }





 /**
  * @return
  * @hibernate.property column="disable_lab_import"
  */
    public Byte getField2144() {
        return this.field2144;
    }

    public void setField2144(Byte field2144) {
        this.field2144 = field2144;
    }





 /**
  * @return
  * @hibernate.property column="district_pat_13"
  */
    public String getField13() {
        return this.field13;
    }

    public void setField13(String field13) {
        this.field13 = field13;
    }





 /**
  * @return
  * @hibernate.property column="new_patient_site_id"
  */
    public String getField1511() {
        return this.field1511;
    }

    public void setField1511(String field1511) {
        this.field1511 = field1511;
    }





 /**
  * @return
  * @hibernate.property column="patient_id_number"
  */
    public String getField1513() {
        return this.field1513;
    }

    public void setField1513(String field1513) {
        this.field1513 = field1513;
    }





 /**
  * @return
  * @hibernate.property column="birth_date_17"
  */
    public Date getField17() {
        return this.field17;
    }

    public void setField17(Date field17) {
        this.field17 = field17;
    }





 /**
  * @return
  * @hibernate.property column="age_at_first_attendence_1135"
  */
    public Integer getField1135() {
        return this.field1135;
    }

    public void setField1135(Integer field1135) {
        this.field1135 = field1135;
    }





 /**
  * @return
  * @hibernate.property column="education_st_11"
  */
    public Integer getField11() {
        return this.field11;
    }

    public void setField11(Integer field11) {
        this.field11 = field11;
    }





 /**
  * @return
  * @hibernate.property column="marital_stat_10"
  */
    public Integer getField10() {
        return this.field10;
    }

    public void setField10(Integer field10) {
        this.field10 = field10;
    }





 /**
  * @return
  * @hibernate.property column="residential_19"
  */
    public String getField19() {
        return this.field19;
    }

    public void setField19(String field19) {
        this.field19 = field19;
    }





 /**
  * @return
  * @hibernate.property column="residential_20"
  */
    public String getField20() {
        return this.field20;
    }

    public void setField20(String field20) {
        this.field20 = field20;
    }





 /**
  * @return
  * @hibernate.property column="nearby_place_worship_39"
  */
    public String getField39() {
        return this.field39;
    }

    public void setField39(String field39) {
        this.field39 = field39;
    }





 /**
  * @return
  * @hibernate.property column="phone"
  */
    public String getField2126() {
        return this.field2126;
    }

    public void setField2126(String field2126) {
        this.field2126 = field2126;
    }





 /**
  * @return
  * @hibernate.property column="occupation_12"
  */
    public Integer getField12() {
        return this.field12;
    }

    public void setField12(Integer field12) {
        this.field12 = field12;
    }





 /**
  * @return
  * @hibernate.property column="occupation_other"
  */
    public String getField1924() {
        return this.field1924;
    }

    public void setField1924(String field1924) {
        this.field1924 = field1924;
    }





 /**
  * @return
  * @hibernate.property column="religion_1239"
  */
    public Integer getField1239() {
        return this.field1239;
    }

    public void setField1239(Integer field1239) {
        this.field1239 = field1239;
    }





 /**
  * @return
  * @hibernate.property column="religion_other_1240"
  */
    public String getField1240() {
        return this.field1240;
    }

    public void setField1240(String field1240) {
        this.field1240 = field1240;
    }





 /**
  * @return
  * @hibernate.property column="surname_p_father_24"
  */
    public String getField24() {
        return this.field24;
    }

    public void setField24(String field24) {
        this.field24 = field24;
    }





 /**
  * @return
  * @hibernate.property column="forenames_p_father_25"
  */
    public String getField25() {
        return this.field25;
    }

    public void setField25(String field25) {
        this.field25 = field25;
    }





 /**
  * @return
  * @hibernate.property column="surname_husband_26"
  */
    public String getField26() {
        return this.field26;
    }

    public void setField26(String field26) {
        this.field26 = field26;
    }





 /**
  * @return
  * @hibernate.property column="forenames_husband_27"
  */
    public String getField27() {
        return this.field27;
    }

    public void setField27(String field27) {
        this.field27 = field27;
    }





 /**
  * @return
  * @hibernate.property column="occupation_husband_28"
  */
    public Integer getField28() {
        return this.field28;
    }

    public void setField28(Integer field28) {
        this.field28 = field28;
    }





 /**
  * @return
  * @hibernate.property column="tel_no_husband_32"
  */
    public String getField32() {
        return this.field32;
    }

    public void setField32(String field32) {
        this.field32 = field32;
    }





 /**
  * @return
  * @hibernate.property column="surname_guardian_33"
  */
    public String getField33() {
        return this.field33;
    }

    public void setField33(String field33) {
        this.field33 = field33;
    }





 /**
  * @return
  * @hibernate.property column="forenames_guardian_34"
  */
    public String getField34() {
        return this.field34;
    }

    public void setField34(String field34) {
        this.field34 = field34;
    }





 /**
  * @return
  * @hibernate.property column="surname_emerg_contact_35"
  */
    public String getField35() {
        return this.field35;
    }

    public void setField35(String field35) {
        this.field35 = field35;
    }





 /**
  * @return
  * @hibernate.property column="forenames_emerg_contact_36"
  */
    public String getField36() {
        return this.field36;
    }

    public void setField36(String field36) {
        this.field36 = field36;
    }





 /**
  * @return
  * @hibernate.property column="address_emerg_contact_37"
  */
    public String getField37() {
        return this.field37;
    }

    public void setField37(String field37) {
        this.field37 = field37;
    }





 /**
  * @return
  * @hibernate.property column="tel_no_emerg_contact_38"
  */
    public String getField38() {
        return this.field38;
    }

    public void setField38(String field38) {
        this.field38 = field38;
    }





}
