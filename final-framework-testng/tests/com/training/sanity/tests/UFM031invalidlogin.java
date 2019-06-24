package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.UFM003;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM031invalidlogin {

	public WebDriver driver;
	private String baseUrl;
	private UFM003 recoverpass;
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
	@AfterClass
	public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();}
   
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		recoverpass.clickmyaccount();
		recoverpass.clicklogin();
		Thread.sleep(3000);
		recoverpass.sendemail("nehad@gmail.com");
		recoverpass.sendpass("Neha1234");
		recoverpass.clickloginbtn();
		Thread.sleep(1000);
		String Expectedtitle =  "Warning: No match for E-Mail Address and/or Password.";
	    String ActualTitle = recoverpass.getwarningmsg();
	    Assert.assertEquals(ActualTitle, Expectedtitle);
	    System.out.println(ActualTitle);
		
	}
					
	@Test(priority=2)
	public void forgotpasswordTest() throws InterruptedException {
	recoverpass.clickforgotpassword();
	recoverpass.sendemailid("nehad@gmail.com");
	recoverpass.clickcontinuebtn();
	Thread.sleep(1000);
	String Expectedtitle = "An email with a confirmation link has been sent your email address.";
    String ActualTitle = recoverpass.confirmationmsg();
    Assert.assertEquals(ActualTitle, Expectedtitle);
    System.out.println(ActualTitle);
	
	}
}


	


		 
	
	
	
	
	 

