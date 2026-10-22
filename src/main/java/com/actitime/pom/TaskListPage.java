package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(id = "customerLightBox_nameField")
	private WebElement CustomerNameTbx;
	
	
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement CustomerDescriptionTbx;
	
	
	@FindBy(xpath = "//button[contains(text(),'Select')]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath = "//a[text()='Our Company']")
	private WebElement selectCustomerOption;
	
	@FindBy(id = "customerLightBox_commitBtn")
	private WebElement CreateCustomerBtn;
	
	@FindBy (xpath = "//div[text()='Customers & Projects']/..//input[@type='text']")
	private WebElement StartTypingNameFld;
	
	@FindBy (xpath ="//span[@class='highlightToken']")
	private WebElement Customer;
	
	@FindBy (xpath = "//span[@class='highlightToken' ]/../../div[@class='editButton available']")
	private WebElement SettingsBtn;
	
	//@FindBy (xpath = "//div[@class='customerNamePlaceHolder']")
	//@FindBy (xpath = "//span[text()='Spent time on Customer:']/../../../../../..//div[@class='nameLabel']")
	@FindBy (xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='nameLabel']")
	private WebElement EditNameFld;
	
	@FindBy (xpath ="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
	private WebElement actualCustomer;
	
	@FindBy (xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='closeButton']")
	private WebElement closeSettingPgBtn;
	
	

	public WebElement getCloseSettingPgBtn() {
		return closeSettingPgBtn;
	}

	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getStartTypingNameFld() {
		return StartTypingNameFld;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}

	public WebElement getSettingsBtn() {
		return SettingsBtn;
	}

	public WebElement getEditNameFld() {
		return EditNameFld;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getCustomerNameTbx() {
		return CustomerNameTbx;
	}

	public WebElement getCustomerDescriptionTbx() {
		return CustomerDescriptionTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getSelectCustomerOption() {
		return selectCustomerOption;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
	
	//getters will not perform any action 
	//setters will perform action aling with the located web element
	
	
	
	
	
	
}
