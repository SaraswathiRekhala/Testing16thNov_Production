/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Userlogin generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`USERLOGIN`")
public class Userlogin implements Serializable {

    private Integer userid;
    private String username;
    private String password;
    private String role;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] profilepic;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`USERID`", nullable = false, scale = 0, precision = 10)
    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Column(name = "`USERNAME`", nullable = true, length = 255)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "`PASSWORD`", nullable = true, length = 255)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "`ROLE`", nullable = true, length = 255)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "`PROFILEPIC`", nullable = true)
    public byte[] getProfilepic() {
        return this.profilepic;
    }

    public void setProfilepic(byte[] profilepic) {
        this.profilepic = profilepic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userlogin)) return false;
        final Userlogin userlogin = (Userlogin) o;
        return Objects.equals(getUserid(), userlogin.getUserid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid());
    }
}

