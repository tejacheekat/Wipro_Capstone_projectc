package com.qa.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.qa.Pages.LoginPage;
//import com.qa.Pages.LoginPage;
import com.qa.base.BaseClass;
//"Created the class for calling webdemoshop tricentis"
public class TC_LINKTEST_001 extends BaseClass{
	@Test

	public void linkTest() throws IOException {
		driver.get("https://demowebshop.tricentis.com/");//"calling the webdemoshop"
		driver.manage().window().maximize();//"Maximize the screen"
		//"Screenshot"
		File f=(File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		Files.copy(f, new File("C:\\Users\\Administrator\\eclipse-workspace\\WiproCapstone\\screenshots\\HomePage1.jpg"));
		driver.quit();	
		
			
		

		

		
		
		
		
	}@Test
	public void test2()
	{
		LoginPage lp =new LoginPage(driver);
}
		
		
	}




