/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.sample.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing16thnov_production.sample.HistPolicyInfoBtt;
import com.testing16thnov_production.sample.HistPolicyInfoBttId;


/**
 * ServiceImpl object for domain model class HistPolicyInfoBtt.
 *
 * @see HistPolicyInfoBtt
 */
@Service("SAMPLE.HistPolicyInfoBttService")
@Validated
public class HistPolicyInfoBttServiceImpl implements HistPolicyInfoBttService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HistPolicyInfoBttServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE.HistPolicyInfoBttDao")
    private WMGenericDao<HistPolicyInfoBtt, HistPolicyInfoBttId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<HistPolicyInfoBtt, HistPolicyInfoBttId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLETransactionManager")
    @Override
	public HistPolicyInfoBtt create(HistPolicyInfoBtt histPolicyInfoBtt) {
        LOGGER.debug("Creating a new HistPolicyInfoBtt with information: {}", histPolicyInfoBtt);
        HistPolicyInfoBtt histPolicyInfoBttCreated = this.wmGenericDao.create(histPolicyInfoBtt);
        return histPolicyInfoBttCreated;
    }

	@Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public HistPolicyInfoBtt getById(HistPolicyInfoBttId histpolicyinfobttId) throws EntityNotFoundException {
        LOGGER.debug("Finding HistPolicyInfoBtt by id: {}", histpolicyinfobttId);
        HistPolicyInfoBtt histPolicyInfoBtt = this.wmGenericDao.findById(histpolicyinfobttId);
        if (histPolicyInfoBtt == null){
            LOGGER.debug("No HistPolicyInfoBtt found with id: {}", histpolicyinfobttId);
            throw new EntityNotFoundException(String.valueOf(histpolicyinfobttId));
        }
        return histPolicyInfoBtt;
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public HistPolicyInfoBtt findById(HistPolicyInfoBttId histpolicyinfobttId) {
        LOGGER.debug("Finding HistPolicyInfoBtt by id: {}", histpolicyinfobttId);
        return this.wmGenericDao.findById(histpolicyinfobttId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLETransactionManager")
	@Override
	public HistPolicyInfoBtt update(HistPolicyInfoBtt histPolicyInfoBtt) throws EntityNotFoundException {
        LOGGER.debug("Updating HistPolicyInfoBtt with information: {}", histPolicyInfoBtt);
        this.wmGenericDao.update(histPolicyInfoBtt);

        HistPolicyInfoBttId histpolicyinfobttId = new HistPolicyInfoBttId();
        histpolicyinfobttId.setPolicyId(histPolicyInfoBtt.getPolicyId());
        histpolicyinfobttId.setCoverage(histPolicyInfoBtt.getCoverage());
        histpolicyinfobttId.setBusStart(histPolicyInfoBtt.getBusStart());
        histpolicyinfobttId.setBusEnd(histPolicyInfoBtt.getBusEnd());
        histpolicyinfobttId.setSysStart(histPolicyInfoBtt.getSysStart());
        histpolicyinfobttId.setSysEnd(histPolicyInfoBtt.getSysEnd());
        histpolicyinfobttId.setTsId(histPolicyInfoBtt.getTsId());

        return this.wmGenericDao.findById(histpolicyinfobttId);
    }

    @Transactional(value = "SAMPLETransactionManager")
	@Override
	public HistPolicyInfoBtt delete(HistPolicyInfoBttId histpolicyinfobttId) throws EntityNotFoundException {
        LOGGER.debug("Deleting HistPolicyInfoBtt with id: {}", histpolicyinfobttId);
        HistPolicyInfoBtt deleted = this.wmGenericDao.findById(histpolicyinfobttId);
        if (deleted == null) {
            LOGGER.debug("No HistPolicyInfoBtt found with id: {}", histpolicyinfobttId);
            throw new EntityNotFoundException(String.valueOf(histpolicyinfobttId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public Page<HistPolicyInfoBtt> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all HistPolicyInfoBtts");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
    @Override
    public Page<HistPolicyInfoBtt> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all HistPolicyInfoBtts");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE for table HistPolicyInfoBtt to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

