package com.nextgen.testcases;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nextgen.pages.HomePage;
import com.nextgen.pages.RegisterDemoPage;


public class TC01RegisterPage {
	public WebDriver driver;

	@Test(priority = 1)
	public void launchApp() {

		// Set the driver to control the broswer
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");


		// Creating an object to instantiate the browser driver
		driver = new ChromeDriver();

		//Launch the Browser and Open the website.
		driver.get("https://vinothqaacademy.com"); 

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Maximize the browser
		driver.manage().window().maximize();
		System.out.println("Application launch successfully");

		Reporter.log("App launch successfully");
	}
	@Test(priority = 2)
	public void navigationToRegisterDemo() {
		HomePage user= new HomePage(driver);
		user.navigateToHome();
		user.navigateToPracAutomation();
		user.navigateToRegisterDemo();

		Reporter.log("Navigate  successfully");
	}
	@Test(priority = 3)
	public void RegisterDemo() {

		RegisterDemoPage user= new RegisterDemoPage(driver);

		user.enterFirstName("Gunish");
		user.enterLasttName("Timbler");
		user.selectRadioButton();
		user.enterStreetAdd("Delhi Road near Noida bypass");
		user.enterAptAdd("Sector 52,Tech Giant, Apartment 5th floor");
		user.enterCityAdd("Delhi");
		user.enterZipCode("110025");
		user.enterStateAdd("Delhi");
		user.selectDropDown("India");
		user.enterEmail("Rajesh65@reddif.com");
		user.selectDate("03/27/2024");
		user.selectTimeHH("04");
		user.selectTimeMM("15");
		user.enterPhoneNumber("9876543210");
		
		user.verifyTextBox("99");
		

	}
	@Test(priority = 4, enabled = false)
	public void closedApp() {
		driver.quit();

		Reporter.log("App closed successfully");
	}



}
