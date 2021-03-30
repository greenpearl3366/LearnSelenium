package com.orangeHRM.BaseMethods;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.orangeHRM.dataUtility.DataUtilityReader;

import learnframework.Reporter;

public class BaseMethods extends Reporter
{
	
 public static ChromeDriver driver;	

@BeforeMethod
public void loginlaunch()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     driver = new ChromeDriver();
    String url ="https://opensource-demo.orangehrmlive.com/";
    driver.get(url);
    driver.manage().window().maximize();
	
}

@AfterMethod
public void apploggoff()
{
	driver.close();
}

@DataProvider (name ="fetchdata")
public Object[][] readexceldata() throws IOException
{
	return DataUtilityReader.dataread();
}

}
