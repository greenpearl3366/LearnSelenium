package com.orangeHRM.pages;

import com.orangeHRM.BaseMethods.BaseMethods;

public class LoginPage extends BaseMethods 
{
	
	public LoginPage enterusname(String username)
	{
		driver.findElementById("txtUsername").sendKeys(username);
		return this;
	}
	
	public LoginPage enterpwd(String password)
	{
		 driver.findElementById("txtPassword").sendKeys(password);
		 return this;
	}
	
	
    public DashboardPage clickbtn()
    {
    	driver.findElementById("btnLogin").click();
    	return new DashboardPage();
    	 
    }

}
