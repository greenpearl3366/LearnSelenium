package com.orangeHRM.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.BaseMethods.BaseMethods;
import com.orangeHRM.pages.LoginPage;

public class Testcase_Login extends BaseMethods
{
	
@BeforeTest
	public void setData()
	{
		//excelFileName="TC001";
		testcaseName="Login and navigate to PIM";
		testcaseDec = "Login and PIM Page";
		author="Muthu";
		category="Smoke";
	}
	
@Test (dataProvider ="fetchdata")
public void OrgangeHRMLogin(String username,String password, String role, String empname, String uname,String status)
{
	
	new LoginPage().enterusname(username).enterpwd(password).clickbtn().clickadmin(); 
	//.clickAddbtn().selectrole(role).entername(empname).enteruname(uname).selectstatus(status).btnsave();
	
}

}

