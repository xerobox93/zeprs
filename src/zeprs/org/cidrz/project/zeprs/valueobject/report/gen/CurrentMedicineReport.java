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
 * JavaBean CurrentMedicineReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Current Medicine
 *         Form Id: 55
 */

/**
 * @hibernate.joined-subclass table="currentmedicine"
 * @hibernate.joined-subclass-key column="id"
 */
public class CurrentMedicineReport extends EncounterData {

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
private transient String current_medicine_1146;	//current_medicine_1146
private String current_medicine_1146R;


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
  * @hibernate.property column="current_medicine_1146" type="text"
  */
    public String getCurrent_medicine_1146() {
        return this.current_medicine_1146;
    }

    public void setCurrent_medicine_1146(String current_medicine_1146) {
        this.current_medicine_1146 = current_medicine_1146;
    }



    public String getCurrent_medicine_1146R() {
        return this.current_medicine_1146R;
    }

    public void setCurrent_medicine_1146R(String current_medicine_1146R) {
        this.current_medicine_1146R = current_medicine_1146R;
    }



}
