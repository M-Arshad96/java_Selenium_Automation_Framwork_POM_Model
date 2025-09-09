package com.nextgen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	By demoSites= By.partialLinkText("Demo Sites");
	By pracAutomationPage= By.partialLinkText("Practice Automation");
	By registerDemoPage= By.partialLinkText("Demo Site – Registration Form");
	
	
	public void navigateToHome() {
		driver.findElement(demoSites).click();
	}
	
	public void navigateToPracAutomation() {
		driver.findElement(pracAutomationPage).click();
	}
	
	public void navigateToRegisterDemo() {
		driver.findElement(registerDemoPage).click();
	}
	
}
