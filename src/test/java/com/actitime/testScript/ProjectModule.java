package com.actitime.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ProjectModule {

	@Test
	public void CreateCustomer() throws InterruptedException {
		Reporter.log("Project module open browser stated" , true);
		//Assert.fail();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Thread.sleep(3000);
		Reporter.log("Project module open browser finished" , true);
		driver.quit();
		
	}
}
