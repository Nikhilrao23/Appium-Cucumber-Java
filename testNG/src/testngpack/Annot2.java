package testngpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	

	@BeforeSuite
	public void installSoftware() {
		System.out.println("Suite");
	}
	
	@Test
	public void runTest() {
		System.out.println("1");
	}
	
	@AfterSuite
	public void deinstallSoftware() {
		System.out.println("Suite");
	}

}
