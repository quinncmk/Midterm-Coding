package com.cisc181.core;

public class PersonException extends Exception {
	private Person Person;
	
	public PersonException(com.cisc181.core.Person Person) {
		this.Person = Person;
	}

	public com.cisc181.core.Person getPerson() {
		return Person;
	}
}
