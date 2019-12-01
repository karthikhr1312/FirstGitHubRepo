package Prctce;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dummy1 {

	@Test(groups = {"karthik"})
	public void onetest1() {
		System.out.println("test1");
	}	
		@BeforeTest
		public void onetest2() {
			System.out.println("BeforeTest-test2");	
		
	}
}


