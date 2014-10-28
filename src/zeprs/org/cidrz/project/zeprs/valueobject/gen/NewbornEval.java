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
 * JavaBean NewbornEval generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Newborn Evaluation
 *         Form Id: 23
 */

/**
 * @hibernate.joined-subclass table="newborneval"
 * @hibernate.joined-subclass-key column="id"
 */
public class NewbornEval extends EncounterData {

private Date field1267;	//date_of_birth
private Time field1514;	//time_of_birth_1514
private Integer field489;	//sequence_num_489
private transient Integer field488;	//if_premature_num_weeks_gest_488
private Integer field490;	//sex_490
private Integer field2055;	//ega_weeks
private Float field491;	//weight_at_birth_491
private Boolean field1925;	//estimate_weight
private Integer field492;	//trauma_492
private String field1192;	//trauma_other_1192
private Integer field493;	//alive_sb_493
private String field494;	//if_sb_cause_494
private Byte field1180;	//neonatal_dea_1180
private Integer field497;	//neonatal_death_age_hours_497
private Integer field495;	//neonatal_death_cause_495
private String field496;	//neonatal_death_cause_desc_496
private Boolean field1921;	//born_at_home
private Integer field1923;	//cord_evaluation
private Integer field498;	//apgar_score_1_min_498
private Integer field504;	//apgar_score_5_min_504
private Integer field510;	//apgar_score_10_min_510
private Byte field1521;	//tactile
private String field1522;	//tactile_results
private Byte field1523;	//suction
private String field1524;	//suction_results
private Byte field1526;	//oxygen
private String field1525;	//oxygen_results
private Byte field1527;	//intubation
private String field1528;	//intubation_results
private Byte field1529;	//ephinephrine
private String field1530;	//ephinephrine_results
private Byte field1531;	//naxolone
private String field1532;	//naxolone_results
private Byte field1533;	//atropine
private String field1534;	//atropine_results
private Byte field1535;	//bag_and_mask
private String field1536;	//bag_and_mask_results
private Byte field1537;	//sodium_bcarbonate
private String field1538;	//sodium_bcarbonate_results
private Byte field1539;	//other_drugs
private String field1540;	//other_drugs_results
private Integer field532;	//crown_heel_length_532
private Float field530;	//head_circumf_530
private Integer field2049;	//general_examination
private Integer field700;	//skin_700
private String field701;	//skin_other_701
private Integer field2065;	//head_ears_nose_throat
private String field2066;	//hent_abnormality
private Integer field523;	//eyes_523
private String field524;	//eyes_other_524
private Integer field525;	//if_eyes_abnormal_treatment_525
private Integer field526;	//mouth_526
private String field527;	//mouth_other_527
private Integer field167;	//respiratory_system_167
private String field1449;	//respiratory_system_other
private Integer field2067;	//cardovascular_examination
private String field2068;	//cardiovascular_abnormality
private Integer field2069;	//abdominal_exam
private String field2073;	//abdominal_abnormality
private Integer field529;	//genitalia_529
private String field697;	//genitalia_other_697
private Integer field538;	//upper_extrem_538
private String field539;	//upper_extrem_desc_539
private Integer field541;	//lower_extrem_541
private String field542;	//lower_extrem_desc_542
private Integer field536;	//back_536
private String field537;	//back_other_537
private Byte field521;	//good_grasp_reflex_521
private Integer field522;	//symmetrical_moro_522
private Integer field528;	//sucking_528
private Byte field2070;	//congenital_malformations
private transient Integer field2071;	//congenital_malformations_system
private transient Integer field2075;	//congen_malform_system1
private transient Integer field2076;	//congen_malform_system2
private transient Integer field2077;	//congen_malform_system3
private transient Integer field2078;	//congen_malform_system4
private transient Integer field2079;	//congen_malform_system5
private transient Integer field2080;	//congen_malform_system6
private transient Integer field2081;	//congen_malform_system7
private transient Integer field2082;	//congen_malform_system8
private transient Integer field2072;	//abnormality_crano_facial
private Integer field543;	//anomalies_cns_543
private String field544;	//anomalies_cns_desc_544
private Integer field2095;	//anomalies_orofacial
private String field2096;	//anomalies_orofacial_comment
private Integer field547;	//anomalies_cardio_547
private String field548;	//anomalies_cardio_desc_548
private Byte field2089;	//anomalies_pulmonary
private String field2090;	//anomalies_pulmonary_comment
private Integer field2093;	//anomalies_gastrointestinal
private String field2094;	//anomalies_gastrointestinal_comment
private Integer field549;	//anomalies_genitour_549
private String field550;	//anomalies_genitour_desc_550
private Integer field2091;	//anomalies_musculoskeletal
private String field2092;	//anomalies_musculoskeletal_comment
private Integer field545;	//anomalies_chromo_545
private String field546;	//anomalies_chromo_desc_546
private Integer field551;	//anomalies_other_551
private String field1189;	//anomalies_ohter_1189
private Byte field535;	//bowel_movement_535
private Byte field1181;	//urine_passed_1181
private Integer field1791;	//feeding_type
private Integer field1541;	//feeding
private transient Byte field518;	//breast_feeding_well_518
private transient Byte field1465;	//used_formula_for_feeding
private transient Byte field520;	//good_head_control_520
private transient Float field531;	//chest_circum_531
private transient Integer field540;	//ortolani_sign_540
private transient Float field558;	//weight_on_3rd_day_558
private Integer field1516;	//immunization_1
private Integer field1517;	//immunization_2
private Integer field1518;	//immunization_3
private Integer field1519;	//immunization_4
private Integer field1520;	//immunization_5
private String field556;	//immunisation_desc_556
private Integer field1884;	//baby_received_arv
private Integer field1899;	//rbd_home_regimen
private Integer field1893;	//rbd_home_dosage
private transient Integer field555;	//dosage_nevirapine_555
private String field557;	//problems_comments_557
private transient String field1216;	//place_of_next_visit_1216
private String field1213;	//place_of_next_visit_1213


 /**
  * @return
  * @hibernate.property column="date_of_birth"
  */
    public Date getField1267() {
        return this.field1267;
    }

    public void setField1267(Date field1267) {
        this.field1267 = field1267;
    }





 /**
  * @return
  * @hibernate.property column="time_of_birth_1514"
  */
    public Time getField1514() {
        return this.field1514;
    }

    public void setField1514(Time field1514) {
        this.field1514 = field1514;
    }





 /**
  * @return
  * @hibernate.property column="sequence_num_489"
  */
    public Integer getField489() {
        return this.field489;
    }

    public void setField489(Integer field489) {
        this.field489 = field489;
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
  * @hibernate.property column="ega_weeks"
  */
    public Integer getField2055() {
        return this.field2055;
    }

    public void setField2055(Integer field2055) {
        this.field2055 = field2055;
    }





 /**
  * @return
  * @hibernate.property column="weight_at_birth_491"
  */
    public Float getField491() {
        return this.field491;
    }

    public void setField491(Float field491) {
        this.field491 = field491;
    }





 /**
  * @return
  * @hibernate.property column="estimate_weight"
  */
    public Boolean getField1925() {
        return this.field1925;
    }

    public void setField1925(Boolean field1925) {
        this.field1925 = field1925;
    }





 /**
  * @return
  * @hibernate.property column="trauma_492"
  */
    public Integer getField492() {
        return this.field492;
    }

    public void setField492(Integer field492) {
        this.field492 = field492;
    }





 /**
  * @return
  * @hibernate.property column="trauma_other_1192" type="text"
  */
    public String getField1192() {
        return this.field1192;
    }

    public void setField1192(String field1192) {
        this.field1192 = field1192;
    }





 /**
  * @return
  * @hibernate.property column="alive_sb_493"
  */
    public Integer getField493() {
        return this.field493;
    }

    public void setField493(Integer field493) {
        this.field493 = field493;
    }





 /**
  * @return
  * @hibernate.property column="if_sb_cause_494" type="text"
  */
    public String getField494() {
        return this.field494;
    }

    public void setField494(String field494) {
        this.field494 = field494;
    }





 /**
  * @return
  * @hibernate.property column="neonatal_dea_1180"
  */
    public Byte getField1180() {
        return this.field1180;
    }

    public void setField1180(Byte field1180) {
        this.field1180 = field1180;
    }





 /**
  * @return
  * @hibernate.property column="neonatal_death_age_hours_497"
  */
    public Integer getField497() {
        return this.field497;
    }

    public void setField497(Integer field497) {
        this.field497 = field497;
    }





 /**
  * @return
  * @hibernate.property column="neonatal_death_cause_495"
  */
    public Integer getField495() {
        return this.field495;
    }

    public void setField495(Integer field495) {
        this.field495 = field495;
    }





 /**
  * @return
  * @hibernate.property column="neonatal_death_cause_desc_496" type="text"
  */
    public String getField496() {
        return this.field496;
    }

    public void setField496(String field496) {
        this.field496 = field496;
    }





 /**
  * @return
  * @hibernate.property column="born_at_home"
  */
    public Boolean getField1921() {
        return this.field1921;
    }

    public void setField1921(Boolean field1921) {
        this.field1921 = field1921;
    }





 /**
  * @return
  * @hibernate.property column="cord_evaluation"
  */
    public Integer getField1923() {
        return this.field1923;
    }

    public void setField1923(Integer field1923) {
        this.field1923 = field1923;
    }





 /**
  * @return
  * @hibernate.property column="apgar_score_1_min_498"
  */
    public Integer getField498() {
        return this.field498;
    }

    public void setField498(Integer field498) {
        this.field498 = field498;
    }





 /**
  * @return
  * @hibernate.property column="apgar_score_5_min_504"
  */
    public Integer getField504() {
        return this.field504;
    }

    public void setField504(Integer field504) {
        this.field504 = field504;
    }





 /**
  * @return
  * @hibernate.property column="apgar_score_10_min_510"
  */
    public Integer getField510() {
        return this.field510;
    }

    public void setField510(Integer field510) {
        this.field510 = field510;
    }





 /**
  * @return
  * @hibernate.property column="tactile"
  */
    public Byte getField1521() {
        return this.field1521;
    }

    public void setField1521(Byte field1521) {
        this.field1521 = field1521;
    }





 /**
  * @return
  * @hibernate.property column="tactile_results" type="text"
  */
    public String getField1522() {
        return this.field1522;
    }

    public void setField1522(String field1522) {
        this.field1522 = field1522;
    }





 /**
  * @return
  * @hibernate.property column="suction"
  */
    public Byte getField1523() {
        return this.field1523;
    }

    public void setField1523(Byte field1523) {
        this.field1523 = field1523;
    }





 /**
  * @return
  * @hibernate.property column="suction_results" type="text"
  */
    public String getField1524() {
        return this.field1524;
    }

    public void setField1524(String field1524) {
        this.field1524 = field1524;
    }





 /**
  * @return
  * @hibernate.property column="oxygen"
  */
    public Byte getField1526() {
        return this.field1526;
    }

    public void setField1526(Byte field1526) {
        this.field1526 = field1526;
    }





 /**
  * @return
  * @hibernate.property column="oxygen_results" type="text"
  */
    public String getField1525() {
        return this.field1525;
    }

    public void setField1525(String field1525) {
        this.field1525 = field1525;
    }





 /**
  * @return
  * @hibernate.property column="intubation"
  */
    public Byte getField1527() {
        return this.field1527;
    }

    public void setField1527(Byte field1527) {
        this.field1527 = field1527;
    }





 /**
  * @return
  * @hibernate.property column="intubation_results" type="text"
  */
    public String getField1528() {
        return this.field1528;
    }

    public void setField1528(String field1528) {
        this.field1528 = field1528;
    }





 /**
  * @return
  * @hibernate.property column="ephinephrine"
  */
    public Byte getField1529() {
        return this.field1529;
    }

    public void setField1529(Byte field1529) {
        this.field1529 = field1529;
    }





 /**
  * @return
  * @hibernate.property column="ephinephrine_results" type="text"
  */
    public String getField1530() {
        return this.field1530;
    }

    public void setField1530(String field1530) {
        this.field1530 = field1530;
    }





 /**
  * @return
  * @hibernate.property column="naxolone"
  */
    public Byte getField1531() {
        return this.field1531;
    }

    public void setField1531(Byte field1531) {
        this.field1531 = field1531;
    }





 /**
  * @return
  * @hibernate.property column="naxolone_results" type="text"
  */
    public String getField1532() {
        return this.field1532;
    }

    public void setField1532(String field1532) {
        this.field1532 = field1532;
    }





 /**
  * @return
  * @hibernate.property column="atropine"
  */
    public Byte getField1533() {
        return this.field1533;
    }

    public void setField1533(Byte field1533) {
        this.field1533 = field1533;
    }





 /**
  * @return
  * @hibernate.property column="atropine_results" type="text"
  */
    public String getField1534() {
        return this.field1534;
    }

    public void setField1534(String field1534) {
        this.field1534 = field1534;
    }





 /**
  * @return
  * @hibernate.property column="bag_and_mask"
  */
    public Byte getField1535() {
        return this.field1535;
    }

    public void setField1535(Byte field1535) {
        this.field1535 = field1535;
    }





 /**
  * @return
  * @hibernate.property column="bag_and_mask_results" type="text"
  */
    public String getField1536() {
        return this.field1536;
    }

    public void setField1536(String field1536) {
        this.field1536 = field1536;
    }





 /**
  * @return
  * @hibernate.property column="sodium_bcarbonate"
  */
    public Byte getField1537() {
        return this.field1537;
    }

    public void setField1537(Byte field1537) {
        this.field1537 = field1537;
    }





 /**
  * @return
  * @hibernate.property column="sodium_bcarbonate_results" type="text"
  */
    public String getField1538() {
        return this.field1538;
    }

    public void setField1538(String field1538) {
        this.field1538 = field1538;
    }





 /**
  * @return
  * @hibernate.property column="other_drugs"
  */
    public Byte getField1539() {
        return this.field1539;
    }

    public void setField1539(Byte field1539) {
        this.field1539 = field1539;
    }





 /**
  * @return
  * @hibernate.property column="other_drugs_results" type="text"
  */
    public String getField1540() {
        return this.field1540;
    }

    public void setField1540(String field1540) {
        this.field1540 = field1540;
    }





 /**
  * @return
  * @hibernate.property column="crown_heel_length_532"
  */
    public Integer getField532() {
        return this.field532;
    }

    public void setField532(Integer field532) {
        this.field532 = field532;
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
  * @hibernate.property column="general_examination"
  */
    public Integer getField2049() {
        return this.field2049;
    }

    public void setField2049(Integer field2049) {
        this.field2049 = field2049;
    }





 /**
  * @return
  * @hibernate.property column="skin_700"
  */
    public Integer getField700() {
        return this.field700;
    }

    public void setField700(Integer field700) {
        this.field700 = field700;
    }





 /**
  * @return
  * @hibernate.property column="skin_other_701" type="text"
  */
    public String getField701() {
        return this.field701;
    }

    public void setField701(String field701) {
        this.field701 = field701;
    }





 /**
  * @return
  * @hibernate.property column="head_ears_nose_throat"
  */
    public Integer getField2065() {
        return this.field2065;
    }

    public void setField2065(Integer field2065) {
        this.field2065 = field2065;
    }





 /**
  * @return
  * @hibernate.property column="hent_abnormality" type="text"
  */
    public String getField2066() {
        return this.field2066;
    }

    public void setField2066(String field2066) {
        this.field2066 = field2066;
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
  * @hibernate.property column="if_eyes_abnormal_treatment_525"
  */
    public Integer getField525() {
        return this.field525;
    }

    public void setField525(Integer field525) {
        this.field525 = field525;
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
  * @hibernate.property column="respiratory_system_167"
  */
    public Integer getField167() {
        return this.field167;
    }

    public void setField167(Integer field167) {
        this.field167 = field167;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_system_other" type="text"
  */
    public String getField1449() {
        return this.field1449;
    }

    public void setField1449(String field1449) {
        this.field1449 = field1449;
    }





 /**
  * @return
  * @hibernate.property column="cardovascular_examination"
  */
    public Integer getField2067() {
        return this.field2067;
    }

    public void setField2067(Integer field2067) {
        this.field2067 = field2067;
    }





 /**
  * @return
  * @hibernate.property column="cardiovascular_abnormality" type="text"
  */
    public String getField2068() {
        return this.field2068;
    }

    public void setField2068(String field2068) {
        this.field2068 = field2068;
    }





 /**
  * @return
  * @hibernate.property column="abdominal_exam"
  */
    public Integer getField2069() {
        return this.field2069;
    }

    public void setField2069(Integer field2069) {
        this.field2069 = field2069;
    }





 /**
  * @return
  * @hibernate.property column="abdominal_abnormality" type="text"
  */
    public String getField2073() {
        return this.field2073;
    }

    public void setField2073(String field2073) {
        this.field2073 = field2073;
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
  * @hibernate.property column="back_536"
  */
    public Integer getField536() {
        return this.field536;
    }

    public void setField536(Integer field536) {
        this.field536 = field536;
    }





 /**
  * @return
  * @hibernate.property column="back_other_537" type="text"
  */
    public String getField537() {
        return this.field537;
    }

    public void setField537(String field537) {
        this.field537 = field537;
    }





 /**
  * @return
  * @hibernate.property column="good_grasp_reflex_521"
  */
    public Byte getField521() {
        return this.field521;
    }

    public void setField521(Byte field521) {
        this.field521 = field521;
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
  * @hibernate.property column="congenital_malformations"
  */
    public Byte getField2070() {
        return this.field2070;
    }

    public void setField2070(Byte field2070) {
        this.field2070 = field2070;
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
  * @hibernate.property column="anomalies_orofacial"
  */
    public Integer getField2095() {
        return this.field2095;
    }

    public void setField2095(Integer field2095) {
        this.field2095 = field2095;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_orofacial_comment" type="text"
  */
    public String getField2096() {
        return this.field2096;
    }

    public void setField2096(String field2096) {
        this.field2096 = field2096;
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
  * @hibernate.property column="anomalies_pulmonary"
  */
    public Byte getField2089() {
        return this.field2089;
    }

    public void setField2089(Byte field2089) {
        this.field2089 = field2089;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_pulmonary_comment" type="text"
  */
    public String getField2090() {
        return this.field2090;
    }

    public void setField2090(String field2090) {
        this.field2090 = field2090;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_gastrointestinal"
  */
    public Integer getField2093() {
        return this.field2093;
    }

    public void setField2093(Integer field2093) {
        this.field2093 = field2093;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_gastrointestinal_comment" type="text"
  */
    public String getField2094() {
        return this.field2094;
    }

    public void setField2094(String field2094) {
        this.field2094 = field2094;
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
  * @hibernate.property column="anomalies_musculoskeletal"
  */
    public Integer getField2091() {
        return this.field2091;
    }

    public void setField2091(Integer field2091) {
        this.field2091 = field2091;
    }





 /**
  * @return
  * @hibernate.property column="anomalies_musculoskeletal_comment" type="text"
  */
    public String getField2092() {
        return this.field2092;
    }

    public void setField2092(String field2092) {
        this.field2092 = field2092;
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
  * @hibernate.property column="bowel_movement_535"
  */
    public Byte getField535() {
        return this.field535;
    }

    public void setField535(Byte field535) {
        this.field535 = field535;
    }





 /**
  * @return
  * @hibernate.property column="urine_passed_1181"
  */
    public Byte getField1181() {
        return this.field1181;
    }

    public void setField1181(Byte field1181) {
        this.field1181 = field1181;
    }





 /**
  * @return
  * @hibernate.property column="feeding_type"
  */
    public Integer getField1791() {
        return this.field1791;
    }

    public void setField1791(Integer field1791) {
        this.field1791 = field1791;
    }





 /**
  * @return
  * @hibernate.property column="feeding"
  */
    public Integer getField1541() {
        return this.field1541;
    }

    public void setField1541(Integer field1541) {
        this.field1541 = field1541;
    }





























 /**
  * @return
  * @hibernate.property column="immunization_1"
  */
    public Integer getField1516() {
        return this.field1516;
    }

    public void setField1516(Integer field1516) {
        this.field1516 = field1516;
    }





 /**
  * @return
  * @hibernate.property column="immunization_2"
  */
    public Integer getField1517() {
        return this.field1517;
    }

    public void setField1517(Integer field1517) {
        this.field1517 = field1517;
    }





 /**
  * @return
  * @hibernate.property column="immunization_3"
  */
    public Integer getField1518() {
        return this.field1518;
    }

    public void setField1518(Integer field1518) {
        this.field1518 = field1518;
    }





 /**
  * @return
  * @hibernate.property column="immunization_4"
  */
    public Integer getField1519() {
        return this.field1519;
    }

    public void setField1519(Integer field1519) {
        this.field1519 = field1519;
    }





 /**
  * @return
  * @hibernate.property column="immunization_5"
  */
    public Integer getField1520() {
        return this.field1520;
    }

    public void setField1520(Integer field1520) {
        this.field1520 = field1520;
    }





 /**
  * @return
  * @hibernate.property column="immunisation_desc_556" type="text"
  */
    public String getField556() {
        return this.field556;
    }

    public void setField556(String field556) {
        this.field556 = field556;
    }





 /**
  * @return
  * @hibernate.property column="baby_received_arv"
  */
    public Integer getField1884() {
        return this.field1884;
    }

    public void setField1884(Integer field1884) {
        this.field1884 = field1884;
    }





 /**
  * @return
  * @hibernate.property column="rbd_home_regimen"
  */
    public Integer getField1899() {
        return this.field1899;
    }

    public void setField1899(Integer field1899) {
        this.field1899 = field1899;
    }





 /**
  * @return
  * @hibernate.property column="rbd_home_dosage"
  */
    public Integer getField1893() {
        return this.field1893;
    }

    public void setField1893(Integer field1893) {
        this.field1893 = field1893;
    }









 /**
  * @return
  * @hibernate.property column="problems_comments_557" type="text"
  */
    public String getField557() {
        return this.field557;
    }

    public void setField557(String field557) {
        this.field557 = field557;
    }









 /**
  * @return
  * @hibernate.property column="place_of_next_visit_1213"
  */
    public String getField1213() {
        return this.field1213;
    }

    public void setField1213(String field1213) {
        this.field1213 = field1213;
    }





}
