package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicTestNG {
	//TODO Auto-generate method stub
	
	@AfterTest
	public void lastExectution() {
		System.out.println("I will execute last");
	}
	
	@Test
	public void Demo() {
		System.out.print("Hello"); //automation
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
   
}
