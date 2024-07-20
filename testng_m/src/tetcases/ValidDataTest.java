package tetcases;

import org.testng.annotations.Test;

import library.Login;
import utils.Apputils;

@Test
public class ValidDataTest extends Apputils  
{

	public void adminlogintest()
	
	{
	
	Login lp = new Login();	
	lp.loginpage("Admin", "Qedge123!@#");;
	Boolean res = lp.isAdminModuleDisplayed();
	lp.logout();
	lp.closeApp();	
		
	}
		
	
}
