package com.rboudhar001.service.impl.test;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.rboudhar001.model.Person;
import com.rboudhar001.service.PersonLocalServiceUtil;

import org.junit.Assert;
import org.junit.Test;

public class PersonLocalServiceImplTest {
	
	@Test
	public void addPersonTest() {

		// Person
		long personId = CounterLocalServiceUtil.increment(Person.class.getName());
		Person person = PersonLocalServiceUtil.createPerson(personId);

		// Service : Add Person
		Person aux = PersonLocalServiceUtil.addPerson(person);

		// Assert
		Assert.assertNotNull(aux);
	}
}
