/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing16thnov_production.sample.HistPolicyInfoBtt;
import com.testing16thnov_production.sample.HistPolicyInfoBttId;

/**
 * Service object for domain model class {@link HistPolicyInfoBtt}.
 */
public interface HistPolicyInfoBttService {

    /**
     * Creates a new HistPolicyInfoBtt. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on HistPolicyInfoBtt if any.
     *
     * @param histPolicyInfoBtt Details of the HistPolicyInfoBtt to be created; value cannot be null.
     * @return The newly created HistPolicyInfoBtt.
     */
	HistPolicyInfoBtt create(@Valid HistPolicyInfoBtt histPolicyInfoBtt);


	/**
	 * Returns HistPolicyInfoBtt by given id if exists.
	 *
	 * @param histpolicyinfobttId The id of the HistPolicyInfoBtt to get; value cannot be null.
	 * @return HistPolicyInfoBtt associated with the given histpolicyinfobttId.
     * @throws EntityNotFoundException If no HistPolicyInfoBtt is found.
	 */
	HistPolicyInfoBtt getById(HistPolicyInfoBttId histpolicyinfobttId) throws EntityNotFoundException;

    /**
	 * Find and return the HistPolicyInfoBtt by given id if exists, returns null otherwise.
	 *
	 * @param histpolicyinfobttId The id of the HistPolicyInfoBtt to get; value cannot be null.
	 * @return HistPolicyInfoBtt associated with the given histpolicyinfobttId.
	 */
	HistPolicyInfoBtt findById(HistPolicyInfoBttId histpolicyinfobttId);


	/**
	 * Updates the details of an existing HistPolicyInfoBtt. It replaces all fields of the existing HistPolicyInfoBtt with the given histPolicyInfoBtt.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on HistPolicyInfoBtt if any.
     *
	 * @param histPolicyInfoBtt The details of the HistPolicyInfoBtt to be updated; value cannot be null.
	 * @return The updated HistPolicyInfoBtt.
	 * @throws EntityNotFoundException if no HistPolicyInfoBtt is found with given input.
	 */
	HistPolicyInfoBtt update(@Valid HistPolicyInfoBtt histPolicyInfoBtt) throws EntityNotFoundException;

    /**
	 * Deletes an existing HistPolicyInfoBtt with the given id.
	 *
	 * @param histpolicyinfobttId The id of the HistPolicyInfoBtt to be deleted; value cannot be null.
	 * @return The deleted HistPolicyInfoBtt.
	 * @throws EntityNotFoundException if no HistPolicyInfoBtt found with the given id.
	 */
	HistPolicyInfoBtt delete(HistPolicyInfoBttId histpolicyinfobttId) throws EntityNotFoundException;

	/**
	 * Find all HistPolicyInfoBtts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching HistPolicyInfoBtts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<HistPolicyInfoBtt> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all HistPolicyInfoBtts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching HistPolicyInfoBtts.
     *
     * @see Pageable
     * @see Page
	 */
    Page<HistPolicyInfoBtt> findAll(String query, Pageable pageable);

    /**
	 * Exports all HistPolicyInfoBtts matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the HistPolicyInfoBtts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the HistPolicyInfoBtt.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

