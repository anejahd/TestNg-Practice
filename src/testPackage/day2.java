package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void New() {
		System.out.println("Day 2 Test");
	}
	
	@BeforeTest
	public void prerequiste() {
		System.out.println("I will execute first");
		
	}
	

	

}
