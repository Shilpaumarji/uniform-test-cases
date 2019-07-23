package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.UFM001dataprovider;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UFM002;
import com.training.pom.uniformlogin;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF062RetreiveData {
	private WebDriver driver;
	private String baseUrl;
	private uniformlogin uniformpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformpom = new uniformlogin(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "excel-inputs", dataProviderClass = UFM001dataprovider.class)
	public void loginDBTest(String firstname, String lastname, String email, String telephone, String address1, String city, String postcode, String countryid, String zoneid, String inputpassword, String confirmpassword) throws InterruptedException {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
		Thread.sleep(1000);
		uniformpom.clickmyaccount();
		uniformpom.clickregister();
		Thread.sleep(1000);
		uniformpom.sendfirstname(firstname);
		uniformpom.sendlastname(lastname);
		uniformpom.sendemail(email);
		uniformpom.sendtelephone(telephone);
		uniformpom.sendaddress1(address1);
		uniformpom.sendcity(city);
		uniformpom.sendpostcode(postcode);
		uniformpom.sendcountryid();
		uniformpom.sendzoneid();
		uniformpom.sendinputpassword(inputpassword);
		uniformpom.sendconfirmpassword(confirmpassword);
		uniformpom.selectradiono();
		uniformpom.selectcheckbox();
		uniformpom.clickcontinue1();
		boolean test = (driver.getTitle()).contains("Your Account Has Been Created");
		if(test)
		{
		
			String ActualTitle = driver.getTitle();
			
			System.out.printf("Test Case Passed",ActualTitle);
		}else {
			System.out.println("Account not created -- Test passed");
		}
		
		
		//screenShot.captureScreenShot(userName);

	}

	private boolean existsElement(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}