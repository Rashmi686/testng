package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apputils {
	@BeforeTest
	public void login()
	{
		System.out.println("This is login");
	}
	@BeforeTest
	public void logout()
	{
		System.out.println("This is logout");
	}
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("This is launch");
	}
	@AfterSuite
	public void closeApp()
	{
		System.out.println("This is close");
	}
}

