/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testing16thnov_production.sample.PolicySttPeriodImplicityHidden;
import com.testing16thnov_production.sample.PolicySttPeriodImplicityHiddenId;

/**
 * Specifies methods used to obtain and modify PolicySttPeriodImplicityHidden related information
 * which is stored in the database.
 */
@Repository("SAMPLE.PolicySttPeriodImplicityHiddenDao")
public class PolicySttPeriodImplicityHiddenDao extends WMGenericDaoImpl<PolicySttPeriodImplicityHidden, PolicySttPeriodImplicityHiddenId> {

    @Autowired
    @Qualifier("SAMPLETemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

