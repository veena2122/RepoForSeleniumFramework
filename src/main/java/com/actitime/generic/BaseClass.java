package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {

	//want to use driver in entire package so make it public static 
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {

		Reporter.log("openBrowser ", true);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// driver.get("http//localhost:8080/");
	}

	@BeforeMethod
	public void login() throws IOException {

		Reporter.log("Login ", true);
		FileLib fl = new FileLib();
		String url = fl.getPropertyData("url");
		String un = fl.getPropertyData("username");
		String pw = fl.getPropertyData("password");
		//driver.get("https://www.vtiger.com/");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		//l.setLogin("admin", "manager");
		l.setLogin(un, pw);
		
		
	}

	@AfterMethod
	public void logOut() {

		Reporter.log("Logout ", true);
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.setLogout();
	}

	@AfterTest
	public void closeBrowser() {

		Reporter.log("CloseBrowser ", true);
		driver.quit();
	}

}
