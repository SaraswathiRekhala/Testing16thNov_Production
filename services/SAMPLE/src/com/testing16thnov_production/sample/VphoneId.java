/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class VphoneId implements Serializable {

    private String lastname;
    private String firstname;
    private String middleinitial;
    private String phonenumber;
    private String employeenumber;
    private String deptnumber;
    private String deptname;

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleinitial() {
        return this.middleinitial;
    }

    public void setMiddleinitial(String middleinitial) {
        this.middleinitial = middleinitial;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmployeenumber() {
        return this.employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getDeptnumber() {
        return this.deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    public String getDeptname() {
        return this.deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vphone)) return false;
        final Vphone vphone = (Vphone) o;
        return Objects.equals(getLastname(), vphone.getLastname()) &&
                Objects.equals(getFirstname(), vphone.getFirstname()) &&
                Objects.equals(getMiddleinitial(), vphone.getMiddleinitial()) &&
                Objects.equals(getPhonenumber(), vphone.getPhonenumber()) &&
                Objects.equals(getEmployeenumber(), vphone.getEmployeenumber()) &&
                Objects.equals(getDeptnumber(), vphone.getDeptnumber()) &&
                Objects.equals(getDeptname(), vphone.getDeptname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastname(),
                getFirstname(),
                getMiddleinitial(),
                getPhonenumber(),
                getEmployeenumber(),
                getDeptnumber(),
                getDeptname());
    }
}