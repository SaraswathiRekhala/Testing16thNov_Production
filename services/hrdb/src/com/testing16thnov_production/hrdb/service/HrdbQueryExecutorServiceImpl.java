/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testing16thnov_production.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing16thnov_production.hrdb.models.query.*;

@Service
public class HrdbQueryExecutorServiceImpl implements HrdbQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("hrdbWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Page<SvDepartmentResponse> executeSV_Department(Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.executeNamedQuery("SV_Department", params, SvDepartmentResponse.class, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Downloadable exportSV_Department(ExportType exportType, Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.exportNamedQueryData("SV_Department", params, exportType, SvDepartmentResponse.class, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Page<SvListEmpResponse> executeSV_ListEmp(List<Integer> deptId, Pageable pageable) {
        Map params = new HashMap(1);

        params.put("DeptId", deptId);

        return queryExecutor.executeNamedQuery("SV_ListEmp", params, SvListEmpResponse.class, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Downloadable exportSV_ListEmp(ExportType exportType, List<Integer> deptId, Pageable pageable) {
        Map params = new HashMap(1);

        params.put("DeptId", deptId);

        return queryExecutor.exportNamedQueryData("SV_ListEmp", params, exportType, SvListEmpResponse.class, pageable);
    }

}

