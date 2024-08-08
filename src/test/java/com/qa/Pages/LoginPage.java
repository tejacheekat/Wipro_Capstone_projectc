package com.qa.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.BaseClass;
//"Here We created the  Loginpage class to login the correct user credentials.."


public class LoginPage extends BaseClass{
	//"We created the constructor."

	public LoginPage(WebDriver driver) {
		//"We created the pagefactory for finding the webelements"

		PageFactory.initElements(driver, this);
	}
	//"Find the elementsw by using findby keyword in te pagefactory"

	@FindBy (xpath = "//*[@class='ico-login']")
	WebElement logInButton;
	
	@FindBy (xpath = "//*[@id='Email']")
	WebElement userID;
	
	@FindBy (xpath= "//*[@id='Password']")
	WebElement password;
	
	@FindBy (xpath = "//*[@class='button-1 login-button']")
	WebElement loginContinue;
	
	@FindBy (xpath = "(//a[@class='account'])[1]")
	WebElement account;
	//"Created a void method to call the values for username and password"
	public void logInCredentials(String id, String pass)
	{
		logInButton.click();
		userID.sendKeys(id);
		password.sendKeys(pass);
	}
	//Created the void method to click on the login uttoon
	public void logIn() {
		loginContinue.click();
	}
	//Created the account verify method to verify eather the person is same or not"
	public String accountVerify() {
		String acc=account.getText();
		return acc;
		
	}
}
