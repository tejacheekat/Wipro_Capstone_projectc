package com.qa.TestCases;


import com.qa.base.BaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.qa.Pages.LoginPage;

//"created the class name for login testcase"
public class Login_TestCases extends BaseClass{
	
	public LoginPage lp;
	
	@Test (priority =1)
	
	//"created the first testcase to call the lnk of webdemoshop"
	public void test1() throws InterruptedException, IOException {
		TC_LINKTEST_001 tc1=new TC_LINKTEST_001();
		tc1.linkTest();
		Thread.sleep(1000);
		
	}
	
	@Test (priority =2)
	
	//"This test is used for take the username and password to verify the login credentials"
	public void test2() throws InterruptedException ,IOException{
		lp = new LoginPage(driver);
		lp.logInCredentials("subbubokka@gmail.com", "Pavan1");
		lp.logIn();
		Thread.sleep(1000);
		//"Screenshot"
		File f=(File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		Files.copy(f, new File("C:\\Users\\Administrator\\eclipse-workspace\\WiproCapstone\\screenshots\\LOGIN.jpg"));
	
	}
	
	@Test (priority= 3)
	//"To verify the user is correct user or not
	public void test3() {
		lp=new LoginPage(driver);
		String actualUserID=lp.accountVerify();
		System.out.println("actual user name is="+actualUserID);
		String expectUserID="subbubokka@gmail.com";
		System.out.println("expectUser name is="+expectUserID);
		Assert.assertEquals(actualUserID, expectUserID);
		//"quit the driver"
		driver.quit();
		

	}


}
