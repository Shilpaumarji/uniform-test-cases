package com.training.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UFM003 {
	private WebDriver driver; 
	
	public UFM003(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='top-links1']/ul/li[3]/a/i")
	private WebElement Myaccount; 
	
	@FindBy(xpath="//*[@id='top-links1']/ul/li[3]/ul/li[2]/a")
	private WebElement login;
	
	@FindBy(name="email")
	private WebElement email;
		
	@FindBy(name="password")
	private WebElement passw;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/form/input")
	private WebElement loginbtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]")
	private WebElement errormsg;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/form/div[2]/a")
	private WebElement forgotpass;
	
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement emailid;
		
	@FindBy (xpath="//*[@id='content']/form/div/div[2]/input")
	private WebElement continuebtn;
	
	@FindBy (xpath="/html/body/div[1]/div[1]")
	private WebElement confirmation;
	
	public void clickmyaccount() {
		this.Myaccount.click(); }
	
	public void clicklogin() {
		this.login.click(); }
		
    public void sendemail(String email){
    		this.email.sendKeys(email);}
    
    public void sendpass(String passw){
    	this.passw.sendKeys(passw);}
	
    public void clickloginbtn(){
		this.loginbtn.click();}
    
    //to check warning message-Warning: No match for E-Mail Address and/or Password message should get displayed
            public String getwarningmsg() {
        	return this.errormsg.getText();}
        
    	public void clickforgotpassword() {
    		this.forgotpass.click();
    	}
    	
    	public void sendemailid(String emailid) {
    		this.emailid.sendKeys(emailid);
    	}
    	    	   	   	
		public void clickcontinuebtn() {
			this.continuebtn.click();}
			
			
		public String confirmationmsg(){
		   return this.confirmation.getText();}
}
		

		
		
