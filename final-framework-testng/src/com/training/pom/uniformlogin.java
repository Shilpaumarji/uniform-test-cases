package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath="//*[@id='input-firstname'] | //*[@id='input-payment-firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id='input-payment-lastname'] | //*[@id='input-lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id='input-payment-email'] | //*[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='input-payment-telephone'] | //*[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath="//*[@id='input-payment-address-1'] | //*[@id='input-address-1']")
	private WebElement address1;
	
	@FindBy(xpath="//*[@id='input-payment-city'] | //*[@id='input-city']")
	private WebElement city;
	
	@FindBy(xpath="//*[@id='input-payment-postcode'] | //*[@id='input-postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//*[@id='input-country'] | //*[@id='input-payment-country']")
	private WebElement countryid;
	
	@FindBy(xpath="//*[@id='input-zone'] | //*[@id='input-payment-zone']")
	private WebElement zoneid;
	
	@FindBy(xpath="//*[@id='input-payment-password'] | //*[@id='input-password']")
	private WebElement inputpassword;
	
	@FindBy(xpath="//*[@id='input-payment-confirm'] | //*[@id='input-confirm']")
	private WebElement confirmpassword;
	
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
	
	public void sendfirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlastname(String lastname) {
		this.lastname.sendKeys(lastname);
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
	public void sendcountryid() {
		this.countryid.isSelected();
		Select country = new Select(this.countryid);
		country.selectByVisibleText("India");}
	public void sendzoneid() {
		this.zoneid.isSelected();
		Select zone = new Select(this.zoneid);
		zone.selectByVisibleText("Karnataka");}
	public void sendinputpassword(String inputpassword) {
		this.inputpassword.sendKeys(inputpassword);}
	public void sendconfirmpassword(String confirmpassword) {
		this.confirmpassword.sendKeys(confirmpassword);}
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

