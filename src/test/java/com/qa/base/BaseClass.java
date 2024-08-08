package com.qa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeClass;





//"I created the baseclass to call the Chromedriver."

public class BaseClass {
public static WebDriver driver;
@BeforeClass
public void setUp() { 
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*"); 
	driver=new ChromeDriver(options);
	
}
}






