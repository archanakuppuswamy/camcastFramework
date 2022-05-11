package com.Comcast.Contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smokeTest")
	public void createContact() {
		System.out.println("contact is created");
		String value1= System.getProperty("browser");
		System.out.println(value1);
	}
	@Test(groups="regressionTest")
	public void modifyContact() {
		System.out.println("contact is modified");
	}
	@Test(groups="regressionTest")
	public void deleteContact() {
		System.out.println("contact is deleted");
	}
	}
