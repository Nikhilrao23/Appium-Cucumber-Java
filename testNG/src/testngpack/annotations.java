package testngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	
	@Test
	public void OpeningBrowser() {
		System.out.println("3");
	}
	
	@Test
	public void ClosingBrowser() {
		System.out.println("2");
	}
	
	@BeforeMethod
	public void a() {
		System.out.println("Method");
	}
	
	@AfterMethod
	public void b() {
		System.out.println("Method");
	}
	
	@BeforeTest
	public void testinga() {
		System.out.println("Test");
	}
	
	@AfterTest 
	public void testingb() { 
		System.out.println("Test");
		
	}
	
	@BeforeClass
	public void Classa() {
		System.out.println("Class");
	}
	
	@AfterClass
	public void Classb() { 
		System.out.println("Class");
		
	}

}
