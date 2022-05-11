package com.Comcast.Organization;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups="smokeTest")
	public void createOrganization() {
		System.out.println("Organization is created");
	}
	@Test(groups="regressionTest")
	public void modifyOrganization() {
		System.out.println("Organization is modified");
	}
	@Test(groups="regressionTest")
	public void deleteOrganization() {
		System.out.println("Organization is deleted");
	}
	
}
