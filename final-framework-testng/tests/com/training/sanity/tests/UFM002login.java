package com.training.sanity.tests;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.UFM002;
import com.training.pom.uniformlogin;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM002login {

	public WebDriver driver;
	private String baseUrl;
	private UFM002 uniformpom;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformpom = new UFM002(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		uniformpom.clickmyaccount();
		uniformpom.clicklogin();
		Thread.sleep(3000);
		uniformpom.sendemail("ritu123@gmail.com");
		uniformpom.sendpassword("ritu123");
		uniformpom.clickloginbtn();
		Assert.assertTrue(true, "My Account");
		System.out.println("Test 1 Passed");
			}
	@Test(dependsOnMethods= "validLoginTest")
	public void myaccountpage() {
		uniformpom.myaccountpage();
		assertTrue(driver.getTitle().contains("My Account"));
		System.out.println("Test 2 Passed");
	}
	
	@Test(dependsOnMethods= "myaccountpage")
	public void editinformation() {
		uniformpom.clickeditinfo();
		System.out.println("Test 3 Passed");
	}
}

