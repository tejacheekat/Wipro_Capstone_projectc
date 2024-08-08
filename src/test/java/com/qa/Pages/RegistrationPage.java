package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.BaseClass;
//"Here We created the  RegistrationPage for user registration  process."

public class RegistrationPage extends BaseClass {
	//"We created the constructor to call the chromedriver."

	

	public RegistrationPage(WebDriver chromedriver) {
		//"We created the pagefactory for finding the webelements"

		PageFactory.initElements(chromedriver,this);
		
	}
	//"By using @Findby we find the webelements"
	
	@FindBy  (xpath="//a[@class='ico-register']")
	WebElement registerButton;
	@FindBy  (xpath="//*[@id='gender-male']")
	WebElement radio;
	@FindBy  (xpath="//*[@id='FirstName']")
	WebElement firstName;
	@FindBy  (xpath="//*[@id='LastName']")
	WebElement lastName;
	@FindBy  (xpath="//*[@id='Email']")
	WebElement email;
	@FindBy  (xpath="//*[@name='Password']")
	WebElement password;
	@FindBy  (xpath="//*[@name='ConfirmPassword']")
	WebElement confirmpassword;
	@FindBy  (xpath="//*[@id='register-button']")
	WebElement confirmRegister;
	@FindBy (xpath= "(//a[@class='account'])[1]")
	WebElement account;
	//"Creating the method for registration user to initate the values" 
	public void registerUser(String first, String last,String mail) {
		registerButton.click();
		radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
	}
	//"Creating the method for confirming the password"
	public void userPassword(String pass,String confirmPass) {
		password.sendKeys(pass);
		confirmpassword.sendKeys(confirmPass);
		
	}
	//"creating the method for click on the register button"
	public void register() {
		confirmRegister.click();
	}
	//created the method for theuser confirmation.
	public String user()
	{
		String acc= account.getText();
		return acc;
	}
	
}

	
	

