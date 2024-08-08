package com.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.Pages.CheckOutPage;

import com.qa.base.BaseClass;
//"to call the webdemoshop link"
public class CheckOutPage_TestCases extends BaseClass {
	@Test(priority=1)
	public void test1()throws IOException
	{
		TC_LINKTEST_001 tc = new TC_LINKTEST_001();
		tc.linkTest();
	}
	//"search the product"
	@Test(priority=2)
	public void test2() throws InterruptedException {
		CheckOutPage cp = new CheckOutPage(driver);
		cp.search1("Laptop","subbubokka@gmail.com","Pavan1");
		
	
	}
	//"giving the address for shipping details"
	@Test(priority=3)
	public void Test3()throws InterruptedException,IOException
	{
		CheckOutPage cp1 = new CheckOutPage(driver);
		cp1.address("Vijaawada","2-78,Madhuruwada","534329","9948803963");
		driver.close();
	}
	

}
