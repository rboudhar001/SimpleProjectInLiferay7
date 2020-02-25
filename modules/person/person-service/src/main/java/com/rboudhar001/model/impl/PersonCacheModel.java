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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.rboudhar001.model.Person;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Person in entity cache.
 *
 * @author Rachid
 * @generated
 */
@ProviderType
public class PersonCacheModel implements CacheModel<Person>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PersonCacheModel)) {
			return false;
		}

		PersonCacheModel personCacheModel = (PersonCacheModel)obj;

		if (personId == personCacheModel.personId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, personId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", personId=");
		sb.append(personId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", personName=");
		sb.append(personName);
		sb.append(", personSurname=");
		sb.append(personSurname);
		sb.append(", personBirthdate=");
		sb.append(personBirthdate);
		sb.append(", personEmail=");
		sb.append(personEmail);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Person toEntityModel() {
		PersonImpl personImpl = new PersonImpl();

		if (uuid == null) {
			personImpl.setUuid("");
		}
		else {
			personImpl.setUuid(uuid);
		}

		personImpl.setPersonId(personId);
		personImpl.setGroupId(groupId);
		personImpl.setCompanyId(companyId);
		personImpl.setUserId(userId);

		if (userName == null) {
			personImpl.setUserName("");
		}
		else {
			personImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			personImpl.setCreateDate(null);
		}
		else {
			personImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			personImpl.setModifiedDate(null);
		}
		else {
			personImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (personName == null) {
			personImpl.setPersonName("");
		}
		else {
			personImpl.setPersonName(personName);
		}

		if (personSurname == null) {
			personImpl.setPersonSurname("");
		}
		else {
			personImpl.setPersonSurname(personSurname);
		}

		if (personBirthdate == Long.MIN_VALUE) {
			personImpl.setPersonBirthdate(null);
		}
		else {
			personImpl.setPersonBirthdate(new Date(personBirthdate));
		}

		if (personEmail == null) {
			personImpl.setPersonEmail("");
		}
		else {
			personImpl.setPersonEmail(personEmail);
		}

		personImpl.resetOriginalValues();

		return personImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		personId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		personName = objectInput.readUTF();
		personSurname = objectInput.readUTF();
		personBirthdate = objectInput.readLong();
		personEmail = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(personId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (personName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personName);
		}

		if (personSurname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personSurname);
		}

		objectOutput.writeLong(personBirthdate);

		if (personEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personEmail);
		}
	}

	public String uuid;
	public long personId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String personName;
	public String personSurname;
	public long personBirthdate;
	public String personEmail;

}