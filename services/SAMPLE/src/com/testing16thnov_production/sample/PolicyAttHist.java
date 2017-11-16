/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * PolicyAttHist generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`POLICY_ATT_HIST`")
@IdClass(PolicyAttHistId.class)
public class PolicyAttHist implements Serializable {

    private String bank;
    private Timestamp busBegin;
    private Timestamp busEnd;
    private String client;
    private String type;
    private Integer pay;

    @Id
    @Column(name = "`BANK`", nullable = false, length = 4)
    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Id
    @Column(name = "`BUS_BEGIN`", nullable = false)
    public Timestamp getBusBegin() {
        return this.busBegin;
    }

    public void setBusBegin(Timestamp busBegin) {
        this.busBegin = busBegin;
    }

    @Id
    @Column(name = "`BUS_END`", nullable = false)
    public Timestamp getBusEnd() {
        return this.busEnd;
    }

    public void setBusEnd(Timestamp busEnd) {
        this.busEnd = busEnd;
    }

    @Id
    @Column(name = "`CLIENT`", nullable = false, length = 4)
    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Id
    @Column(name = "`TYPE`", nullable = true, length = 5)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @Column(name = "`PAY`", nullable = true, scale = 0, precision = 10)
    public Integer getPay() {
        return this.pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolicyAttHist)) return false;
        final PolicyAttHist policyAttHist = (PolicyAttHist) o;
        return Objects.equals(getBank(), policyAttHist.getBank()) &&
                Objects.equals(getBusBegin(), policyAttHist.getBusBegin()) &&
                Objects.equals(getBusEnd(), policyAttHist.getBusEnd()) &&
                Objects.equals(getClient(), policyAttHist.getClient()) &&
                Objects.equals(getType(), policyAttHist.getType()) &&
                Objects.equals(getPay(), policyAttHist.getPay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBank(),
                getBusBegin(),
                getBusEnd(),
                getClient(),
                getType(),
                getPay());
    }
}
