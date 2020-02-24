package com.rboudhar001.service.impl.test;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.rboudhar001.model.Person;
import com.rboudhar001.service.PersonLocalService;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.service.component.annotations.Reference;

public class PersonLocalServiceImplTest {

	// Service
	private PersonLocalService mPersonLocalService;

	@Reference(unbind = "-")
	protected void setPersonService(PersonLocalService personLocalService) {
		mPersonLocalService = personLocalService;
	}

	@Test
	public void addPersonTest() {

		// Person
		long personId = CounterLocalServiceUtil.increment(Person.class.getName());
		Person person = mPersonLocalService.createPerson(personId);

		// Service : Add Person
		Person aux = mPersonLocalService.addPerson(person);

		// Assert
		Assert.assertNotNull(aux);
	}
}
