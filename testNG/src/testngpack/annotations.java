package testngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	
	@Test
	public void OpeningBrowser() {
		System.out.println("Test 1");
	}
	
	@Test
	public void ClosingBrowser() {
		System.out.println("Test2");
	}
	
	@BeforeMethod
	public void openingLogin() {
		System.out.println("Login Page is opened");
	}
	
	@AfterMethod
	public void closingLogin() {
		System.out.println("");
	}
	
	@BeforeTest
	public void test1() {
		System.out.println("Test1 Execution");
	}
	
	@AfterTest 
	public void test2() { 
		System.out.println("Test1 Close");
		
	}
	
	@BeforeClass
	public void Class1() {
		System.out.println("Class Execution");
	}
	
	@AfterClass
	public void Class2() { 
		System.out.println("Class Close");
		
	}
	
	@BeforeSuite
	public void Suite1() {
		System.out.println("Suite Execution");
	}
	
	@AfterSuite
	public void Suite2() { 
		System.out.println("Suit Close");
		
	}
}
