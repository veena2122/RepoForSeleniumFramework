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

import com.actitime.pom.LoginPage;

public class BaseClassNew {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void openBrowser() {
		
		Reporter.log("Open Browser" , true);
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void login() throws IOException{
		Reporter.log("Login" , true);
		
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		
		LoginPage l = new LoginPage(driver);
	    
		l.setLogin(un, pw);
		
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("Logout" , true);
		
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("close Browser" , true);
	}
	
}
