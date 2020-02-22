package com.rboudhar001.model;

import java.util.Date;

public class Person {

	// Variables
	
	private String name;
	private String surname;
	private Date birthdate;
	private String email;

	// Constructor
	
	public Person() {
		super();
		this.name = null;
		this.surname = null;
		this.birthdate = null;
		this.email = null;
	}

	public Person(String name, String surname, Date birthdate, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.email = email;
	}

	// Get and Set
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Functions

	// ...
}