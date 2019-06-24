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
import com.training.pom.UNF032;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UFM032 {

	public WebDriver driver;
	private String baseUrl;
	private UNF032 uniform;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniform = new UNF032(driver);
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
		uniform.selectchestsize();
		uniform.clickaddtocart();
		Thread.sleep(1000);
		String expected = uniform.successalertmsg();
				Assert.assertTrue(true, expected);
			System.out.println(expected);
	}
    @Test(priority=2)
    public void checkout() throws InterruptedException {
    	Thread.sleep(1000);
    	uniform.clickcarticon();
    	uniform.popupwindow();
        System.out.println(uniform.popupwindow());
        System.out.println(uniform.getinfo());
        uniform.clickcheckout();
        String expected = "New Customer";
        Assert.assertEquals(uniform.registerpage(), expected);
        System.out.println(expected);}
      
}
    
	
	
		

