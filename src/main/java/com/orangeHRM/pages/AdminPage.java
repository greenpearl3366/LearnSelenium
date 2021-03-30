package com.orangeHRM.pages;

import com.orangeHRM.BaseMethods.BaseMethods;

public class AdminPage extends BaseMethods {
	
	public AddUserPage clickAddbtn()
	{
		driver.findElementByName("btnAdd").click();
		return new AddUserPage();
		
	}

}

