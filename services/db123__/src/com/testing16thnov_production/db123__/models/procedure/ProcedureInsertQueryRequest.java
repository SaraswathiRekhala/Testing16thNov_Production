/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.db123__.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ProcedureInsertQueryRequest implements Serializable {


    @JsonProperty("ASSIGNEDID")
    @NotNull
    private Integer assignedid;

    @JsonProperty("SHORTCOL")
    @NotNull
    private Short shortcol;

    @JsonProperty("INTCOL")
    @NotNull
    private Integer intcol;

    @JsonProperty("FLOATCOL")
    @NotNull
    private Float floatcol;

    @JsonProperty("LONGCOL")
    @NotNull
    private Long longcol;

    @JsonProperty("DOUBLECOL")
    @NotNull
    private Double doublecol;

    @JsonProperty("BIGINTCOL")
    @NotNull
    private BigInteger bigintcol;

    @JsonProperty("BIGDECCOL")
    @NotNull
    private BigDecimal bigdeccol;

    @JsonProperty("CHARCOL")
    @NotNull
    private String charcol;

    @JsonProperty("TEXTCOL")
    @NotNull
    private String textcol;

    @JsonProperty("CLOBCOL")
    @NotNull
    private String clobcol;

    @JsonProperty("TIMESTAMPCOL")
    @NotNull
    private LocalDateTime timestampcol;

    @JsonProperty("BOOLEANCOL")
    @NotNull
    private Boolean booleancol;

    @JsonProperty(value = "BLOBCOL", access = Access.READ_ONLY)
    private byte[] blobcol;

    public Integer getAssignedid() {
        return this.assignedid;
    }

    public void setAssignedid(Integer assignedid) {
        this.assignedid = assignedid;
    }

    public Short getShortcol() {
        return this.shortcol;
    }

    public void setShortcol(Short shortcol) {
        this.shortcol = shortcol;
    }

    public Integer getIntcol() {
        return this.intcol;
    }

    public void setIntcol(Integer intcol) {
        this.intcol = intcol;
    }

    public Float getFloatcol() {
        return this.floatcol;
    }

    public void setFloatcol(Float floatcol) {
        this.floatcol = floatcol;
    }

    public Long getLongcol() {
        return this.longcol;
    }

    public void setLongcol(Long longcol) {
        this.longcol = longcol;
    }

    public Double getDoublecol() {
        return this.doublecol;
    }

    public void setDoublecol(Double doublecol) {
        this.doublecol = doublecol;
    }

    public BigInteger getBigintcol() {
        return this.bigintcol;
    }

    public void setBigintcol(BigInteger bigintcol) {
        this.bigintcol = bigintcol;
    }

    public BigDecimal getBigdeccol() {
        return this.bigdeccol;
    }

    public void setBigdeccol(BigDecimal bigdeccol) {
        this.bigdeccol = bigdeccol;
    }

    public String getCharcol() {
        return this.charcol;
    }

    public void setCharcol(String charcol) {
        this.charcol = charcol;
    }

    public String getTextcol() {
        return this.textcol;
    }

    public void setTextcol(String textcol) {
        this.textcol = textcol;
    }

    public String getClobcol() {
        return this.clobcol;
    }

    public void setClobcol(String clobcol) {
        this.clobcol = clobcol;
    }

    public LocalDateTime getTimestampcol() {
        return this.timestampcol;
    }

    public void setTimestampcol(LocalDateTime timestampcol) {
        this.timestampcol = timestampcol;
    }

    public Boolean getBooleancol() {
        return this.booleancol;
    }

    public void setBooleancol(Boolean booleancol) {
        this.booleancol = booleancol;
    }

    public byte[] getBlobcol() {
        return this.blobcol;
    }

    public void setBlobcol(byte[] blobcol) {
        this.blobcol = blobcol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInsertQueryRequest)) return false;
        final ProcedureInsertQueryRequest procedureInsertQueryRequest = (ProcedureInsertQueryRequest) o;
        return Objects.equals(getAssignedid(), procedureInsertQueryRequest.getAssignedid()) &&
                Objects.equals(getShortcol(), procedureInsertQueryRequest.getShortcol()) &&
                Objects.equals(getIntcol(), procedureInsertQueryRequest.getIntcol()) &&
                Objects.equals(getFloatcol(), procedureInsertQueryRequest.getFloatcol()) &&
                Objects.equals(getLongcol(), procedureInsertQueryRequest.getLongcol()) &&
                Objects.equals(getDoublecol(), procedureInsertQueryRequest.getDoublecol()) &&
                Objects.equals(getBigintcol(), procedureInsertQueryRequest.getBigintcol()) &&
                Objects.equals(getBigdeccol(), procedureInsertQueryRequest.getBigdeccol()) &&
                Objects.equals(getCharcol(), procedureInsertQueryRequest.getCharcol()) &&
                Objects.equals(getTextcol(), procedureInsertQueryRequest.getTextcol()) &&
                Objects.equals(getClobcol(), procedureInsertQueryRequest.getClobcol()) &&
                Objects.equals(getTimestampcol(), procedureInsertQueryRequest.getTimestampcol()) &&
                Objects.equals(getBooleancol(), procedureInsertQueryRequest.getBooleancol()) &&
                Objects.equals(getBlobcol(), procedureInsertQueryRequest.getBlobcol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAssignedid(),
                getShortcol(),
                getIntcol(),
                getFloatcol(),
                getLongcol(),
                getDoublecol(),
                getBigintcol(),
                getBigdeccol(),
                getCharcol(),
                getTextcol(),
                getClobcol(),
                getTimestampcol(),
                getBooleancol(),
                getBlobcol());
    }
}