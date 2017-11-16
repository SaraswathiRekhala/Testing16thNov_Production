/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testing16thnov_production.sample.PolicyInfoAttOverlapNotPk;
import com.testing16thnov_production.sample.service.PolicyInfoAttOverlapNotPkService;


/**
 * Controller object for domain model class PolicyInfoAttOverlapNotPk.
 * @see PolicyInfoAttOverlapNotPk
 */
@RestController("SAMPLE.PolicyInfoAttOverlapNotPkController")
@Api(value = "PolicyInfoAttOverlapNotPkController", description = "Exposes APIs to work with PolicyInfoAttOverlapNotPk resource.")
@RequestMapping("/SAMPLE/PolicyInfoAttOverlapNotPk")
public class PolicyInfoAttOverlapNotPkController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyInfoAttOverlapNotPkController.class);

    @Autowired
	@Qualifier("SAMPLE.PolicyInfoAttOverlapNotPkService")
	private PolicyInfoAttOverlapNotPkService policyInfoAttOverlapNotPkService;

	@ApiOperation(value = "Creates a new PolicyInfoAttOverlapNotPk instance.")
@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
public PolicyInfoAttOverlapNotPk createPolicyInfoAttOverlapNotPk(@RequestBody PolicyInfoAttOverlapNotPk policyInfoAttOverlapNotPk) {
		LOGGER.debug("Create PolicyInfoAttOverlapNotPk with information: {}" , policyInfoAttOverlapNotPk);

		policyInfoAttOverlapNotPk = policyInfoAttOverlapNotPkService.create(policyInfoAttOverlapNotPk);
		LOGGER.debug("Created PolicyInfoAttOverlapNotPk with information: {}" , policyInfoAttOverlapNotPk);

	    return policyInfoAttOverlapNotPk;
	}

    @ApiOperation(value = "Returns the PolicyInfoAttOverlapNotPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyInfoAttOverlapNotPk getPolicyInfoAttOverlapNotPk(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Getting PolicyInfoAttOverlapNotPk with id: {}" , id);

        PolicyInfoAttOverlapNotPk foundPolicyInfoAttOverlapNotPk = policyInfoAttOverlapNotPkService.getById(id);
        LOGGER.debug("PolicyInfoAttOverlapNotPk details with id: {}" , foundPolicyInfoAttOverlapNotPk);

        return foundPolicyInfoAttOverlapNotPk;
    }

    @ApiOperation(value = "Updates the PolicyInfoAttOverlapNotPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyInfoAttOverlapNotPk editPolicyInfoAttOverlapNotPk(@PathVariable("id") String id, @RequestBody PolicyInfoAttOverlapNotPk policyInfoAttOverlapNotPk) throws EntityNotFoundException {
        LOGGER.debug("Editing PolicyInfoAttOverlapNotPk with id: {}" , policyInfoAttOverlapNotPk.getPolicyId());

        policyInfoAttOverlapNotPk.setPolicyId(id);
        policyInfoAttOverlapNotPk = policyInfoAttOverlapNotPkService.update(policyInfoAttOverlapNotPk);
        LOGGER.debug("PolicyInfoAttOverlapNotPk details with id: {}" , policyInfoAttOverlapNotPk);

        return policyInfoAttOverlapNotPk;
    }

    @ApiOperation(value = "Deletes the PolicyInfoAttOverlapNotPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deletePolicyInfoAttOverlapNotPk(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Deleting PolicyInfoAttOverlapNotPk with id: {}" , id);

        PolicyInfoAttOverlapNotPk deletedPolicyInfoAttOverlapNotPk = policyInfoAttOverlapNotPkService.delete(id);

        return deletedPolicyInfoAttOverlapNotPk != null;
    }

    /**
     * @deprecated Use {@link #findPolicyInfoAttOverlapNotPks(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of PolicyInfoAttOverlapNotPk instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyInfoAttOverlapNotPk> searchPolicyInfoAttOverlapNotPksByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PolicyInfoAttOverlapNotPks list");
        return policyInfoAttOverlapNotPkService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyInfoAttOverlapNotPk instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyInfoAttOverlapNotPk> findPolicyInfoAttOverlapNotPks(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyInfoAttOverlapNotPks list");
        return policyInfoAttOverlapNotPkService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyInfoAttOverlapNotPk instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyInfoAttOverlapNotPk> filterPolicyInfoAttOverlapNotPks(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyInfoAttOverlapNotPks list");
        return policyInfoAttOverlapNotPkService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportPolicyInfoAttOverlapNotPks(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return policyInfoAttOverlapNotPkService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of PolicyInfoAttOverlapNotPk instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countPolicyInfoAttOverlapNotPks( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting PolicyInfoAttOverlapNotPks");
		return policyInfoAttOverlapNotPkService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getPolicyInfoAttOverlapNotPkAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return policyInfoAttOverlapNotPkService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PolicyInfoAttOverlapNotPkService instance
	 */
	protected void setPolicyInfoAttOverlapNotPkService(PolicyInfoAttOverlapNotPkService service) {
		this.policyInfoAttOverlapNotPkService = service;
	}

}

