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
	
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]/a/i")
	private WebElement Myaccount; 
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a")
	private WebElement login;
	
	@FindBy(name="email")
	private WebElement email;
		
	@FindBy(name="password")
	private WebElement passw;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement loginbtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]")
	private WebElement errormsg;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	private WebElement forgotpass;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement emailid;
		
	@FindBy (xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement continuebtn;
	
	@FindBy (xpath="//*[@id=\"content\"]/h1")
	private WebElement myaccounttitle;
	
	@FindBy (xpath="//*[@id=\"content\"]/ul[2]/li[1]/a")
	private WebElement editlink;
	
	public void clickmyaccount() {
		this.Myaccount.click(); }
	
	public void clicklogin() {
		this.login.click(); }
		
    public void sendemail(String email){
    	this.email.clear();
			this.email.sendKeys(email);}
    
    public void sendpass(String passw){
    	this.passw.clear();
		this.passw.sendKeys(passw);}
	
    public void clickloginbtn(){
		this.loginbtn.click();}
    
    //to check warning message-Warning: No match for E-Mail Address and/or Password message should get displayed
       public void capturererrormsg() {
    	    String Expectedtitle =  "Warning: No match for E-Mail Address and/or Password.";
		    String ActualTitle = this.errormsg.getText();
		    Assert.assertEquals(ActualTitle, Expectedtitle);
		    System.out.println(ActualTitle);
       }
    	public void clickforgotpassword() {
    		this.forgotpass.click();
    	}
    	
    	public void sendemailid(String emailid) {
    		this.emailid.clear();
    		this.emailid.sendKeys(emailid);
    	}
    	    	   	   	
		public void clickcontinuebtn() {
			this.continuebtn.click();}
			
			
		public void validlogin() {
		    String Expectedtitle = "MY ACCOUNT";
		    String ActualTitle = this.myaccounttitle.getText();
		    Assert.assertEquals(ActualTitle, Expectedtitle);
		    System.out.println(ActualTitle);}
		
		public void editlink() {
			this.editlink.click();
		}
}
		
		
