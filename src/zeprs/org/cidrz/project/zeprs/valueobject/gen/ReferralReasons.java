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
 * JavaBean ReferralReasons generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Reasons for Referral
 *         Form Id: 94
 */

/**
 * @hibernate.joined-subclass table="referral_reasons"
 * @hibernate.joined-subclass-key column="id"
 */
public class ReferralReasons extends EncounterData {

private Integer field1917;	//encounter_id
private Boolean field1261;	//false_labour
private Boolean field1262;	//true_labor
private Boolean field1263;	//rupture_of_membranes
private Boolean field1264;	//intact_membranes
private Boolean field1265;	//preeclamp_hypert_1265
private Boolean field1360;	//premature_labour
private Boolean field1497;	//malaria_diag
private Boolean field1270;	//anaemia
private Boolean field1499;	//high_bp_diag
private Boolean field1500;	//vaginal_bleeding_diag
private Boolean field1501;	//intrauterine_death
private Boolean field1502;	//uti_diag
private Boolean field1503;	//pneumonia_diag
private Boolean field1504;	//tb_diag
private Boolean field1505;	//vaginal_thrush_diag
private Boolean field1506;	//oral_thrush_diag
private Byte field1756;	//eclampsia
private Boolean field1757;	//abruptia_placenta
private Integer field1758;	//miscarriage
private String field1359;	//diag_other
private Boolean field1784;	//broken_episiotomy
private Boolean field1785;	//puerperal_sepsis
private Boolean field1786;	//breast_engorgement
private Boolean field1787;	//secondary_pph
private Boolean field1788;	//mastitis
private Boolean field1789;	//breast_abscess
private Boolean field1809;	//bowel_obstruction
private Boolean field1817;	//indigestion
private Boolean field1810;	//opthalmia_neonatorum
private Boolean field1811;	//dehydration
private Boolean field1812;	//umbilical_infection
private Boolean field1813;	//diarrhoea
private Boolean field1777;	//episiotomy_infection
private Boolean field1775;	//sepsis
private Boolean field1781;	//endometritis


 /**
  * @return
  * @hibernate.property column="encounter_id"
  */
    public Integer getField1917() {
        return this.field1917;
    }

    public void setField1917(Integer field1917) {
        this.field1917 = field1917;
    }





 /**
  * @return
  * @hibernate.property column="false_labour"
  */
    public Boolean getField1261() {
        return this.field1261;
    }

    public void setField1261(Boolean field1261) {
        this.field1261 = field1261;
    }





 /**
  * @return
  * @hibernate.property column="true_labor"
  */
    public Boolean getField1262() {
        return this.field1262;
    }

    public void setField1262(Boolean field1262) {
        this.field1262 = field1262;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes"
  */
    public Boolean getField1263() {
        return this.field1263;
    }

    public void setField1263(Boolean field1263) {
        this.field1263 = field1263;
    }





 /**
  * @return
  * @hibernate.property column="intact_membranes"
  */
    public Boolean getField1264() {
        return this.field1264;
    }

    public void setField1264(Boolean field1264) {
        this.field1264 = field1264;
    }





 /**
  * @return
  * @hibernate.property column="preeclamp_hypert_1265"
  */
    public Boolean getField1265() {
        return this.field1265;
    }

    public void setField1265(Boolean field1265) {
        this.field1265 = field1265;
    }





 /**
  * @return
  * @hibernate.property column="premature_labour"
  */
    public Boolean getField1360() {
        return this.field1360;
    }

    public void setField1360(Boolean field1360) {
        this.field1360 = field1360;
    }





 /**
  * @return
  * @hibernate.property column="malaria_diag"
  */
    public Boolean getField1497() {
        return this.field1497;
    }

    public void setField1497(Boolean field1497) {
        this.field1497 = field1497;
    }





 /**
  * @return
  * @hibernate.property column="anaemia"
  */
    public Boolean getField1270() {
        return this.field1270;
    }

    public void setField1270(Boolean field1270) {
        this.field1270 = field1270;
    }





 /**
  * @return
  * @hibernate.property column="high_bp_diag"
  */
    public Boolean getField1499() {
        return this.field1499;
    }

    public void setField1499(Boolean field1499) {
        this.field1499 = field1499;
    }





 /**
  * @return
  * @hibernate.property column="vaginal_bleeding_diag"
  */
    public Boolean getField1500() {
        return this.field1500;
    }

    public void setField1500(Boolean field1500) {
        this.field1500 = field1500;
    }





 /**
  * @return
  * @hibernate.property column="intrauterine_death"
  */
    public Boolean getField1501() {
        return this.field1501;
    }

    public void setField1501(Boolean field1501) {
        this.field1501 = field1501;
    }





 /**
  * @return
  * @hibernate.property column="uti_diag"
  */
    public Boolean getField1502() {
        return this.field1502;
    }

    public void setField1502(Boolean field1502) {
        this.field1502 = field1502;
    }





 /**
  * @return
  * @hibernate.property column="pneumonia_diag"
  */
    public Boolean getField1503() {
        return this.field1503;
    }

    public void setField1503(Boolean field1503) {
        this.field1503 = field1503;
    }





 /**
  * @return
  * @hibernate.property column="tb_diag"
  */
    public Boolean getField1504() {
        return this.field1504;
    }

    public void setField1504(Boolean field1504) {
        this.field1504 = field1504;
    }





 /**
  * @return
  * @hibernate.property column="vaginal_thrush_diag"
  */
    public Boolean getField1505() {
        return this.field1505;
    }

    public void setField1505(Boolean field1505) {
        this.field1505 = field1505;
    }





 /**
  * @return
  * @hibernate.property column="oral_thrush_diag"
  */
    public Boolean getField1506() {
        return this.field1506;
    }

    public void setField1506(Boolean field1506) {
        this.field1506 = field1506;
    }





 /**
  * @return
  * @hibernate.property column="eclampsia"
  */
    public Byte getField1756() {
        return this.field1756;
    }

    public void setField1756(Byte field1756) {
        this.field1756 = field1756;
    }





 /**
  * @return
  * @hibernate.property column="abruptia_placenta"
  */
    public Boolean getField1757() {
        return this.field1757;
    }

    public void setField1757(Boolean field1757) {
        this.field1757 = field1757;
    }





 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getField1758() {
        return this.field1758;
    }

    public void setField1758(Integer field1758) {
        this.field1758 = field1758;
    }





 /**
  * @return
  * @hibernate.property column="diag_other" type="text"
  */
    public String getField1359() {
        return this.field1359;
    }

    public void setField1359(String field1359) {
        this.field1359 = field1359;
    }





 /**
  * @return
  * @hibernate.property column="broken_episiotomy"
  */
    public Boolean getField1784() {
        return this.field1784;
    }

    public void setField1784(Boolean field1784) {
        this.field1784 = field1784;
    }





 /**
  * @return
  * @hibernate.property column="puerperal_sepsis"
  */
    public Boolean getField1785() {
        return this.field1785;
    }

    public void setField1785(Boolean field1785) {
        this.field1785 = field1785;
    }





 /**
  * @return
  * @hibernate.property column="breast_engorgement"
  */
    public Boolean getField1786() {
        return this.field1786;
    }

    public void setField1786(Boolean field1786) {
        this.field1786 = field1786;
    }





 /**
  * @return
  * @hibernate.property column="secondary_pph"
  */
    public Boolean getField1787() {
        return this.field1787;
    }

    public void setField1787(Boolean field1787) {
        this.field1787 = field1787;
    }





 /**
  * @return
  * @hibernate.property column="mastitis"
  */
    public Boolean getField1788() {
        return this.field1788;
    }

    public void setField1788(Boolean field1788) {
        this.field1788 = field1788;
    }





 /**
  * @return
  * @hibernate.property column="breast_abscess"
  */
    public Boolean getField1789() {
        return this.field1789;
    }

    public void setField1789(Boolean field1789) {
        this.field1789 = field1789;
    }





 /**
  * @return
  * @hibernate.property column="bowel_obstruction"
  */
    public Boolean getField1809() {
        return this.field1809;
    }

    public void setField1809(Boolean field1809) {
        this.field1809 = field1809;
    }





 /**
  * @return
  * @hibernate.property column="indigestion"
  */
    public Boolean getField1817() {
        return this.field1817;
    }

    public void setField1817(Boolean field1817) {
        this.field1817 = field1817;
    }





 /**
  * @return
  * @hibernate.property column="opthalmia_neonatorum"
  */
    public Boolean getField1810() {
        return this.field1810;
    }

    public void setField1810(Boolean field1810) {
        this.field1810 = field1810;
    }





 /**
  * @return
  * @hibernate.property column="dehydration"
  */
    public Boolean getField1811() {
        return this.field1811;
    }

    public void setField1811(Boolean field1811) {
        this.field1811 = field1811;
    }





 /**
  * @return
  * @hibernate.property column="umbilical_infection"
  */
    public Boolean getField1812() {
        return this.field1812;
    }

    public void setField1812(Boolean field1812) {
        this.field1812 = field1812;
    }





 /**
  * @return
  * @hibernate.property column="diarrhoea"
  */
    public Boolean getField1813() {
        return this.field1813;
    }

    public void setField1813(Boolean field1813) {
        this.field1813 = field1813;
    }





 /**
  * @return
  * @hibernate.property column="episiotomy_infection"
  */
    public Boolean getField1777() {
        return this.field1777;
    }

    public void setField1777(Boolean field1777) {
        this.field1777 = field1777;
    }





 /**
  * @return
  * @hibernate.property column="sepsis"
  */
    public Boolean getField1775() {
        return this.field1775;
    }

    public void setField1775(Boolean field1775) {
        this.field1775 = field1775;
    }





 /**
  * @return
  * @hibernate.property column="endometritis"
  */
    public Boolean getField1781() {
        return this.field1781;
    }

    public void setField1781(Boolean field1781) {
        this.field1781 = field1781;
    }





}
