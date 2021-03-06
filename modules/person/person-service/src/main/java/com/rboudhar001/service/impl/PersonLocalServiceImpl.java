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

package com.rboudhar001.service.impl;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.rboudhar001.model.Person;
import com.rboudhar001.service.base.PersonLocalServiceBaseImpl;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the person local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.rboudhar001.service.PersonLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Rachid
 * @see PersonLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.rboudhar001.model.Person",
	service = AopService.class
)
public class PersonLocalServiceImpl extends PersonLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.rboudhar001.service.PersonLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.rboudhar001.service.PersonLocalServiceUtil</code>.
	 */
	
	/**
	 * Adds the person to the database. Also notifies the appropriate model listeners.
	 *
	 * @param person the person
	 * @return the person that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Person addPerson(Person person) {
		
		// Father method
		Person p = super.addPerson(person);

		// Send Email
		try {

			InternetAddress from = new InternetAddress("rboudhar001@gmail.com");
			InternetAddress to = new InternetAddress(person.getPersonEmail());
			MailMessage mail = new MailMessage(from, to, "Exercise Form", "Thanks for fill the form.", false);
			MailServiceUtil.sendEmail(mail);

		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Return
		return p;
	}
}