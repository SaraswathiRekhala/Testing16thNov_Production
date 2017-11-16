/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testing16thnov_production.db123__.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

import com.testing16thnov_production.db123__.models.procedure.*;

@Service
public class Db123__ProcedureExecutorServiceImpl implements Db123__ProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Db123__ProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("db123__WMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;

    @Transactional(value = "db123__TransactionManager")
    @Override
    public ProcedureOnlyInResponse executeProcedure_OnlyIN(Integer id) {
        Map params = new HashMap(1);

        params.put("id", id);

        return procedureExecutor.executeNamedProcedure("Procedure_OnlyIN", params, ProcedureOnlyInResponse.class);
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public Void executeProcedure_InsertQuery(ProcedureInsertQueryRequest procedureInsertQueryRequest) {
        Map params = new HashMap(14);

        params.put("ASSIGNEDID", procedureInsertQueryRequest.getAssignedid());
        params.put("SHORTCOL", procedureInsertQueryRequest.getShortcol());
        params.put("INTCOL", procedureInsertQueryRequest.getIntcol());
        params.put("FLOATCOL", procedureInsertQueryRequest.getFloatcol());
        params.put("LONGCOL", procedureInsertQueryRequest.getLongcol());
        params.put("DOUBLECOL", procedureInsertQueryRequest.getDoublecol());
        params.put("BIGINTCOL", procedureInsertQueryRequest.getBigintcol());
        params.put("BIGDECCOL", procedureInsertQueryRequest.getBigdeccol());
        params.put("CHARCOL", procedureInsertQueryRequest.getCharcol());
        params.put("TEXTCOL", procedureInsertQueryRequest.getTextcol());
        params.put("CLOBCOL", procedureInsertQueryRequest.getClobcol());
        params.put("TIMESTAMPCOL", procedureInsertQueryRequest.getTimestampcol());
        params.put("BOOLEANCOL", procedureInsertQueryRequest.getBooleancol());
        params.put("BLOBCOL", procedureInsertQueryRequest.getBlobcol());

        return procedureExecutor.executeNamedProcedure("Procedure_InsertQuery", params, Void.class);
    }

}


