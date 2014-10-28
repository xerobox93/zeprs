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
 * JavaBean Urinalysis generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Urinalysis
 *         Form Id: 104
 */

/**
 * @hibernate.joined-subclass table="urinalysis"
 * @hibernate.joined-subclass-key column="id"
 */
public class Urinalysis extends EncounterData {

private Integer field2038;	//leuk_est
private Integer field2041;	//nitrite
private Integer field244;	//urinalysis_ace_244
private Integer field242;	//urinalysis_alb_242
private Integer field243;	//urinalysis_glu_243
private Integer field2042;	//wbc_urinalysis
private Integer field2043;	//bacteria
private Long field2037;	//labtest_id


 /**
  * @return
  * @hibernate.property column="leuk_est"
  */
    public Integer getField2038() {
        return this.field2038;
    }

    public void setField2038(Integer field2038) {
        this.field2038 = field2038;
    }





 /**
  * @return
  * @hibernate.property column="nitrite"
  */
    public Integer getField2041() {
        return this.field2041;
    }

    public void setField2041(Integer field2041) {
        this.field2041 = field2041;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_ace_244"
  */
    public Integer getField244() {
        return this.field244;
    }

    public void setField244(Integer field244) {
        this.field244 = field244;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_alb_242"
  */
    public Integer getField242() {
        return this.field242;
    }

    public void setField242(Integer field242) {
        this.field242 = field242;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_glu_243"
  */
    public Integer getField243() {
        return this.field243;
    }

    public void setField243(Integer field243) {
        this.field243 = field243;
    }





 /**
  * @return
  * @hibernate.property column="wbc_urinalysis"
  */
    public Integer getField2042() {
        return this.field2042;
    }

    public void setField2042(Integer field2042) {
        this.field2042 = field2042;
    }





 /**
  * @return
  * @hibernate.property column="bacteria"
  */
    public Integer getField2043() {
        return this.field2043;
    }

    public void setField2043(Integer field2043) {
        this.field2043 = field2043;
    }





 /**
  * @return
  * @hibernate.property column="labtest_id"
  */
    public Long getField2037() {
        return this.field2037;
    }

    public void setField2037(Long field2037) {
        this.field2037 = field2037;
    }





}
