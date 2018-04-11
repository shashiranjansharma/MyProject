package com.myFramework.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.myFramework.CommonUtil.MyDriver;

public class Test2 {

	WebDriver driver;
	MyDriver myDriver = new MyDriver(driver);

	//Calling the setupDriver method from MyDriver class to launch browser
	@BeforeSuite(alwaysRun = true)
	public WebDriver setupDriver() throws IOException{
		driver = myDriver.setupDriver();
		
		return driver;
	}

	//Write you code here to close or quit from your driver
	@AfterSuite(alwaysRun = true)
	public void closeDriver(){
		driver.quit();
	}

	@Test
	public void myfunction() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(5000);
		//this is to test 
	}
	
}
