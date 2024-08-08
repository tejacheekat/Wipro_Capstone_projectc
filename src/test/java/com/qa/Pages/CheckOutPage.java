package com.qa.Pages;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;
import com.qa.base.BaseClass;
//"Here We created the  Checkoutpage to check out the process."
public class CheckOutPage extends BaseClass {
	//"We created the constructor to call the chromedriver."
	public CheckOutPage(WebDriver driver) throws InterruptedException {
	//"We created the pagefactory for finding the webelements"
		PageFactory.initElements(driver,this);
		Thread.sleep(1000);
	}
	//"Find the elementsw by using findby keyword in te pagefactory"
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement Search;
	@FindBy(xpath="//input[@value='Search']")
	WebElement Searchbutton;
	@FindBy(xpath="//input[@value='Add to cart']")
	WebElement AddtoCart;
	@FindBy(xpath="//span[normalize-space()='Shopping cart']")
	WebElement ShoppingCart;
	@FindBy(xpath="//select[@id='CountryId']")
    WebElement Country;	
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[1]/select/option[99]")
     WebElement India;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[3]/input")
    WebElement TermsOfConditions;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[4]/button")
    WebElement CheckOut;
    @FindBy(xpath="//input[@id='Email']")
    WebElement Email;
    @FindBy(xpath="//input[@id='Password']")
    WebElement Password;
    @FindBy(xpath="//input[@value='Log in']")
    WebElement Login;
    @FindBy(xpath="//select[@id='CountryId']")
    WebElement Country1;	
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[1]/select/option[99]")
     WebElement India1;
     @FindBy(xpath="//input[@id=\"termsofservice\"]")
    WebElement TermsOfConditions1;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[4]/button")
    WebElement CheckOut1;
    @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
    WebElement Country2;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[5]/select/option[99]")
    WebElement India2;
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement City;
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement Add;
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement ZipCode;
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement Phone;
    @FindBy(xpath="//input[@onclick='Billing.save()']")
    WebElement Save;
    @FindBy(xpath="//input[@onclick='Shipping.save()']")
   
WebElement Save1;
    @FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
    WebElement Cont;
    @FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
    WebElement Cont1;
    @FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
    WebElement Cont2;
    @FindBy(xpath="//input[@value='Confirm']")
    WebElement Confirm;
    @FindBy(xpath="//a[normalize-space()='Click here for order details.']")
    WebElement OrderDetails;
    //"Created methods to call the values for search and add to cart "
public void search1(String s1 ,String s2 ,String s3) {
	Search.sendKeys(s1);
	Searchbutton.click();
	AddtoCart.click();
	ShoppingCart.click();
	Country.click();
	India.click();
	TermsOfConditions.click();
	CheckOut.click();
	Email.sendKeys(s2);
	Password.sendKeys(s3);
	Login.click();
Country1.click();
India1.click();
TermsOfConditions1.click();
CheckOut1.click();
Country2.click();
India2.click();
}
//"Created the address method for shipping the details"
	public void address(String s1 ,String s2,String s3,String s4) throws InterruptedException,IOException
	{
		City.sendKeys(s1);
		Add.sendKeys(s2);
		ZipCode.sendKeys(s3);
		Phone.sendKeys(s4);
		Save.click();
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		Cont.click();
		Thread.sleep(1000);
		Cont1.click();
		Thread.sleep(1000);
		Cont2.click();
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		OrderDetails.click();
		//'HERE e are taking sceenshot"
		File f=(File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		Files.copy(f, new File("C:\\Users\\Administrator\\eclipse-workspace\\WiproCapstone\\screenshots\\CheckOut.jpg"));
	}
	
	
	

	
}