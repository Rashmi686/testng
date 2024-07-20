package library;

import org.openqa.selenium.By;

import utils.Apputils;

public class Login extends Apputils
{

public void loginpage(String uid,String pwd)	
{

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	
}

public boolean isAdminModuleDisplayed()
{
	if(driver.findElement(By.linkText("Admin")).isDisplayed())
	{
		return true;
	}else
	{
		return false;
	}
}
	
	public void logout()
	
	{
		driver.findElement(By.partialLinkText("Welcome Suresh")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
}
