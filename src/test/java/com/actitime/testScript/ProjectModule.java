package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void CreateCustomer() {
		Reporter.log("Project module create Customer" , true);
		//Assert.fail();
	}
}
