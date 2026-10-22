package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement unTbx;

	@FindBy(name = "pwd")
	private WebElement pwTbx;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgBtn;

	// const
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// nonstatic method present in login page class- use by creating object of class
	public void setLogin(String un, String pw) {

		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
	}

}
