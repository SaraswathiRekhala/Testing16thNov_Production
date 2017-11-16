/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * TableName_2 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`table name+2`")
@IdClass(TableName_2Id.class)
public class TableName_2 implements Serializable {

    private Integer column12;
    private Integer column22;
    private int column32;

    @Id
    @Column(name = "`column 12`", nullable = false, scale = 0, precision = 10)
    public Integer getColumn12() {
        return this.column12;
    }

    public void setColumn12(Integer column12) {
        this.column12 = column12;
    }

    @Id
    @Column(name = "`column 22`", nullable = false, scale = 0, precision = 10)
    public Integer getColumn22() {
        return this.column22;
    }

    public void setColumn22(Integer column22) {
        this.column22 = column22;
    }

    @Column(name = "`column 32`", nullable = false, scale = 0, precision = 10)
    public int getColumn32() {
        return this.column32;
    }

    public void setColumn32(int column32) {
        this.column32 = column32;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TableName_2)) return false;
        final TableName_2 tableName2 = (TableName_2) o;
        return Objects.equals(getColumn12(), tableName2.getColumn12()) &&
                Objects.equals(getColumn22(), tableName2.getColumn22());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColumn12(),
                getColumn22());
    }
}
