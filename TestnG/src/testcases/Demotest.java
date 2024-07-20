package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest 
{
	
	@Test(priority = 1)
void test1()
{
System.out.println("Love");

}
	@Test(priority = 0) 
	void test2()
	{
		System.out.println("loveyou");
	}
	
	@Test(priority = 3) 
	void test3()
	{
		System.out.println("loveme");
	}
}


