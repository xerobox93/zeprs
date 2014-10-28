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
 * JavaBean DeliverySum generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Delivery Summary
 *         Form Id: 66
 */

/**
 * @hibernate.joined-subclass table="deliverysum"
 * @hibernate.joined-subclass-key column="id"
 */
public class DeliverySum extends EncounterData {

private String field1961;	//nurse_delivering
private Byte field2127;	//hiv_tested_in_labour
private Integer field1866;	//hiv_test_result
private Integer field1885;	//mother_received_arv
private Integer field1860;	//regimen
private Integer field421;	//latent_phase_duration_421
private Integer field422;	//labour_onset_422
private Integer field423;	//if_induced_mode_423
private Integer field424;	//indication_induction_424
private String field425;	//indication_induction_desc_425
private Integer field330;	//membranes_re_330
private Date field328;	//rupture_of_membranes_date_328
private Time field329;	//rupture_of_membranes_time_329
private Integer field331;	//liquor_331
private Byte field278;	//foul_smell_278
private transient Byte field1223;	//given_nvp_tablets_1223
private transient Float field1224;	//nvp_amount_1224
private Date field1821;	//date_first_stage_began
private Time field431;	//first_stage_began_431
private Date field1824;	//date_complete_dilitation
private Time field432;	//complete_dilitation_432
private Date field1822;	//date_placenta_delivered
private Time field438;	//placenta_delivered_438
private Byte field433;	//abnormality_at_dilatation_433
private transient Date field1823;	//date_last_baby_delivered
private transient Time field434;	//time_last_baby_delivered
private Byte field435;	//abnormality_at_delivery_435
private Byte field436;	//labour_augmented_436
private Byte field437;	//bladder_emptied_437
private Integer field447;	//mode_of_delivery_447
private Integer field448;	//mode_of_delivery_cs_448
private Integer field60;	//indication_CS_forcepts_60
private String field61;	//indication_CS_forcepts_desc_61
private Integer field451;	//anesthesia_delivery_451
private Byte field452;	//episiotomy_performed_452
private Byte field453;	//genital_laceration_453
private Integer field454;	//episiotomy_extension_454
private Integer field455;	//anterior_laceration_depth_455
private Integer field456;	//anterior_laceration_sutured_456
private Integer field457;	//posterior_laceration_depth_457
private Byte field458;	//posterior_laceration_sutured_458
private Byte field459;	//cervical_laceration_459
private Byte field460;	//cervical_laceration_sutured_460
private Integer field439;	//placenta_delivery_method_439
private Byte field2045;	//utherine_massage
private Integer field2046;	//uterotonic_med_given
private Byte field1753;	//pph
private Integer field462;	//blood_loss_est_462
private Integer field463;	//pph_treatment_463
private Integer field1177;	//if_blood_transfusion_1177
private Integer field1178;	//drugs_or_iv_fluids_1178
private Integer field1179;	//iv_fluid_volume_1179
private String field464;	//treatment_method_desc_464
private Byte field467;	//complications_467
private String field468;	//if_complications_desc_468
private Integer field470;	//colour_of_placenta_470
private Byte field471;	//presence_of_infarcts_471
private Byte field472;	//presence_of_clots_472
private Byte field473;	//extension_of_vessels_473
private String field474;	//other_placenta_abnormal_474
private Integer field475;	//haemorrhage_irt_placenta_475
private Integer field440;	//placenta_type_440
private Integer field1204;	//state_of_placenta_1204
private Integer field441;	//weight_of_placenta_441
private Integer field442;	//mode_of_cord_insert_442
private Integer field1767;	//blood_vessels_in_cord
private Byte field465;	//urine_passed_465
private Byte field466;	//bowel_movement_postpartum_466
private String field1926;	//comments


 /**
  * @return
  * @hibernate.property column="nurse_delivering"
  */
    public String getField1961() {
        return this.field1961;
    }

    public void setField1961(String field1961) {
        this.field1961 = field1961;
    }





 /**
  * @return
  * @hibernate.property column="hiv_tested_in_labour"
  */
    public Byte getField2127() {
        return this.field2127;
    }

    public void setField2127(Byte field2127) {
        this.field2127 = field2127;
    }





 /**
  * @return
  * @hibernate.property column="hiv_test_result"
  */
    public Integer getField1866() {
        return this.field1866;
    }

    public void setField1866(Integer field1866) {
        this.field1866 = field1866;
    }





 /**
  * @return
  * @hibernate.property column="mother_received_arv"
  */
    public Integer getField1885() {
        return this.field1885;
    }

    public void setField1885(Integer field1885) {
        this.field1885 = field1885;
    }





 /**
  * @return
  * @hibernate.property column="regimen"
  */
    public Integer getField1860() {
        return this.field1860;
    }

    public void setField1860(Integer field1860) {
        this.field1860 = field1860;
    }





 /**
  * @return
  * @hibernate.property column="latent_phase_duration_421"
  */
    public Integer getField421() {
        return this.field421;
    }

    public void setField421(Integer field421) {
        this.field421 = field421;
    }





 /**
  * @return
  * @hibernate.property column="labour_onset_422"
  */
    public Integer getField422() {
        return this.field422;
    }

    public void setField422(Integer field422) {
        this.field422 = field422;
    }





 /**
  * @return
  * @hibernate.property column="if_induced_mode_423"
  */
    public Integer getField423() {
        return this.field423;
    }

    public void setField423(Integer field423) {
        this.field423 = field423;
    }





 /**
  * @return
  * @hibernate.property column="indication_induction_424"
  */
    public Integer getField424() {
        return this.field424;
    }

    public void setField424(Integer field424) {
        this.field424 = field424;
    }





 /**
  * @return
  * @hibernate.property column="indication_induction_desc_425" type="text"
  */
    public String getField425() {
        return this.field425;
    }

    public void setField425(String field425) {
        this.field425 = field425;
    }





 /**
  * @return
  * @hibernate.property column="membranes_re_330"
  */
    public Integer getField330() {
        return this.field330;
    }

    public void setField330(Integer field330) {
        this.field330 = field330;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_date_328"
  */
    public Date getField328() {
        return this.field328;
    }

    public void setField328(Date field328) {
        this.field328 = field328;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_time_329"
  */
    public Time getField329() {
        return this.field329;
    }

    public void setField329(Time field329) {
        this.field329 = field329;
    }





 /**
  * @return
  * @hibernate.property column="liquor_331"
  */
    public Integer getField331() {
        return this.field331;
    }

    public void setField331(Integer field331) {
        this.field331 = field331;
    }





 /**
  * @return
  * @hibernate.property column="foul_smell_278"
  */
    public Byte getField278() {
        return this.field278;
    }

    public void setField278(Byte field278) {
        this.field278 = field278;
    }













 /**
  * @return
  * @hibernate.property column="date_first_stage_began"
  */
    public Date getField1821() {
        return this.field1821;
    }

    public void setField1821(Date field1821) {
        this.field1821 = field1821;
    }





 /**
  * @return
  * @hibernate.property column="first_stage_began_431"
  */
    public Time getField431() {
        return this.field431;
    }

    public void setField431(Time field431) {
        this.field431 = field431;
    }





 /**
  * @return
  * @hibernate.property column="date_complete_dilitation"
  */
    public Date getField1824() {
        return this.field1824;
    }

    public void setField1824(Date field1824) {
        this.field1824 = field1824;
    }





 /**
  * @return
  * @hibernate.property column="complete_dilitation_432"
  */
    public Time getField432() {
        return this.field432;
    }

    public void setField432(Time field432) {
        this.field432 = field432;
    }





 /**
  * @return
  * @hibernate.property column="date_placenta_delivered"
  */
    public Date getField1822() {
        return this.field1822;
    }

    public void setField1822(Date field1822) {
        this.field1822 = field1822;
    }





 /**
  * @return
  * @hibernate.property column="placenta_delivered_438"
  */
    public Time getField438() {
        return this.field438;
    }

    public void setField438(Time field438) {
        this.field438 = field438;
    }





 /**
  * @return
  * @hibernate.property column="abnormality_at_dilatation_433"
  */
    public Byte getField433() {
        return this.field433;
    }

    public void setField433(Byte field433) {
        this.field433 = field433;
    }













 /**
  * @return
  * @hibernate.property column="abnormality_at_delivery_435"
  */
    public Byte getField435() {
        return this.field435;
    }

    public void setField435(Byte field435) {
        this.field435 = field435;
    }





 /**
  * @return
  * @hibernate.property column="labour_augmented_436"
  */
    public Byte getField436() {
        return this.field436;
    }

    public void setField436(Byte field436) {
        this.field436 = field436;
    }





 /**
  * @return
  * @hibernate.property column="bladder_emptied_437"
  */
    public Byte getField437() {
        return this.field437;
    }

    public void setField437(Byte field437) {
        this.field437 = field437;
    }





 /**
  * @return
  * @hibernate.property column="mode_of_delivery_447"
  */
    public Integer getField447() {
        return this.field447;
    }

    public void setField447(Integer field447) {
        this.field447 = field447;
    }





 /**
  * @return
  * @hibernate.property column="mode_of_delivery_cs_448"
  */
    public Integer getField448() {
        return this.field448;
    }

    public void setField448(Integer field448) {
        this.field448 = field448;
    }





 /**
  * @return
  * @hibernate.property column="indication_CS_forcepts_60"
  */
    public Integer getField60() {
        return this.field60;
    }

    public void setField60(Integer field60) {
        this.field60 = field60;
    }





 /**
  * @return
  * @hibernate.property column="indication_CS_forcepts_desc_61" type="text"
  */
    public String getField61() {
        return this.field61;
    }

    public void setField61(String field61) {
        this.field61 = field61;
    }





 /**
  * @return
  * @hibernate.property column="anesthesia_delivery_451"
  */
    public Integer getField451() {
        return this.field451;
    }

    public void setField451(Integer field451) {
        this.field451 = field451;
    }





 /**
  * @return
  * @hibernate.property column="episiotomy_performed_452"
  */
    public Byte getField452() {
        return this.field452;
    }

    public void setField452(Byte field452) {
        this.field452 = field452;
    }





 /**
  * @return
  * @hibernate.property column="genital_laceration_453"
  */
    public Byte getField453() {
        return this.field453;
    }

    public void setField453(Byte field453) {
        this.field453 = field453;
    }





 /**
  * @return
  * @hibernate.property column="episiotomy_extension_454"
  */
    public Integer getField454() {
        return this.field454;
    }

    public void setField454(Integer field454) {
        this.field454 = field454;
    }





 /**
  * @return
  * @hibernate.property column="anterior_laceration_depth_455"
  */
    public Integer getField455() {
        return this.field455;
    }

    public void setField455(Integer field455) {
        this.field455 = field455;
    }





 /**
  * @return
  * @hibernate.property column="anterior_laceration_sutured_456"
  */
    public Integer getField456() {
        return this.field456;
    }

    public void setField456(Integer field456) {
        this.field456 = field456;
    }





 /**
  * @return
  * @hibernate.property column="posterior_laceration_depth_457"
  */
    public Integer getField457() {
        return this.field457;
    }

    public void setField457(Integer field457) {
        this.field457 = field457;
    }





 /**
  * @return
  * @hibernate.property column="posterior_laceration_sutured_458"
  */
    public Byte getField458() {
        return this.field458;
    }

    public void setField458(Byte field458) {
        this.field458 = field458;
    }





 /**
  * @return
  * @hibernate.property column="cervical_laceration_459"
  */
    public Byte getField459() {
        return this.field459;
    }

    public void setField459(Byte field459) {
        this.field459 = field459;
    }





 /**
  * @return
  * @hibernate.property column="cervical_laceration_sutured_460"
  */
    public Byte getField460() {
        return this.field460;
    }

    public void setField460(Byte field460) {
        this.field460 = field460;
    }





 /**
  * @return
  * @hibernate.property column="placenta_delivery_method_439"
  */
    public Integer getField439() {
        return this.field439;
    }

    public void setField439(Integer field439) {
        this.field439 = field439;
    }





 /**
  * @return
  * @hibernate.property column="utherine_massage"
  */
    public Byte getField2045() {
        return this.field2045;
    }

    public void setField2045(Byte field2045) {
        this.field2045 = field2045;
    }





 /**
  * @return
  * @hibernate.property column="uterotonic_med_given"
  */
    public Integer getField2046() {
        return this.field2046;
    }

    public void setField2046(Integer field2046) {
        this.field2046 = field2046;
    }





 /**
  * @return
  * @hibernate.property column="pph"
  */
    public Byte getField1753() {
        return this.field1753;
    }

    public void setField1753(Byte field1753) {
        this.field1753 = field1753;
    }





 /**
  * @return
  * @hibernate.property column="blood_loss_est_462"
  */
    public Integer getField462() {
        return this.field462;
    }

    public void setField462(Integer field462) {
        this.field462 = field462;
    }





 /**
  * @return
  * @hibernate.property column="pph_treatment_463"
  */
    public Integer getField463() {
        return this.field463;
    }

    public void setField463(Integer field463) {
        this.field463 = field463;
    }





 /**
  * @return
  * @hibernate.property column="if_blood_transfusion_1177"
  */
    public Integer getField1177() {
        return this.field1177;
    }

    public void setField1177(Integer field1177) {
        this.field1177 = field1177;
    }





 /**
  * @return
  * @hibernate.property column="drugs_or_iv_fluids_1178"
  */
    public Integer getField1178() {
        return this.field1178;
    }

    public void setField1178(Integer field1178) {
        this.field1178 = field1178;
    }





 /**
  * @return
  * @hibernate.property column="iv_fluid_volume_1179"
  */
    public Integer getField1179() {
        return this.field1179;
    }

    public void setField1179(Integer field1179) {
        this.field1179 = field1179;
    }





 /**
  * @return
  * @hibernate.property column="treatment_method_desc_464" type="text"
  */
    public String getField464() {
        return this.field464;
    }

    public void setField464(String field464) {
        this.field464 = field464;
    }





 /**
  * @return
  * @hibernate.property column="complications_467"
  */
    public Byte getField467() {
        return this.field467;
    }

    public void setField467(Byte field467) {
        this.field467 = field467;
    }





 /**
  * @return
  * @hibernate.property column="if_complications_desc_468" type="text"
  */
    public String getField468() {
        return this.field468;
    }

    public void setField468(String field468) {
        this.field468 = field468;
    }





 /**
  * @return
  * @hibernate.property column="colour_of_placenta_470"
  */
    public Integer getField470() {
        return this.field470;
    }

    public void setField470(Integer field470) {
        this.field470 = field470;
    }





 /**
  * @return
  * @hibernate.property column="presence_of_infarcts_471"
  */
    public Byte getField471() {
        return this.field471;
    }

    public void setField471(Byte field471) {
        this.field471 = field471;
    }





 /**
  * @return
  * @hibernate.property column="presence_of_clots_472"
  */
    public Byte getField472() {
        return this.field472;
    }

    public void setField472(Byte field472) {
        this.field472 = field472;
    }





 /**
  * @return
  * @hibernate.property column="extension_of_vessels_473"
  */
    public Byte getField473() {
        return this.field473;
    }

    public void setField473(Byte field473) {
        this.field473 = field473;
    }





 /**
  * @return
  * @hibernate.property column="other_placenta_abnormal_474" type="text"
  */
    public String getField474() {
        return this.field474;
    }

    public void setField474(String field474) {
        this.field474 = field474;
    }





 /**
  * @return
  * @hibernate.property column="haemorrhage_irt_placenta_475"
  */
    public Integer getField475() {
        return this.field475;
    }

    public void setField475(Integer field475) {
        this.field475 = field475;
    }





 /**
  * @return
  * @hibernate.property column="placenta_type_440"
  */
    public Integer getField440() {
        return this.field440;
    }

    public void setField440(Integer field440) {
        this.field440 = field440;
    }





 /**
  * @return
  * @hibernate.property column="state_of_placenta_1204"
  */
    public Integer getField1204() {
        return this.field1204;
    }

    public void setField1204(Integer field1204) {
        this.field1204 = field1204;
    }





 /**
  * @return
  * @hibernate.property column="weight_of_placenta_441"
  */
    public Integer getField441() {
        return this.field441;
    }

    public void setField441(Integer field441) {
        this.field441 = field441;
    }





 /**
  * @return
  * @hibernate.property column="mode_of_cord_insert_442"
  */
    public Integer getField442() {
        return this.field442;
    }

    public void setField442(Integer field442) {
        this.field442 = field442;
    }





 /**
  * @return
  * @hibernate.property column="blood_vessels_in_cord"
  */
    public Integer getField1767() {
        return this.field1767;
    }

    public void setField1767(Integer field1767) {
        this.field1767 = field1767;
    }





 /**
  * @return
  * @hibernate.property column="urine_passed_465"
  */
    public Byte getField465() {
        return this.field465;
    }

    public void setField465(Byte field465) {
        this.field465 = field465;
    }





 /**
  * @return
  * @hibernate.property column="bowel_movement_postpartum_466"
  */
    public Byte getField466() {
        return this.field466;
    }

    public void setField466(Byte field466) {
        this.field466 = field466;
    }





 /**
  * @return
  * @hibernate.property column="comments" type="text"
  */
    public String getField1926() {
        return this.field1926;
    }

    public void setField1926(String field1926) {
        this.field1926 = field1926;
    }





}
