/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class TableName_2Id implements Serializable {

    private Integer column12;
    private Integer column22;

    public Integer getColumn12() {
        return this.column12;
    }

    public void setColumn12(Integer column12) {
        this.column12 = column12;
    }

    public Integer getColumn22() {
        return this.column22;
    }

    public void setColumn22(Integer column22) {
        this.column22 = column22;
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
