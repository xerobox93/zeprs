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
 * JavaBean InfantPhysicalExam generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Infant Physical Examination
 *         Form Id: 36
 */

/**
 * @hibernate.joined-subclass table="infantphysicalexam"
 * @hibernate.joined-subclass-key column="id"
 */
public class InfantPhysicalExam extends EncounterData {

private Integer field771;	//skull_771
private Integer field523;	//eyes_523
private String field524;	//eyes_other_524
private Integer field686;	//ears_686
private String field687;	//ears_other_687
private Integer field526;	//mouth_526
private String field527;	//mouth_other_527
private Integer field528;	//sucking_528
private Integer field690;	//neck_690
private String field691;	//neck_other_d_691
private Integer field780;	//breasts_infant_780
private Integer field781;	//chest_infant_781
private Integer field782;	//respiratory_effort_782
private String field783;	//respiratory_effort_other_783
private Integer field784;	//abdomen_liver_784
private Integer field785;	//sole_creases_785
private Integer field529;	//genitalia_529
private String field697;	//genitalia_other_697
private Integer field787;	//spleen_infant_787
private Integer field788;	//kidney_infant_788
private Integer field789;	//cord_complic_789
private Integer field790;	//no_of_arteries_790
private Integer field791;	//neonatal_reflex_791
private Integer field522;	//symmetrical_moro_522
private Integer field538;	//upper_extrem_538
private String field539;	//upper_extrem_desc_539
private transient Integer field540;	//ortolani_sign_540
private Integer field541;	//lower_extrem_541
private String field542;	//lower_extrem_desc_542
private Integer field543;	//anomalies_cns_543
private String field544;	//anomalies_cns_desc_544
private Integer field545;	//anomalies_chromo_545
private String field546;	//anomalies_chromo_desc_546
private Integer field547;	//anomalies_cardio_547
private String field548;	//anomalies_cardio_desc_548
private Integer field549;	//anomalies_genitour_549
private String field550;	//anomalies_genitour_desc_550
private Integer field551;	//anomalies_other_551
private String field1189;	//anomalies_ohter_1189
private Integer field807;	//injuries_trauma_807
private String field808;	//clinical_age_808
private Integer field809;	//hypoxic_isch_hie_809
private Integer field810;	//hie_irritabi_810
private Integer field811;	//hie_hyponton_811
private Integer field812;	//hie_feeding_812
private Integer field813;	//hie_seizures_813
private Integer field814;	//hie_total_sc_814
private Float field763;	//weight_on_admission_763
private Float field680;	//temperature_infant_680
private Float field530;	//head_circumf_530
private Byte field766;	//pallor_766
private Byte field767;	//cyanosis_767
private Byte field519;	//jaundice_519
private Integer field769;	//heart_rate_769
private Float field758;	//birth_weight_758
private Integer field759;	//reason_for_admission_759
private String field761;	//reason_for_admission_other_761


 /**
  * @return
  * @hibernate.property column="skull_771"
  */
    public Integer getField771() {
        return this.field771;
    }

    public void setField771(Integer field771) {
        this.field771 = field771;
    }





 /**
  * @return
  * @hibernate.property column="eyes_523"
  */
    public Integer getField523() {
        return this.field523;
    }

    public void setField523(Integer field523) {
        this.field523 = field523;
    }





 /**
  * @return
  * @hibernate.property column="eyes_other_524" type="text"
  */
    public String getField524() {
        return this.field524;
    }

    public void setField524(String field524) {
        this.field524 = field524;
    }





 /**
  * @return
  * @hibernate.property column="ears_686"
  */
    public Integer getField686() {
        return this.field686;
    }

    public void setField686(Integer field686) {
        this.field686 = field686;
    }





 /**
  * @return
  * @hibernate.property column="ears_other_687" type="text"
  */
    public String getField687() {
        return this.field687;
    }

    public void setField687(String field687) {
        this.field687 = field687;
    }





 /**
  * @return
  * @hibernate.property column="mouth_526"
  */
    public Integer getField526() {
        return this.field526;
    }

    public void setField526(Integer field526) {
        this.field526 = field526;
    }





 /**
  * @return
  * @hibernate.property column="mouth_other_527" type="text"
  */
    public String getField527() {
        return this.field527;
    }

    public void setField527(String field527) {
        this.field527 = field527;
    }





 /**
  * @return
  * @hibernate.property column="sucking_528"
  */
    public Integer getField528() {
        return this.field528;
    }

    public void setField528(Integer field528) {
        this.field528 = field528;
    }





 /**
  * @return
  * @hibernate.property column="neck_690"
  */
    public Integer getField690() {
        return this.field690;
    }

    public void setField690(Integer field690) {
        this.field690 = field690;
    }





 /**
  * @return
  * @hibernate.property column="neck_other_d_691" type="text"
  */
    public String getField691() {
        return this.field691;
    }

    public void setField691(String field691) {
        this.field691 = field691;
    }





 /**
  * @return
  * @hibernate.property column="breasts_infant_780"
  */
    public Integer getField780() {
        return this.field780;
    }

    public void setField780(Integer field780) {
        this.field780 = field780;
    }





 /**
  * @return
  * @hibernate.property column="chest_infant_781"
  */
    public Integer getField781() {
        return this.field781;
    }

    public void setField781(Integer field781) {
        this.field781 = field781;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_effort_782"
  */
    public Integer getField782() {
        return this.field782;
    }

    public void setField782(Integer field782) {
        this.field782 = field782;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_effort_other_783" type="text"
  */
    public String getField783() {
        return this.field783;
    }

    public void setField783(String field783) {
        this.field783 = field783;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_liver_784"
  */
    public Integer getField784() {
        return this.field784;
    }

    public void setField784(Integer field784) {
        this.field784 = field784;
    }





 /**
  * @return
  * @hibernate.property column="sole_creases_785"
  */
    public Integer getField785() {
        return this.field785;
    }

    public void setField785(Integer field785) {
        this.field785 = field785;
    }





 /**
  * @return
  * @hibernate.property column="genitalia_529"
  */
    public Integer getField529() {
        return this.field529;
    }

    public void setField529(Integer field529) {
        this.field529 = field529;
    }





 /**
  * @return
  * @hibernate.property column="genitalia_other_697" type="text"
  */
    public String getField697() {
        return this.field697;
    }

    public void setField697(String field697) {
        this.field697 = field697;
    }





 /**
  * @return
  * @hibernate.property column="spleen_infant_787"
  */
    public Integer getField787() {
        return this.field787;
    }

    public void setField787(Integer field787) {
        this.field787 = field787;
    }





 /**
  * @return
  * @hibernate.property column="kidney_infant_788"
  */
    public Integer getField788() {
        return this.field788;
    }

    public void setField788(Integer field788) {
        this.field788 = field788;
    }





 /**
  * @return
  * @hibernate.property column="cord_complic_789"
  */
    public Integer getField789() {
        return this.field789;
    }

    public void setField789(Integer field789) {
        this.field789 = field789;
    }





 /**
  * @return
  * @hibernate.property column="no_of_arteries_790"
  */
    public Integer getField790() {
        return this.field790;
    }

    public void setField790(Integer field790) {
        this.field790 = field790;
    }





 /**
  * @return
  * @hibernate.property column="neonatal_reflex_791"
  */
    public Integer getField791() {
        return this.field791;
    }

    public void setField791(Integer field791) {
        this.field791 = field791;
    }





 /**
  * @return
  * @hibernate.property column="symmetrical_moro_522"
  */
    public Integer getField522() {
        return this.field522;
    }

    public void setField522(Integer field522) {
        this.field522 = field522;
    }





 /**
  * @return
  * @hibernate.property column="upper_extrem_538"
  */
    public Integer getField538() {
        return this.field538;
    }

    public void setField538(Integer field538) {
        this.field538 = field538;
    }





 /**
  * @return
  * @hibernate.property column="upper_extrem_desc_539" type="text"
  */
    public String getField539() {
        return this.field539;
    }

    public void setField539(String field539) {
        this.field539 = field539;
    }









 /**
  * @return
  * @hibernate.property column="lower_extrem_541"
  */
    public Integer getField541() {
        return this.field541;
    }

    public void setField541(Integer field541) {
        this.field541 = field541;
    }





 /**
  * @return
  * @hibernate.property column="lower_extrem_desc_542" type="text"
  */
    public String getField542() {
        return this.field542;
    }

    public void setField542(String field542) {
        this.field542 = field542;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_cns_543"
  */
    public Integer getField543() {
        return this.field543;
    }

    public void setField543(Integer field543) {
        this.field543 = field543;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_cns_desc_544" type="text"
  */
    public String getField544() {
        return this.field544;
    }

    public void setField544(String field544) {
        this.field544 = field544;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_chromo_545"
  */
    public Integer getField545() {
        return this.field545;
    }

    public void setField545(Integer field545) {
        this.field545 = field545;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_chromo_desc_546" type="text"
  */
    public String getField546() {
        return this.field546;
    }

    public void setField546(String field546) {
        this.field546 = field546;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_cardio_547"
  */
    public Integer getField547() {
        return this.field547;
    }

    public void setField547(Integer field547) {
        this.field547 = field547;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_cardio_desc_548" type="text"
  */
    public String getField548() {
        return this.field548;
    }

    public void setField548(String field548) {
        this.field548 = field548;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_genitour_549"
  */
    public Integer getField549() {
        return this.field549;
    }

    public void setField549(Integer field549) {
        this.field549 = field549;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_genitour_desc_550" type="text"
  */
    public String getField550() {
        return this.field550;
    }

    public void setField550(String field550) {
        this.field550 = field550;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_other_551"
  */
    public Integer getField551() {
        return this.field551;
    }

    public void setField551(Integer field551) {
        this.field551 = field551;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_ohter_1189" type="text"
  */
    public String getField1189() {
        return this.field1189;
    }

    public void setField1189(String field1189) {
        this.field1189 = field1189;
    }





 /**
  * @return
  * @hibernate.property column="injuries_trauma_807"
  */
    public Integer getField807() {
        return this.field807;
    }

    public void setField807(Integer field807) {
        this.field807 = field807;
    }





 /**
  * @return
  * @hibernate.property column="clinical_age_808"
  */
    public String getField808() {
        return this.field808;
    }

    public void setField808(String field808) {
        this.field808 = field808;
    }





 /**
  * @return
  * @hibernate.property column="hypoxic_isch_hie_809"
  */
    public Integer getField809() {
        return this.field809;
    }

    public void setField809(Integer field809) {
        this.field809 = field809;
    }





 /**
  * @return
  * @hibernate.property column="hie_irritabi_810"
  */
    public Integer getField810() {
        return this.field810;
    }

    public void setField810(Integer field810) {
        this.field810 = field810;
    }





 /**
  * @return
  * @hibernate.property column="hie_hyponton_811"
  */
    public Integer getField811() {
        return this.field811;
    }

    public void setField811(Integer field811) {
        this.field811 = field811;
    }





 /**
  * @return
  * @hibernate.property column="hie_feeding_812"
  */
    public Integer getField812() {
        return this.field812;
    }

    public void setField812(Integer field812) {
        this.field812 = field812;
    }





 /**
  * @return
  * @hibernate.property column="hie_seizures_813"
  */
    public Integer getField813() {
        return this.field813;
    }

    public void setField813(Integer field813) {
        this.field813 = field813;
    }





 /**
  * @return
  * @hibernate.property column="hie_total_sc_814"
  */
    public Integer getField814() {
        return this.field814;
    }

    public void setField814(Integer field814) {
        this.field814 = field814;
    }





 /**
  * @return
  * @hibernate.property column="weight_on_admission_763"
  */
    public Float getField763() {
        return this.field763;
    }

    public void setField763(Float field763) {
        this.field763 = field763;
    }





 /**
  * @return
  * @hibernate.property column="temperature_infant_680"
  */
    public Float getField680() {
        return this.field680;
    }

    public void setField680(Float field680) {
        this.field680 = field680;
    }





 /**
  * @return
  * @hibernate.property column="head_circumf_530"
  */
    public Float getField530() {
        return this.field530;
    }

    public void setField530(Float field530) {
        this.field530 = field530;
    }





 /**
  * @return
  * @hibernate.property column="pallor_766"
  */
    public Byte getField766() {
        return this.field766;
    }

    public void setField766(Byte field766) {
        this.field766 = field766;
    }





 /**
  * @return
  * @hibernate.property column="cyanosis_767"
  */
    public Byte getField767() {
        return this.field767;
    }

    public void setField767(Byte field767) {
        this.field767 = field767;
    }





 /**
  * @return
  * @hibernate.property column="jaundice_519"
  */
    public Byte getField519() {
        return this.field519;
    }

    public void setField519(Byte field519) {
        this.field519 = field519;
    }





 /**
  * @return
  * @hibernate.property column="heart_rate_769"
  */
    public Integer getField769() {
        return this.field769;
    }

    public void setField769(Integer field769) {
        this.field769 = field769;
    }





 /**
  * @return
  * @hibernate.property column="birth_weight_758"
  */
    public Float getField758() {
        return this.field758;
    }

    public void setField758(Float field758) {
        this.field758 = field758;
    }





 /**
  * @return
  * @hibernate.property column="reason_for_admission_759"
  */
    public Integer getField759() {
        return this.field759;
    }

    public void setField759(Integer field759) {
        this.field759 = field759;
    }





 /**
  * @return
  * @hibernate.property column="reason_for_admission_other_761" type="text"
  */
    public String getField761() {
        return this.field761;
    }

    public void setField761(String field761) {
        this.field761 = field761;
    }





}
