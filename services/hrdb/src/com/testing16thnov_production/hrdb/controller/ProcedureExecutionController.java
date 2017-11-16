/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import com.testing16thnov_production.hrdb.service.HrdbProcedureExecutorService;
import com.testing16thnov_production.hrdb.models.procedure.*;

@RestController(value = "Hrdb.ProcedureExecutionController")
@RequestMapping("/hrdb/procedureExecutor")
@Api(value = "ProcedureExecutionController", description = "controller class for procedure execution")
public class ProcedureExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

    @Autowired
    private HrdbProcedureExecutorService procedureService;

    @RequestMapping(value = "/procedure/execute/Procedure_CreateEmptyBlock", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Create Empty Block")
    public ProcedureCreateEmptyBlockResponse executeProcedure_CreateEmptyBlock(@RequestParam(value = "B_ADDR") Integer baddr, @RequestParam(value = "B_COUNT") Integer bcount, HttpServletRequest _request) {
        LOGGER.debug("Executing named procedure: Procedure_CreateEmptyBlock");
        ProcedureCreateEmptyBlockResponse _result = procedureService.executeProcedure_CreateEmptyBlock(baddr, bcount);
        LOGGER.debug("got the result for named procedure: Procedure_CreateEmptyBlock, result:{}", _result);
        return _result;
    }

}


