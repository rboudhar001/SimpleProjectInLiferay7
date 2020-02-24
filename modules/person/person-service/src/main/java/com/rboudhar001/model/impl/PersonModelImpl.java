/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rboudhar001.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import com.rboudhar001.model.Person;
import com.rboudhar001.model.PersonModel;
import com.rboudhar001.model.PersonSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Person service. Represents a row in the &quot;FOO_Person&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>PersonModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PersonImpl}.
 * </p>
 *
 * @author Rachid
 * @see PersonImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class PersonModelImpl
	extends BaseModelImpl<Person> implements PersonModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a person model instance should use the <code>Person</code> interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Person";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"personId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"personName", Types.VARCHAR}, {"personSurname", Types.VARCHAR},
		{"personBirthdate", Types.TIMESTAMP}, {"personEmail", Types.VARCHAR},
		{"status", Types.INTEGER}, {"statusByUserId", Types.BIGINT},
		{"statusByUserName", Types.VARCHAR}, {"statusDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("personId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("personName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("personSurname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("personBirthdate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("personEmail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table FOO_Person (uuid_ VARCHAR(75) null,personId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,personName VARCHAR(75) null,personSurname VARCHAR(75) null,personBirthdate DATE null,personEmail VARCHAR(75) null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table FOO_Person";

	public static final String ORDER_BY_JPQL =
		" ORDER BY person.personName ASC, person.personSurname ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY FOO_Person.personName ASC, FOO_Person.personSurname ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long PERSONNAME_COLUMN_BITMASK = 4L;

	public static final long PERSONSURNAME_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Person toModel(PersonSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Person model = new PersonImpl();

		model.setUuid(soapModel.getUuid());
		model.setPersonId(soapModel.getPersonId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setPersonName(soapModel.getPersonName());
		model.setPersonSurname(soapModel.getPersonSurname());
		model.setPersonBirthdate(soapModel.getPersonBirthdate());
		model.setPersonEmail(soapModel.getPersonEmail());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Person> toModels(PersonSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Person> models = new ArrayList<Person>(soapModels.length);

		for (PersonSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PersonModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _personId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPersonId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _personId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Person.class;
	}

	@Override
	public String getModelClassName() {
		return Person.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Person, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Person, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Person, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Person)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Person, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Person, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Person)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Person, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Person, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Person>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Person.class.getClassLoader(), Person.class, ModelWrapper.class);

		try {
			Constructor<Person> constructor =
				(Constructor<Person>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Person, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Person, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Person, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Person, Object>>();
		Map<String, BiConsumer<Person, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Person, ?>>();

		attributeGetterFunctions.put("uuid", Person::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Person, String>)Person::setUuid);
		attributeGetterFunctions.put("personId", Person::getPersonId);
		attributeSetterBiConsumers.put(
			"personId", (BiConsumer<Person, Long>)Person::setPersonId);
		attributeGetterFunctions.put("groupId", Person::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Person, Long>)Person::setGroupId);
		attributeGetterFunctions.put("companyId", Person::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Person, Long>)Person::setCompanyId);
		attributeGetterFunctions.put("userId", Person::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Person, Long>)Person::setUserId);
		attributeGetterFunctions.put("userName", Person::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Person, String>)Person::setUserName);
		attributeGetterFunctions.put("createDate", Person::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Person, Date>)Person::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Person::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Person, Date>)Person::setModifiedDate);
		attributeGetterFunctions.put("personName", Person::getPersonName);
		attributeSetterBiConsumers.put(
			"personName", (BiConsumer<Person, String>)Person::setPersonName);
		attributeGetterFunctions.put("personSurname", Person::getPersonSurname);
		attributeSetterBiConsumers.put(
			"personSurname",
			(BiConsumer<Person, String>)Person::setPersonSurname);
		attributeGetterFunctions.put(
			"personBirthdate", Person::getPersonBirthdate);
		attributeSetterBiConsumers.put(
			"personBirthdate",
			(BiConsumer<Person, Date>)Person::setPersonBirthdate);
		attributeGetterFunctions.put("personEmail", Person::getPersonEmail);
		attributeSetterBiConsumers.put(
			"personEmail", (BiConsumer<Person, String>)Person::setPersonEmail);
		attributeGetterFunctions.put("status", Person::getStatus);
		attributeSetterBiConsumers.put(
			"status", (BiConsumer<Person, Integer>)Person::setStatus);
		attributeGetterFunctions.put(
			"statusByUserId", Person::getStatusByUserId);
		attributeSetterBiConsumers.put(
			"statusByUserId",
			(BiConsumer<Person, Long>)Person::setStatusByUserId);
		attributeGetterFunctions.put(
			"statusByUserName", Person::getStatusByUserName);
		attributeSetterBiConsumers.put(
			"statusByUserName",
			(BiConsumer<Person, String>)Person::setStatusByUserName);
		attributeGetterFunctions.put("statusDate", Person::getStatusDate);
		attributeSetterBiConsumers.put(
			"statusDate", (BiConsumer<Person, Date>)Person::setStatusDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getPersonId() {
		return _personId;
	}

	@Override
	public void setPersonId(long personId) {
		_personId = personId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getPersonName() {
		if (_personName == null) {
			return "";
		}
		else {
			return _personName;
		}
	}

	@Override
	public void setPersonName(String personName) {
		_columnBitmask = -1L;

		if (_originalPersonName == null) {
			_originalPersonName = _personName;
		}

		_personName = personName;
	}

	public String getOriginalPersonName() {
		return GetterUtil.getString(_originalPersonName);
	}

	@JSON
	@Override
	public String getPersonSurname() {
		if (_personSurname == null) {
			return "";
		}
		else {
			return _personSurname;
		}
	}

	@Override
	public void setPersonSurname(String personSurname) {
		_columnBitmask = -1L;

		if (_originalPersonSurname == null) {
			_originalPersonSurname = _personSurname;
		}

		_personSurname = personSurname;
	}

	public String getOriginalPersonSurname() {
		return GetterUtil.getString(_originalPersonSurname);
	}

	@JSON
	@Override
	public Date getPersonBirthdate() {
		return _personBirthdate;
	}

	@Override
	public void setPersonBirthdate(Date personBirthdate) {
		_personBirthdate = personBirthdate;
	}

	@JSON
	@Override
	public String getPersonEmail() {
		if (_personEmail == null) {
			return "";
		}
		else {
			return _personEmail;
		}
	}

	@Override
	public void setPersonEmail(String personEmail) {
		_personEmail = personEmail;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Person.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Person.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Person toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Person>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PersonImpl personImpl = new PersonImpl();

		personImpl.setUuid(getUuid());
		personImpl.setPersonId(getPersonId());
		personImpl.setGroupId(getGroupId());
		personImpl.setCompanyId(getCompanyId());
		personImpl.setUserId(getUserId());
		personImpl.setUserName(getUserName());
		personImpl.setCreateDate(getCreateDate());
		personImpl.setModifiedDate(getModifiedDate());
		personImpl.setPersonName(getPersonName());
		personImpl.setPersonSurname(getPersonSurname());
		personImpl.setPersonBirthdate(getPersonBirthdate());
		personImpl.setPersonEmail(getPersonEmail());
		personImpl.setStatus(getStatus());
		personImpl.setStatusByUserId(getStatusByUserId());
		personImpl.setStatusByUserName(getStatusByUserName());
		personImpl.setStatusDate(getStatusDate());

		personImpl.resetOriginalValues();

		return personImpl;
	}

	@Override
	public int compareTo(Person person) {
		int value = 0;

		value = getPersonName().compareTo(person.getPersonName());

		if (value != 0) {
			return value;
		}

		value = getPersonSurname().compareTo(person.getPersonSurname());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Person)) {
			return false;
		}

		Person person = (Person)obj;

		long primaryKey = person.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		PersonModelImpl personModelImpl = this;

		personModelImpl._originalUuid = personModelImpl._uuid;

		personModelImpl._originalGroupId = personModelImpl._groupId;

		personModelImpl._setOriginalGroupId = false;

		personModelImpl._originalCompanyId = personModelImpl._companyId;

		personModelImpl._setOriginalCompanyId = false;

		personModelImpl._setModifiedDate = false;

		personModelImpl._originalPersonName = personModelImpl._personName;

		personModelImpl._originalPersonSurname = personModelImpl._personSurname;

		personModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Person> toCacheModel() {
		PersonCacheModel personCacheModel = new PersonCacheModel();

		personCacheModel.uuid = getUuid();

		String uuid = personCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			personCacheModel.uuid = null;
		}

		personCacheModel.personId = getPersonId();

		personCacheModel.groupId = getGroupId();

		personCacheModel.companyId = getCompanyId();

		personCacheModel.userId = getUserId();

		personCacheModel.userName = getUserName();

		String userName = personCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			personCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			personCacheModel.createDate = createDate.getTime();
		}
		else {
			personCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			personCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			personCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		personCacheModel.personName = getPersonName();

		String personName = personCacheModel.personName;

		if ((personName != null) && (personName.length() == 0)) {
			personCacheModel.personName = null;
		}

		personCacheModel.personSurname = getPersonSurname();

		String personSurname = personCacheModel.personSurname;

		if ((personSurname != null) && (personSurname.length() == 0)) {
			personCacheModel.personSurname = null;
		}

		Date personBirthdate = getPersonBirthdate();

		if (personBirthdate != null) {
			personCacheModel.personBirthdate = personBirthdate.getTime();
		}
		else {
			personCacheModel.personBirthdate = Long.MIN_VALUE;
		}

		personCacheModel.personEmail = getPersonEmail();

		String personEmail = personCacheModel.personEmail;

		if ((personEmail != null) && (personEmail.length() == 0)) {
			personCacheModel.personEmail = null;
		}

		personCacheModel.status = getStatus();

		personCacheModel.statusByUserId = getStatusByUserId();

		personCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = personCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			personCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			personCacheModel.statusDate = statusDate.getTime();
		}
		else {
			personCacheModel.statusDate = Long.MIN_VALUE;
		}

		return personCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Person, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Person, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Person, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Person)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Person, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Person, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Person, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Person)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Person>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _personId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _personName;
	private String _originalPersonName;
	private String _personSurname;
	private String _originalPersonSurname;
	private Date _personBirthdate;
	private String _personEmail;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _columnBitmask;
	private Person _escapedModel;

}