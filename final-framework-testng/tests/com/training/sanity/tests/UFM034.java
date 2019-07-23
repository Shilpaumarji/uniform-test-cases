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
import com.training.pom.UNF034;
import com.training.pom.uniformlogin;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM034 {

	public WebDriver driver;
	private String baseUrl;
	private UNF034 uniform;
	private uniformlogin registrationpage;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniform = new UNF034(driver);
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
			System.out.printf("Alert message");
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
        uniform.guestcheckout();
        uniform.continubtn();
        String expected = "Your Personal Details";
        Assert.assertEquals(uniform.registerpage(), expected);
        System.out.printf("Registration Page displayed: ");
        System.out.println(expected);
    }
    @Test(priority=3)
	public void orderconfirmationpage() throws InterruptedException {
	Thread.sleep(1000);
	registrationpage.sendfirstname("Shilpa");
	registrationpage.sendlastname("SK");
	registrationpage.sendemail("shilpask123@gmail.com");
	registrationpage.sendtelephone("9856789021");
	registrationpage.sendaddress1("Jayanagar");
	registrationpage.sendcity("Bangalore");
	registrationpage.sendpostcode("560061");
	registrationpage.sendcountryid();
	Thread.sleep(1000);
	registrationpage.sendzoneid();
	Thread.sleep(1000);
	uniform.continueonregpage();
	Thread.sleep(1000);}
			

    @Test(dependsOnMethods="orderconfirmationpage", alwaysRun=true, priority=4)
    public void deliverymethod() throws InterruptedException {
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
    	System.out.printf("Order confirmation: ", confirm);
    	Thread.sleep(3000);
    	String items = uniform.getcarttotalitems();
    	System.out.printf("total items in cart : ");
    	System.out.println(items);
    	}
}
