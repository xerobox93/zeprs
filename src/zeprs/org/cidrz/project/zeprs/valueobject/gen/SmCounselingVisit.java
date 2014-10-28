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
 * JavaBean SmCounselingVisit generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Counseling Visit
 *         Form Id: 91
 */

/**
 * @hibernate.joined-subclass table="smcounselingvisit"
 * @hibernate.joined-subclass-key column="id"
 */
public class SmCounselingVisit extends EncounterData {

private Date field1882;	//counseling_date
private Byte field1930;	//counselled
private Integer field1931;	//hiv_tested
private transient Byte field1864;	//tested
private Date field1865;	//testDate
private Integer field1866;	//hiv_test_result
private Byte field1867;	//patient_received_results
private Integer field2146;	//partner_tested_for_hiv
private Date field2147;	//partner_tested_date
private Integer field2148;	//partner_hiv_result


 /**
  * @return
  * @hibernate.property column="counseling_date"
  */
    public Date getField1882() {
        return this.field1882;
    }

    public void setField1882(Date field1882) {
        this.field1882 = field1882;
    }





 /**
  * @return
  * @hibernate.property column="counselled"
  */
    public Byte getField1930() {
        return this.field1930;
    }

    public void setField1930(Byte field1930) {
        this.field1930 = field1930;
    }





 /**
  * @return
  * @hibernate.property column="hiv_tested"
  */
    public Integer getField1931() {
        return this.field1931;
    }

    public void setField1931(Integer field1931) {
        this.field1931 = field1931;
    }









 /**
  * @return
  * @hibernate.property column="testDate"
  */
    public Date getField1865() {
        return this.field1865;
    }

    public void setField1865(Date field1865) {
        this.field1865 = field1865;
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
  * @hibernate.property column="patient_received_results"
  */
    public Byte getField1867() {
        return this.field1867;
    }

    public void setField1867(Byte field1867) {
        this.field1867 = field1867;
    }





 /**
  * @return
  * @hibernate.property column="partner_tested_for_hiv"
  */
    public Integer getField2146() {
        return this.field2146;
    }

    public void setField2146(Integer field2146) {
        this.field2146 = field2146;
    }





 /**
  * @return
  * @hibernate.property column="partner_tested_date"
  */
    public Date getField2147() {
        return this.field2147;
    }

    public void setField2147(Date field2147) {
        this.field2147 = field2147;
    }





 /**
  * @return
  * @hibernate.property column="partner_hiv_result"
  */
    public Integer getField2148() {
        return this.field2148;
    }

    public void setField2148(Integer field2148) {
        this.field2148 = field2148;
    }





}
