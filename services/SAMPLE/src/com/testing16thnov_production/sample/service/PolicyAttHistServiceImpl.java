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

import com.testing16thnov_production.sample.PolicyAttHist;
import com.testing16thnov_production.sample.PolicyAttHistId;


/**
 * ServiceImpl object for domain model class PolicyAttHist.
 *
 * @see PolicyAttHist
 */
@Service("SAMPLE.PolicyAttHistService")
@Validated
public class PolicyAttHistServiceImpl implements PolicyAttHistService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyAttHistServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE.PolicyAttHistDao")
    private WMGenericDao<PolicyAttHist, PolicyAttHistId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PolicyAttHist, PolicyAttHistId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLETransactionManager")
    @Override
	public PolicyAttHist create(PolicyAttHist policyAttHist) {
        LOGGER.debug("Creating a new PolicyAttHist with information: {}", policyAttHist);
        PolicyAttHist policyAttHistCreated = this.wmGenericDao.create(policyAttHist);
        return policyAttHistCreated;
    }

	@Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public PolicyAttHist getById(PolicyAttHistId policyatthistId) throws EntityNotFoundException {
        LOGGER.debug("Finding PolicyAttHist by id: {}", policyatthistId);
        PolicyAttHist policyAttHist = this.wmGenericDao.findById(policyatthistId);
        if (policyAttHist == null){
            LOGGER.debug("No PolicyAttHist found with id: {}", policyatthistId);
            throw new EntityNotFoundException(String.valueOf(policyatthistId));
        }
        return policyAttHist;
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public PolicyAttHist findById(PolicyAttHistId policyatthistId) {
        LOGGER.debug("Finding PolicyAttHist by id: {}", policyatthistId);
        return this.wmGenericDao.findById(policyatthistId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLETransactionManager")
	@Override
	public PolicyAttHist update(PolicyAttHist policyAttHist) throws EntityNotFoundException {
        LOGGER.debug("Updating PolicyAttHist with information: {}", policyAttHist);
        this.wmGenericDao.update(policyAttHist);

        PolicyAttHistId policyatthistId = new PolicyAttHistId();
        policyatthistId.setBank(policyAttHist.getBank());
        policyatthistId.setBusBegin(policyAttHist.getBusBegin());
        policyatthistId.setBusEnd(policyAttHist.getBusEnd());
        policyatthistId.setClient(policyAttHist.getClient());
        policyatthistId.setType(policyAttHist.getType());
        policyatthistId.setPay(policyAttHist.getPay());

        return this.wmGenericDao.findById(policyatthistId);
    }

    @Transactional(value = "SAMPLETransactionManager")
	@Override
	public PolicyAttHist delete(PolicyAttHistId policyatthistId) throws EntityNotFoundException {
        LOGGER.debug("Deleting PolicyAttHist with id: {}", policyatthistId);
        PolicyAttHist deleted = this.wmGenericDao.findById(policyatthistId);
        if (deleted == null) {
            LOGGER.debug("No PolicyAttHist found with id: {}", policyatthistId);
            throw new EntityNotFoundException(String.valueOf(policyatthistId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "SAMPLETransactionManager")
	@Override
	public Page<PolicyAttHist> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all PolicyAttHists");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
    @Override
    public Page<PolicyAttHist> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all PolicyAttHists");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLETransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE for table PolicyAttHist to {} format", exportType);
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

