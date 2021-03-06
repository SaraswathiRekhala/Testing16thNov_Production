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

import com.testing16thnov_production.sample.TableName_2;
import com.testing16thnov_production.sample.TableName_2Id;
import com.testing16thnov_production.sample.service.TableName_2Service;


/**
 * Controller object for domain model class TableName_2.
 * @see TableName_2
 */
@RestController("SAMPLE.TableName_2Controller")
@Api(value = "TableName_2Controller", description = "Exposes APIs to work with TableName_2 resource.")
@RequestMapping("/SAMPLE/TableName_2")
public class TableName_2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(TableName_2Controller.class);

    @Autowired
	@Qualifier("SAMPLE.TableName_2Service")
	private TableName_2Service tableName_2Service;

	@ApiOperation(value = "Creates a new TableName_2 instance.")
@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
public TableName_2 createTableName_2(@RequestBody TableName_2 tableName2) {
		LOGGER.debug("Create TableName_2 with information: {}" , tableName2);

		tableName2 = tableName_2Service.create(tableName2);
		LOGGER.debug("Created TableName_2 with information: {}" , tableName2);

	    return tableName2;
	}

@ApiOperation(value = "Returns the TableName_2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TableName_2 getTableName_2(@RequestParam("column12") Integer column12,@RequestParam("column22") Integer column22) throws EntityNotFoundException {

        TableName_2Id tablename2Id = new TableName_2Id();
        tablename2Id.setColumn12(column12);
        tablename2Id.setColumn22(column22);

        LOGGER.debug("Getting TableName_2 with id: {}" , tablename2Id);
        TableName_2 tableName2 = tableName_2Service.getById(tablename2Id);
        LOGGER.debug("TableName_2 details with id: {}" , tableName2);

        return tableName2;
    }



    @ApiOperation(value = "Updates the TableName_2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TableName_2 editTableName_2(@RequestParam("column12") Integer column12,@RequestParam("column22") Integer column22, @RequestBody TableName_2 tableName2) throws EntityNotFoundException {

        tableName2.setColumn12(column12);
        tableName2.setColumn22(column22);

        LOGGER.debug("TableName_2 details with id is updated with: {}" , tableName2);

        return tableName_2Service.update(tableName2);
    }


    @ApiOperation(value = "Deletes the TableName_2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTableName_2(@RequestParam("column12") Integer column12,@RequestParam("column22") Integer column22) throws EntityNotFoundException {

        TableName_2Id tablename2Id = new TableName_2Id();
        tablename2Id.setColumn12(column12);
        tablename2Id.setColumn22(column22);

        LOGGER.debug("Deleting TableName_2 with id: {}" , tablename2Id);
        TableName_2 tableName2 = tableName_2Service.delete(tablename2Id);

        return tableName2 != null;
    }


    /**
     * @deprecated Use {@link #findTableName_2s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of TableName_2 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TableName_2> searchTableName_2sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TableName_2s list");
        return tableName_2Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TableName_2 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TableName_2> findTableName_2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TableName_2s list");
        return tableName_2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TableName_2 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TableName_2> filterTableName_2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TableName_2s list");
        return tableName_2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTableName_2s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return tableName_2Service.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of TableName_2 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTableName_2s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting TableName_2s");
		return tableName_2Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTableName_2AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return tableName_2Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TableName_2Service instance
	 */
	protected void setTableName_2Service(TableName_2Service service) {
		this.tableName_2Service = service;
	}

}

