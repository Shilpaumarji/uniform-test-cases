package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class uniformlogin {
	private WebDriver driver; 
	
	public uniformlogin(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]/a/i")
	private WebElement Myaccount; 
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]/ul/li[1]/a")
	private WebElement register;
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-address-1")
	private WebElement address1;
	
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postcode;
	
	@FindBy(name="country_id")
	private WebElement countryid;
	
	@FindBy(name="zone_id")
	private WebElement zoneid;
	
	@FindBy(id="input-password")
	private WebElement inpassword;
	
	@FindBy(id="input-confirm")
	private WebElement confirmpass;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[4]/div/div/label[2]/input")
	private WebElement radiono;
	
	@FindBy(name="agree")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement continuebtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	private WebElement continueacc;
		
	public void clickmyaccount() {
		this.Myaccount.click();
			}
	
	public void clickregister() {
		this.register.click(); 
		
	}
	
	public void sendfirstName(String fn) {
		this.firstname.sendKeys(fn);
	}
	
	public void sendlastname(String ln) {
		this.lastname.sendKeys(ln);
	}
	
	public void sendemail(String email) {
		this.email.sendKeys(email);
	}

	public void sendtelephone(String telephone) {
		this.telephone.sendKeys(telephone);
	}
	public void sendaddress1(String address1) {
		this.address1.sendKeys(address1);
	}
	public void sendcity(String city) {
		this.city.sendKeys(city);
	}
	public void sendpostcode(String postcode) {
		this.postcode.sendKeys(postcode);
			}
	public void sendcountryid(String countryid) {
		this.countryid.sendKeys(countryid);}
	public void sendzoneid(String zoneid) {
		this.zoneid.sendKeys(zoneid);}
	public void sendinputpass(String inpass) {
		this.inpassword.sendKeys(inpass);}
	public void sendconfirmpass(String confirmpass) {
		this.confirmpass.sendKeys(confirmpass);}
	public void selectradiono() {
		this.radiono.click();}
	public void selectcheckbox() {
		this.checkbox.click();}
	public void clickcontinue() {
		this.continuebtn.click();}
	public void clickcontinueacc() {
		this.continueacc.click();
	}
	   
}

