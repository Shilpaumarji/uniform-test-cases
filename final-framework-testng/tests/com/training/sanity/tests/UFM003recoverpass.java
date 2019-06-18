package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.dataproviders.UFM001dataprovider;
import com.training.generics.ScreenShot;
import com.training.pom.UFM002;
import com.training.pom.UFM003;
import com.training.pom.uniformlogin;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM003recoverpass {

	public WebDriver driver;
	private String baseUrl;
	private UFM003 recoverpass;
	private static UFM001dataprovider readexcel;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		recoverpass = new UFM003(driver); 
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
	driver.quit();}
   
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		recoverpass.clickmyaccount();
		recoverpass.clicklogin();
		Thread.sleep(3000);
		recoverpass.sendemail("Kkumar@gmail.com");
		recoverpass.sendpass("Kumar1234");
		recoverpass.clickloginbtn();
		recoverpass.capturererrormsg();
					
	/*@Test(dependsOnMethods= "validLoginTest", alwaysRun=true, priority=2)
	public void forgotpasswordTest() {*/
	recoverpass.clickforgotpassword();
	recoverpass.sendemailid("Kkumar@gmail.cerom");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
	recoverpass.clickcontinuebtn();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
	
	}


}
	
	/*@Test (dependsOnMethods=("validLoginTest"), priority=2)
	public void Myaccountpage() {
	recoverpass.validlogin();
	recoverpass.editlink();}*/
	


		 
	
	
	
	
	 

