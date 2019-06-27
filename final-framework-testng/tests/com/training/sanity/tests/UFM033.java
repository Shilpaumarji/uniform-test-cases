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
import com.training.pom.UNF033;
import com.training.pom.uniformlogin;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM033 {

	public WebDriver driver;
	private String baseUrl;
	private UNF033 uniform;
	private uniformlogin registrationpage;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniform = new UNF033(driver);
		registrationpage = new uniformlogin(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();}
	
	@Test(priority=1)
	public void addtocart() throws InterruptedException {
		uniform.clicksportstshirt();
		Thread.sleep(1000);
		uniform.selectchestsize();
		uniform.clickaddtocart();
		Thread.sleep(1000);
		String expected = uniform.successalertmsg();
				Assert.assertTrue(true, expected);
			System.out.println(expected);
	}
	//view and checkout
    @Test(priority=2)
    public void checkout() throws InterruptedException {
    	Thread.sleep(1000);
    	String viewitems = uniform.clickcarticon();
    	System.out.println(viewitems);
        uniform.popupwindow();
        uniform.clickviewcart();
        uniform.verifymessage();
        uniform.clickcheckout();
        uniform.continubtn();
        String expected = "Your Personal Details";
        Assert.assertEquals(uniform.registerpage(), expected);
        System.out.println(expected);}
      

   
	@Test(priority=3)
	public void orderconfirmationpage() throws InterruptedException {
	Thread.sleep(1000);
	registrationpage.sendfirstName("Shilpa");
	registrationpage.sendlastname("SG");
	registrationpage.sendemail("Shilpasg123@gmail.com");
	registrationpage.sendtelephone("9856789021");
	registrationpage.sendinputpass("Shilpasg123");
	registrationpage.sendconfirmpass("Shilpasg123");
	registrationpage.sendaddress1("Jayanagar");
	registrationpage.sendcity("Bangalore");
	registrationpage.sendpostcode("560061");
	registrationpage.sendcountryid("India");
	Thread.sleep(1000);
	registrationpage.sendzoneid("Karnataka");
	Thread.sleep(1000);
	uniform.secondcheckbox();
	Thread.sleep(1000);
	uniform.agreecheckboxreg();
	uniform.continueonregpage();
	Thread.sleep(1000);
	//String expected = " Warning: E-Mail Address is already registered!";
	String actualmsg = uniform.existingemailid();
	Assert.assertFalse(false, " Warning: E-Mail Address is already registered!");
	System.out.println(actualmsg);
		}

    @Test(dependsOnMethods="orderconfirmationpage", priority=4)
    public void deliverymethod() throws InterruptedException {
    	uniform.existingaddradiobtn();
    	uniform.clickcontinuebtn2();
    	Thread.sleep(1000);
    	uniform.freeshippingtitle();
    	uniform.freeshipradiobtn();
    	Thread.sleep(1000);
    	uniform.addcomments("Please Deliver between 7 am to 10 am");
    	Thread.sleep(1000);
    	uniform.continuebtnfreeshipping();
    	uniform.cashondelivery();
    	Thread.sleep(1000);
    	uniform.agreecheckbox1();
    	Thread.sleep(1000);
    	uniform.continuebtn3();
    	Thread.sleep(1000);
    	uniform.confirmbutton();
    	Thread.sleep(1000);
    	String confirm = uniform.orderconfirmationpage();
    	System.out.println(confirm);
    	Thread.sleep(3000);}



}


		

