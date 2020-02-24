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

package com.rboudhar001.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Person}.
 * </p>
 *
 * @author Rachid
 * @see Person
 * @generated
 */
@ProviderType
public class PersonWrapper
	extends BaseModelWrapper<Person> implements Person, ModelWrapper<Person> {

	public PersonWrapper(Person person) {
		super(person);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("personId", getPersonId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("personName", getPersonName());
		attributes.put("personSurname", getPersonSurname());
		attributes.put("personBirthdate", getPersonBirthdate());
		attributes.put("personEmail", getPersonEmail());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long personId = (Long)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String personName = (String)attributes.get("personName");

		if (personName != null) {
			setPersonName(personName);
		}

		String personSurname = (String)attributes.get("personSurname");

		if (personSurname != null) {
			setPersonSurname(personSurname);
		}

		Date personBirthdate = (Date)attributes.get("personBirthdate");

		if (personBirthdate != null) {
			setPersonBirthdate(personBirthdate);
		}

		String personEmail = (String)attributes.get("personEmail");

		if (personEmail != null) {
			setPersonEmail(personEmail);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the company ID of this person.
	 *
	 * @return the company ID of this person
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this person.
	 *
	 * @return the create date of this person
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this person.
	 *
	 * @return the group ID of this person
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this person.
	 *
	 * @return the modified date of this person
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the person birthdate of this person.
	 *
	 * @return the person birthdate of this person
	 */
	@Override
	public Date getPersonBirthdate() {
		return model.getPersonBirthdate();
	}

	/**
	 * Returns the person email of this person.
	 *
	 * @return the person email of this person
	 */
	@Override
	public String getPersonEmail() {
		return model.getPersonEmail();
	}

	/**
	 * Returns the person ID of this person.
	 *
	 * @return the person ID of this person
	 */
	@Override
	public long getPersonId() {
		return model.getPersonId();
	}

	/**
	 * Returns the person name of this person.
	 *
	 * @return the person name of this person
	 */
	@Override
	public String getPersonName() {
		return model.getPersonName();
	}

	/**
	 * Returns the person surname of this person.
	 *
	 * @return the person surname of this person
	 */
	@Override
	public String getPersonSurname() {
		return model.getPersonSurname();
	}

	/**
	 * Returns the primary key of this person.
	 *
	 * @return the primary key of this person
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this person.
	 *
	 * @return the status of this person
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this person.
	 *
	 * @return the status by user ID of this person
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this person.
	 *
	 * @return the status by user name of this person
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this person.
	 *
	 * @return the status by user uuid of this person
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this person.
	 *
	 * @return the status date of this person
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this person.
	 *
	 * @return the user ID of this person
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this person.
	 *
	 * @return the user name of this person
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this person.
	 *
	 * @return the user uuid of this person
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this person.
	 *
	 * @return the uuid of this person
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this person is approved.
	 *
	 * @return <code>true</code> if this person is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this person is denied.
	 *
	 * @return <code>true</code> if this person is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this person is a draft.
	 *
	 * @return <code>true</code> if this person is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this person is expired.
	 *
	 * @return <code>true</code> if this person is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this person is inactive.
	 *
	 * @return <code>true</code> if this person is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this person is incomplete.
	 *
	 * @return <code>true</code> if this person is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this person is pending.
	 *
	 * @return <code>true</code> if this person is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this person is scheduled.
	 *
	 * @return <code>true</code> if this person is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this person.
	 *
	 * @param companyId the company ID of this person
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this person.
	 *
	 * @param createDate the create date of this person
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this person.
	 *
	 * @param groupId the group ID of this person
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this person.
	 *
	 * @param modifiedDate the modified date of this person
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the person birthdate of this person.
	 *
	 * @param personBirthdate the person birthdate of this person
	 */
	@Override
	public void setPersonBirthdate(Date personBirthdate) {
		model.setPersonBirthdate(personBirthdate);
	}

	/**
	 * Sets the person email of this person.
	 *
	 * @param personEmail the person email of this person
	 */
	@Override
	public void setPersonEmail(String personEmail) {
		model.setPersonEmail(personEmail);
	}

	/**
	 * Sets the person ID of this person.
	 *
	 * @param personId the person ID of this person
	 */
	@Override
	public void setPersonId(long personId) {
		model.setPersonId(personId);
	}

	/**
	 * Sets the person name of this person.
	 *
	 * @param personName the person name of this person
	 */
	@Override
	public void setPersonName(String personName) {
		model.setPersonName(personName);
	}

	/**
	 * Sets the person surname of this person.
	 *
	 * @param personSurname the person surname of this person
	 */
	@Override
	public void setPersonSurname(String personSurname) {
		model.setPersonSurname(personSurname);
	}

	/**
	 * Sets the primary key of this person.
	 *
	 * @param primaryKey the primary key of this person
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this person.
	 *
	 * @param status the status of this person
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this person.
	 *
	 * @param statusByUserId the status by user ID of this person
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this person.
	 *
	 * @param statusByUserName the status by user name of this person
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this person.
	 *
	 * @param statusByUserUuid the status by user uuid of this person
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this person.
	 *
	 * @param statusDate the status date of this person
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this person.
	 *
	 * @param userId the user ID of this person
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this person.
	 *
	 * @param userName the user name of this person
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this person.
	 *
	 * @param userUuid the user uuid of this person
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this person.
	 *
	 * @param uuid the uuid of this person
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PersonWrapper wrap(Person person) {
		return new PersonWrapper(person);
	}

}