package com.actitime.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustometModule1 extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {

		Reporter.log("Create Customer" , true);
		
		FileLib f = new FileLib();
		
				
		String customerName = f.getExcelData("Sheet1", 1, 3);
		String customerDescriotion = f.getExcelData("Sheet1", 1, 4);
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.settaskTab();
		Thread.sleep(3000);
		TaskListPage t = new TaskListPage(driver);

		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getCustomerNameTbx().sendKeys(customerName);
		t.getCustomerDescriptionTbx().sendKeys(customerName);
		t.getSelectCustomerDD().click();
		t.getSelectCustomerOption().click();
		t.getCreateCustomerBtn().click();
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer() , customerName));
		Thread.sleep(3000);
		String actualCustText = t.getActualCustomer().getText();
		Assert.assertEquals(actualCustText, customerName);
		System.out.println(actualCustText);
		System.out.println(actualCustText);
	}

	@Test
	public void testModifyCustomer() throws InterruptedException {
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.settaskTab();
		Thread.sleep(3000);
		TaskListPage t = new TaskListPage(driver);
		
		t.getStartTypingNameFld().sendKeys("HSBC");
		
		
		t.getSettingsBtn().click();
		
		Thread.sleep(3000);
		//t.getEditNameFld().click();
		//t.getEditNameFld().clear();
		//Thread.sleep(2000);
		
		WebElement we = t.getEditNameFld();
		Actions a = new Actions(driver);
		a.click(we).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL)
		 .sendKeys("a")
		 .keyUp(Keys.CONTROL)
		 .sendKeys("HHBB")
		 .perform();
		//a.sendKeys(Keys.ENTER).perform();
		//a.moveByOffset(100, 100).click().perform();
		
		
		
		Thread.sleep(2000);
		
		t.getCloseSettingPgBtn().click();
		
		
		String modifiedName = t.getActualCustomer().getText();
		


//		t.getEditNameFld().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//String modifiedName = t.getCustomer().getText();
		System.out.println(modifiedName);
	
		Assert.assertEquals(modifiedName, "HHBB");
		
		Thread.sleep(3000);
		
	}
	@Test
	public void testModifyCustomer1() throws InterruptedException {
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.settaskTab();
		Thread.sleep(3000);
		TaskListPage t = new TaskListPage(driver);
		
		t.getStartTypingNameFld().sendKeys("HSBC");
		
		
		t.getSettingsBtn().click();
		
		Thread.sleep(2000);
		t.getEditNameFld().clear();
		Thread.sleep(1000);
		t.getEditNameFld().sendKeys("new");
	
	

    }
}