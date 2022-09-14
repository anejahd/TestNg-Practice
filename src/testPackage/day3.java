package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoClas() {
		System.out.println("before executing any methods in the class");
	}
	@AfterClass
	public void afterClas() {
		System.out.println("After executing any methods in the class");
	}

	@Test(groups= {"Smoke"})
	public void Weblogin() {
		//Selenium
		System.out.println("webloginhome");
		
	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void beforeafter() {
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@Test
	public void MobileLogin() {
		//Appium
		System.out.println("Mobile Sign In");
	}
	@BeforeSuite
	public void BeSuite() {
		System.out.println("I will be 1st");
		
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I am the no 1 from last");
	}
	
	@Test
	public void MobilesignInLogin() {
		//Appium
		System.out.println("Mobile Sign Out");
	}
	
	@Test
	public void LoginAPIcarloan() {
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
