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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Person service. Represents a row in the &quot;FOO_Person&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.rboudhar001.model.impl.PersonModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.rboudhar001.model.impl.PersonImpl</code>.
 * </p>
 *
 * @author Rachid
 * @see Person
 * @generated
 */
@ProviderType
public interface PersonModel
	extends BaseModel<Person>, GroupedModel, ShardedModel, StagedAuditedModel,
			WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a person model instance should use the {@link Person} interface instead.
	 */

	/**
	 * Returns the primary key of this person.
	 *
	 * @return the primary key of this person
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this person.
	 *
	 * @param primaryKey the primary key of this person
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this person.
	 *
	 * @return the uuid of this person
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this person.
	 *
	 * @param uuid the uuid of this person
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the person ID of this person.
	 *
	 * @return the person ID of this person
	 */
	public long getPersonId();

	/**
	 * Sets the person ID of this person.
	 *
	 * @param personId the person ID of this person
	 */
	public void setPersonId(long personId);

	/**
	 * Returns the group ID of this person.
	 *
	 * @return the group ID of this person
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this person.
	 *
	 * @param groupId the group ID of this person
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this person.
	 *
	 * @return the company ID of this person
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this person.
	 *
	 * @param companyId the company ID of this person
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this person.
	 *
	 * @return the user ID of this person
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this person.
	 *
	 * @param userId the user ID of this person
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this person.
	 *
	 * @return the user uuid of this person
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this person.
	 *
	 * @param userUuid the user uuid of this person
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this person.
	 *
	 * @return the user name of this person
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this person.
	 *
	 * @param userName the user name of this person
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this person.
	 *
	 * @return the create date of this person
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this person.
	 *
	 * @param createDate the create date of this person
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this person.
	 *
	 * @return the modified date of this person
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this person.
	 *
	 * @param modifiedDate the modified date of this person
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the person name of this person.
	 *
	 * @return the person name of this person
	 */
	@AutoEscape
	public String getPersonName();

	/**
	 * Sets the person name of this person.
	 *
	 * @param personName the person name of this person
	 */
	public void setPersonName(String personName);

	/**
	 * Returns the person surname of this person.
	 *
	 * @return the person surname of this person
	 */
	@AutoEscape
	public String getPersonSurname();

	/**
	 * Sets the person surname of this person.
	 *
	 * @param personSurname the person surname of this person
	 */
	public void setPersonSurname(String personSurname);

	/**
	 * Returns the person birthdate of this person.
	 *
	 * @return the person birthdate of this person
	 */
	public Date getPersonBirthdate();

	/**
	 * Sets the person birthdate of this person.
	 *
	 * @param personBirthdate the person birthdate of this person
	 */
	public void setPersonBirthdate(Date personBirthdate);

	/**
	 * Returns the person email of this person.
	 *
	 * @return the person email of this person
	 */
	@AutoEscape
	public String getPersonEmail();

	/**
	 * Sets the person email of this person.
	 *
	 * @param personEmail the person email of this person
	 */
	public void setPersonEmail(String personEmail);

	/**
	 * Returns the status of this person.
	 *
	 * @return the status of this person
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this person.
	 *
	 * @param status the status of this person
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this person.
	 *
	 * @return the status by user ID of this person
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this person.
	 *
	 * @param statusByUserId the status by user ID of this person
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this person.
	 *
	 * @return the status by user uuid of this person
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this person.
	 *
	 * @param statusByUserUuid the status by user uuid of this person
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this person.
	 *
	 * @return the status by user name of this person
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this person.
	 *
	 * @param statusByUserName the status by user name of this person
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this person.
	 *
	 * @return the status date of this person
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this person.
	 *
	 * @param statusDate the status date of this person
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this person is approved.
	 *
	 * @return <code>true</code> if this person is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this person is denied.
	 *
	 * @return <code>true</code> if this person is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this person is a draft.
	 *
	 * @return <code>true</code> if this person is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this person is expired.
	 *
	 * @return <code>true</code> if this person is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this person is inactive.
	 *
	 * @return <code>true</code> if this person is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this person is incomplete.
	 *
	 * @return <code>true</code> if this person is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this person is pending.
	 *
	 * @return <code>true</code> if this person is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this person is scheduled.
	 *
	 * @return <code>true</code> if this person is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}