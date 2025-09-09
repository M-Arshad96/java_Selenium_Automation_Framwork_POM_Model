package com.nextgen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoPage {

	
	public WebDriver driver;

	public RegisterDemoPage(WebDriver driver) {
		this.driver=driver;

	}

	//Declare All the WebElements on Register Demo Page






	//Register Demo Locator
	//String registerDemoXpath="//h3[normalize-space()='Register For Demo']";

	//First Name Locator 
	By firstNameId=By.id("vfb-5");


	//Last Name Locator 


	By lastNameId=By.id("vfb-7");
	// Radio Button Locator 


	By radioButtonName= By.name("vfb-31");
	//Street Address Locator and Value


	By streetAdressId= By.id("vfb-13-address");

	// Apt Locator and Value 

	By aptName= By.name("vfb-13[address-2]");

	//City Locator and Value 

	By cityId= By.id("vfb-13-city");

	//Zip code Locator and Value 

	By zipCodeId= By.name("vfb-13[zip]");

	//State and Province  Locator and Value 

	By stateId= By.id("vfb-13-state");

	//Country Locator 

	By countryDropDownId= By.id("vfb-13-country");

	//Email locator and Value 

	By emailXpath= By.xpath("//input[@id='vfb-14']");

	//Date Select Locator and Value

	By dateSelectXpath= By.xpath("//input[@id='vfb-18']");

	//Time In Hours Locator 

	By convenientTimeHHId= By.id("vfb-16-hour]");

	//Time In Minutes Locator 

	By convenientTimeMMId= By.id("vfb-16-min");

	//Time In Minutes Locator 

	By phoneNumberId= By.id("vfb-19");

	// Course Interested Check Box locator

	By courseInterestedCBId= By.id("vfb-20-1");

	// Course Interested Check Box locator

	By courseInterestedCBUnselectId= By.id("vfb-20-3");

	// Query Text Box locator and Value

	By enterYourQueryId= By.id("vfb-23");
	// Two Digit Verification locator 

	By twoDigitVerficationXpath= By.xpath("//label[normalize-space()='Example: 99']");
	// Two Digit Text Box locator 

	By verificationTextBoxId= By.id("vfb-3");
	// Submit Button locator

	By submitButtonId= By.id("vfb-4]");







	public void enterFirstName(String firstName) {
		driver.findElement(firstNameId).sendKeys(firstName);
	}
	public void enterLasttName(String lastName) {
		driver.findElement(lastNameId).sendKeys(lastName);
	}
	public void selectRadioButton() {
		driver.findElement(radioButtonName).click();

	}
	public void enterStreetAdd(String streetAddress) {
		driver.findElement(streetAdressId).sendKeys(streetAddress);
	}
	public void enterAptAdd(String aptAdd) {
		driver.findElement( aptName).sendKeys(aptAdd);
	}

	public void enterCityAdd(String cityAdd) {
		driver.findElement(cityId).sendKeys(cityAdd);
	}
	public void enterZipCode(String zipCode ) {
		driver.findElement(zipCodeId).sendKeys(zipCode);
	}
	public void enterStateAdd(String stateAdd) {
		driver.findElement(stateId).sendKeys(stateAdd);
	}
	public void selectDropDown (String value ) {
		WebElement countryDropDown=driver.findElement(countryDropDownId);
		Select cDropDown= new Select (countryDropDown);
		cDropDown.selectByVisibleText(value);
			
	}
	
	public void enterEmail(String eId) {
		driver.findElement(emailXpath).sendKeys(eId);
	}
	public void selectDate(String dateSelection) {
		driver.findElement(dateSelectXpath).sendKeys(dateSelection);
	}
	public void selectTimeHH(String cTimeHH) {
		Select timeHH= new Select((WebElement) convenientTimeHHId);
		timeHH.selectByVisibleText(cTimeHH);
	}
	public void selectTimeMM(String cTimeMM) {
		Select timeMM= new Select((WebElement) convenientTimeMMId);
		timeMM.selectByVisibleText(cTimeMM);
	}
	public void verifyNumber( String actNumber) {
		driver.findElement(twoDigitVerficationXpath).getText().substring(9);

	}
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(phoneNumberId).sendKeys(phoneNumber);
	}
	public void verifyTextBox (String textBox) {
		driver.findElement(verificationTextBoxId).sendKeys(textBox);
	}
	public void clickSubmitBtn (String textBox) {
		driver.findElement(submitButtonId).click();
	}

}
