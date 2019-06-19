package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UFM002 {
	private WebDriver driver; 
	
	public UFM002(WebDriver driver) {
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
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	private WebElement pagetitle;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[2]/li[1]/a")
	private WebElement editlink;
	
	public void clickmyaccount() {
		this.Myaccount.click(); }
	
	public void clicklogin() {
		this.login.click(); }
		
    public void sendemail(String email){
			this.email.sendKeys(email);}
    
    public void sendpassword(String password){
		this.password.sendKeys(password);}
    
    public void clickloginbtn(){
		this.loginbtn.click();}
    public void myaccountpage() {
    	this.pagetitle.getText();}
    public void clickeditinfo(){
		this.editlink.click();}
    
    
}