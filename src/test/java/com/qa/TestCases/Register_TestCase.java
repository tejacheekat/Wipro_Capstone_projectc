package com.qa.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.qa.Pages.RegistrationPage;
import com.qa.base.BaseClass;

public class Register_TestCase extends BaseClass {
	@Test(priority=1)
	//"calling the webdemoshop"
	public void test1()throws IOException
	{
		TC_LINKTEST_001 tc = new TC_LINKTEST_001();
		tc.linkTest();
	}
	//"created the testcase for registered user"
	@Test(priority=2)
	public void test2() throws InterruptedException,IOException {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.registerUser("Subbu","Bokka","subbubokka@gmail.com");
		Thread.sleep(1000);
		rp.userPassword("Pavan1", "Pavan1");
		Thread.sleep(1000);
		rp.register();
		File f=(File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		Files.copy(f, new File("C:\\Users\\Administrator\\eclipse-workspace\\WiproCapstone\\screenshots\\Register.jpg"));
		
		
	}
	//"for security purpose to check the user verify"
	@Test(priority=3)
	public void testUserVerify() {
		RegistrationPage rp = new RegistrationPage(driver);
		String actualUser=rp.user();
		System.out.println("actual user name is="+actualUser);
		String expectUser="subbubokka@gmail.com";
		System.out.println("expectUser name is="+expectUser);
		Assert.assertEquals(actualUser, expectUser);
		driver.quit();
		
		
	}

}
