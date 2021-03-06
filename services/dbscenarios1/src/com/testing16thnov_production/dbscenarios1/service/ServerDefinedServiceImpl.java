/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.dbscenarios1.service;

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

import com.testing16thnov_production.dbscenarios1.ServerDefined;


/**
 * ServiceImpl object for domain model class ServerDefined.
 *
 * @see ServerDefined
 */
@Service("dbscenarios1.ServerDefinedService")
@Validated
public class ServerDefinedServiceImpl implements ServerDefinedService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerDefinedServiceImpl.class);


    @Autowired
    @Qualifier("dbscenarios1.ServerDefinedDao")
    private WMGenericDao<ServerDefined, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ServerDefined, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "dbscenarios1TransactionManager")
    @Override
	public ServerDefined create(ServerDefined serverDefined) {
        LOGGER.debug("Creating a new ServerDefined with information: {}", serverDefined);
        ServerDefined serverDefinedCreated = this.wmGenericDao.create(serverDefined);
        return serverDefinedCreated;
    }

	@Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
	@Override
	public ServerDefined getById(Integer serverdefinedId) throws EntityNotFoundException {
        LOGGER.debug("Finding ServerDefined by id: {}", serverdefinedId);
        ServerDefined serverDefined = this.wmGenericDao.findById(serverdefinedId);
        if (serverDefined == null){
            LOGGER.debug("No ServerDefined found with id: {}", serverdefinedId);
            throw new EntityNotFoundException(String.valueOf(serverdefinedId));
        }
        return serverDefined;
    }

    @Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
	@Override
	public ServerDefined findById(Integer serverdefinedId) {
        LOGGER.debug("Finding ServerDefined by id: {}", serverdefinedId);
        return this.wmGenericDao.findById(serverdefinedId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "dbscenarios1TransactionManager")
	@Override
	public ServerDefined update(ServerDefined serverDefined) throws EntityNotFoundException {
        LOGGER.debug("Updating ServerDefined with information: {}", serverDefined);
        this.wmGenericDao.update(serverDefined);

        Integer serverdefinedId = serverDefined.getPkId();

        return this.wmGenericDao.findById(serverdefinedId);
    }

    @Transactional(value = "dbscenarios1TransactionManager")
	@Override
	public ServerDefined delete(Integer serverdefinedId) throws EntityNotFoundException {
        LOGGER.debug("Deleting ServerDefined with id: {}", serverdefinedId);
        ServerDefined deleted = this.wmGenericDao.findById(serverdefinedId);
        if (deleted == null) {
            LOGGER.debug("No ServerDefined found with id: {}", serverdefinedId);
            throw new EntityNotFoundException(String.valueOf(serverdefinedId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
	@Override
	public Page<ServerDefined> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ServerDefineds");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
    @Override
    public Page<ServerDefined> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all ServerDefineds");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service dbscenarios1 for table ServerDefined to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "dbscenarios1TransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

