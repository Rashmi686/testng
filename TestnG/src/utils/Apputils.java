package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("Launch OrangeHRM App");
	}
	@AfterSuite
	public void closeApp()
	{
		System.out.println("Close OrangeHRM App");
	}

	@BeforeTest
	public void adminLogin()
	{
		System.out.println("Login as Admin");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Logout from Admin Module");
	}
}
