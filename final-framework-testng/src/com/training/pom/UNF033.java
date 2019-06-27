package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class UNF033 {
	private WebDriver driver; 
	
	public UNF033(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//UNF_033-To verify whether application allows user to place an order with Pre Logging in
	@FindBy(xpath="//*[@id=\"featured-grid\"]//descendant::div[2]//a[1]//img")
	private WebElement sportstshirt; 
	
	@FindBy(name="option[370]")
	private WebElement selectdrpdown;
	
	//@FindBy(id="input-quantity")
	//private WebElement quantity;
	
	@FindBy(id="button-cart")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]")
	private WebElement successmsg;
	
	@FindBy(xpath="//*[@id='cart']//i")
	private WebElement cartdetails;

	@FindBy(xpath="//*[@id='top-links1']//div[1]/button")
	private WebElement movetocarticon;
	
	@FindBy(xpath="//*[@id='cart']//child::ul//child::li//child::p//a[1]/strong")
	private WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	private WebElement titleshoppingcart;
		
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/a")
	private WebElement checkout;
	
	@FindBy(xpath="//*[@id='button-account']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//*[@id='account']/legend")
	private WebElement rigister;
	
	@FindBy(id="button-register")
	private WebElement continueregister;
	
	//order confirmation page:
	@FindBy(xpath="//*[@id='button-confirm']")
	private WebElement confirmbutton;
	@FindBy(xpath="//*[@id='content']/h1")
	private WebElement orderconfirmed;
	
	//checkbox on regestration page
	@FindBy(xpath="//*[@id='collapse-payment-address']/div/div[3]/label/input")//*[@id="collapse-shipping-address"]/div/form/div[1]/label
	private WebElement checkboxreg;
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/div[4]/div/input[1]")
	private WebElement agreecheckboxreg;
	@FindBy(xpath="//*[@id=\"button-register\"]")
	private WebElement continuebtnregpage;
	//alert message if email already exists
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/div[1]")
	private WebElement alertexistingemail;
	
	//Delivery details
	@FindBy(xpath="//*[@id='collapse-shipping-address']/div/form/div[1]/label/input")
	private WebElement existingaddressradiobutton;
	//continue btn
	@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
	private WebElement continuebtn2;
	//freeshipping txt and radio btn
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[2]/strong")
	private WebElement freeshippingtxt;
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input")
	private WebElement freeshipradiobtn;
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
	private WebElement addcomment;
	@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
	private WebElement continuebtnfreeshipping;
	//payment method page elements
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[1]/label/input")
	private WebElement cashondelivery;
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	private WebElement agreecheckbox1;
	@FindBy(xpath="//*[@id=\"button-payment-method\"]")
	private WebElement continuebtn3;
	//click on sports shirt image
			
	public void clicksportstshirt() {
		this.sportstshirt.click();
			}
	//select chest size
	public void selectchestsize() {
		this.selectdrpdown.isSelected();
		Select drpdown = new Select(this.selectdrpdown);
		drpdown.selectByIndex(3);}
	//add quantity
	/*public void enterquantity() {
		this.quantity.sendKeys("2");}*/
	
	//click add to cart	
	public void clickaddtocart() {
		this.addtocart.click();}
	//message alert		
	public String successalertmsg() {
		return this.successmsg.getText();}
	//number of items added
	public String clickcarticon() {
		return this.cartdetails.getText();}
	//mouseover to carticon
	public void popupwindow() {
		Actions actions = new Actions(driver);
		WebElement cartitem = this.movetocarticon;
		actions.moveToElement(cartitem).click().build().perform();}
	//click on view cart
	public void clickviewcart() {
		this.viewcart.click();
	}
	
   //shopping cart
	public String verifymessage() {
		return this.titleshoppingcart.getText();
	}
	
	//click checkout
	public void clickcheckout() {
		this.checkout.click();}
	public void continubtn() {
		this.continuebtn.click();
	}
	
	//check register/login  page		
	public String registerpage() {
		return this.rigister.getText();
	}
	public void continueonregister() {
		this.continueregister.click();
	}
		//Registration page
		public void secondcheckbox() {
		this.checkboxreg.isSelected();}
		public void agreecheckboxreg() {
		this.agreecheckboxreg.click();}
		public void continueonregpage() {
		this.continuebtnregpage.click();	
		}
		//verify alert existing email id
		public String existingemailid() {
			return this.alertexistingemail.getText();
		}
	//to verify existing address radio button is selected
	public void existingaddradiobtn() {
		this.existingaddressradiobutton.isSelected();}
	public void clickcontinuebtn2() {
		this.continuebtn2.click();}
	
	//free shipping details
	public String freeshippingtitle() {
		return this.freeshippingtxt.getText();}
	public void freeshipradiobtn() {
		this.freeshipradiobtn.isSelected();}
	public void addcomments(String comments) {
		this.addcomment.sendKeys(comments);}
	public void continuebtnfreeshipping() {
		this.continuebtnfreeshipping.click();}
	public String cashondelivery() {
	return this.cashondelivery.getText();}
	
	public void agreecheckbox1() {
		this.agreecheckbox1.click();}
	public void continuebtn3() {
		this.continuebtn3.click();
	}
	//confirmation page:
		public void confirmbutton() {
			this.confirmbutton.click();
		}
		public String orderconfirmationpage() {
			return this.orderconfirmed.getText();}
	

	
}
	
	
	
	
		
		
	
	
	
	   


