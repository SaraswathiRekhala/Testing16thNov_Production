/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing16thnov_production.hrdb.service;

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

import com.testing16thnov_production.hrdb.User;


/**
 * ServiceImpl object for domain model class User.
 *
 * @see User
 */
@Service("hrdb.UserService")
@Validated
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    @Qualifier("hrdb.UserDao")
    private WMGenericDao<User, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<User, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "hrdbTransactionManager")
    @Override
	public User create(User user) {
        LOGGER.debug("Creating a new User with information: {}", user);
        User userCreated = this.wmGenericDao.create(user);
        return userCreated;
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public User getById(Integer userIdInstance) throws EntityNotFoundException {
        LOGGER.debug("Finding User by id: {}", userIdInstance);
        User user = this.wmGenericDao.findById(userIdInstance);
        if (user == null){
            LOGGER.debug("No User found with id: {}", userIdInstance);
            throw new EntityNotFoundException(String.valueOf(userIdInstance));
        }
        return user;
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public User findById(Integer userIdInstance) {
        LOGGER.debug("Finding User by id: {}", userIdInstance);
        return this.wmGenericDao.findById(userIdInstance);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "hrdbTransactionManager")
	@Override
	public User update(User user) throws EntityNotFoundException {
        LOGGER.debug("Updating User with information: {}", user);
        this.wmGenericDao.update(user);

        Integer userIdInstance = user.getUserId();

        return this.wmGenericDao.findById(userIdInstance);
    }

    @Transactional(value = "hrdbTransactionManager")
	@Override
	public User delete(Integer userIdInstance) throws EntityNotFoundException {
        LOGGER.debug("Deleting User with id: {}", userIdInstance);
        User deleted = this.wmGenericDao.findById(userIdInstance);
        if (deleted == null) {
            LOGGER.debug("No User found with id: {}", userIdInstance);
            throw new EntityNotFoundException(String.valueOf(userIdInstance));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public Page<User> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Users");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Page<User> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Users");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service hrdb for table User to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

