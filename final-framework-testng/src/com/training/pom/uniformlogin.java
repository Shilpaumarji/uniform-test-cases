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
	
	@FindBy(id="input-payment-firstname")
	private WebElement firstname;
	
	@FindBy(id="input-payment-lastname")
	private WebElement lastname;
	
	@FindBy(id="input-payment-email")
	private WebElement email;
	
	@FindBy(id="input-payment-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-payment-address-1")
	private WebElement address1;
	
	@FindBy(id="input-payment-city")
	private WebElement city;
	
	@FindBy(id="input-payment-postcode")
	private WebElement postcode;
	
	@FindBy(xpath=("//*[@name='country_id'] | //*[@id='input-payment-country']"))
	private WebElement countryid;
	
	@FindBy(xpath=("//*[@name='zone_id'] | //*[@id='input-payment-zone']"))
	private WebElement zoneid;
	
	@FindBy(id="input-payment-password")
	private WebElement inpassword;
	
	@FindBy(id="input-payment-confirm")
	private WebElement confirmpass;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[4]/div/div/label[2]/input")
	private WebElement radiono;
	
	@FindBy(name="agree")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement continuebtn1;
	
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
		this.zoneid.isSelected();
		this.zoneid.sendKeys(zoneid);}
	public void sendinputpass(String inpass) {
		this.inpassword.sendKeys(inpass);}
	public void sendconfirmpass(String confirmpass) {
		this.confirmpass.sendKeys(confirmpass);}
	public void selectradiono() {
		this.radiono.click();}
	public void selectcheckbox() {
		this.checkbox.click();}
	public void clickcontinue1() {
		this.continuebtn1.click();}
	public void clickcontinueacc() {
		this.continueacc.click();
	}
	   
}

