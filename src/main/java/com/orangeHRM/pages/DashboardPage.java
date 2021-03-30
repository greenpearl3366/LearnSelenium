package com.orangeHRM.pages;

import com.orangeHRM.BaseMethods.BaseMethods;

public class DashboardPage extends BaseMethods 
{
	
	public AdminPage clickadmin()
	{
		driver.findElementById("menu_pim_viewPimModule").click();
		return new AdminPage();
	}	

}
