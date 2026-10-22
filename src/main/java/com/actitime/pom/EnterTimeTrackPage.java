package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {

	@FindBy(id = "logoutLink")
	private WebElement logOut;
	
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement taskTab;
	
	
	//const
	
	public EnterTimeTrackPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//non static method present in Homepage/entertimetrack page 
	public void setLogout() {
		logOut.click();
	}
	
	public void settaskTab() {
		taskTab.click();
	}

}
