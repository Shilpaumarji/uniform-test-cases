package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UNF032 {
	private WebDriver driver; 
	
	public UNF032(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//UNF_032-To verify whether application displays Login screen upon checking out the product without Pre Logging in
	@FindBy(xpath="//*[@id='featured-grid']/div[2]/div/div/div[1]/a/img")
	private WebElement sportstshirt; 
	
	@FindBy(name="option[368]")
	private WebElement selectdrpdown;
	
	@FindBy(id="input-quantity")
	private WebElement quantity;
	
	@FindBy(id="button-cart")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]")
	private WebElement successmsg;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]")
	private WebElement clickcarticon;
	
	@FindBy(xpath="//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement popupwindow;
	
	@FindBy(xpath="//*[@id='cart']//child::td[2]//a[1]")
	private WebElement getinfo;
	@FindBy(xpath="//*[@id='cart']//child::a[2]//strong")
	private WebElement checkout;
	@FindBy(xpath="//*[@id='content']//h2")
	private WebElement rigister;
			
	
			
	public void clicksportstshirt() {
		this.sportstshirt.click();
			}
	
	public void selectchestsize() {
		this.selectdrpdown.isSelected();
		Select drpdown = new Select(this.selectdrpdown);
		drpdown.selectByIndex(1);}
	public void enterquantity() {
		this.quantity.sendKeys("2");}
		
	public void clickaddtocart() {
		this.addtocart.click();}
			
	public String successalertmsg() {
		return this.successmsg.getText();}
	public void clickcarticon() {
		this.clickcarticon.click();}
	public String popupwindow() {
		this.popupwindow.click();
	return this.popupwindow.getText();}
	public String getinfo() {
		return this.getinfo.getText();}
	public void clickcheckout() {
		this.checkout.click();}
			
	public String registerpage() {
		return this.rigister.getText();
	}
	
	
}
	
	
	
	
		
		
	
	
	
	   


