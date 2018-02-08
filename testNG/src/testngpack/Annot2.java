package testngpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	

	@BeforeSuite
	public void installSoftware() {
		System.out.println("Before Suite Baby");
	}
	
	@Test
	public void runTest() {
		System.out.println("1 Test Ran");
	}
	
	@AfterSuite
	public void deinstallSoftware() {
		System.out.println("After Suite baby");
	}

}
