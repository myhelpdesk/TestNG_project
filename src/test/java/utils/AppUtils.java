package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {
	
	@BeforeTest
	public void login()
	{
		System.out.println("GMail Login");
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("GMail Logout");
	}
	
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("Launch GMail");
	}
	
	@AfterSuite
	public void closeApp()
	{
		System.out.println("Close GMail");
	}

}
