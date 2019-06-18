package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.uniformlogin;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class uniform {

	public WebDriver driver;
	private String baseUrl;
	private uniformlogin uniformpom;
	private static Properties properties;
	private ScreenShot screenShot;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformpom = new uniformlogin(driver); 
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
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(1000);
		uniformpom.clickmyaccount();
		uniformpom.clickregister();
		uniformpom.sendfirstName("rima");
		uniformpom.sendlastname("B");
		uniformpom.sendemail("rima12@gmail.com");
		uniformpom.sendtelephone("9441835892");
		uniformpom.sendaddress1("Jayanagar");
		uniformpom.sendcity("Bangalore");
		uniformpom.sendpostcode("560082");
		uniformpom.sendcountryid("India");
		uniformpom.sendzoneid("Karnataka");
		uniformpom.sendinputpass("rima123");
		uniformpom.sendconfirmpass("rimal123");
	    /*js.executeScript("window.scrollBy(0,1000)");*/
		uniformpom.selectradiono();
		
		uniformpom.selectcheckbox();
		
		uniformpom.clickcontinue();
		Thread.sleep(1000);
		
		//screenShot.captureScreenShot("First");
		String Expectedtitle = "Your Account Has Been Created!";
	    String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ActualTitle, Expectedtitle);
	    System.out.println(ActualTitle);
		
		
	}
	/*@Test(dependsOnMethods= ("validLoginTest"), priority=2)
	public void registrationpass() {
	uniformpom.registered("myaccounttitle");
	System.out.println("My account page displayed");	
	}*/
	
}
