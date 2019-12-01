package Prctce;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dummy2 {
	@Test(groups = {"karthik"})
	@AfterClass
public void twotest3() {
	System.out.println("AfterClass-test3");
}
	@Test
	@BeforeMethod
public void twotest4() {
	
	System.out.println("BeforeMethod-Test4");
}
}
