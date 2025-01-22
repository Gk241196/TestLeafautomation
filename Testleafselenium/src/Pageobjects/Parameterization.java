package Pageobjects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Test
	@Parameters("FirstName")
	public void FirstName(String name1) {
		System.out.println("His FirstName is "  +name1);
	}
	@Test
	@Parameters("LastName")
	public void LastName(String name2) {
		System.out.println("His LastName is "  +name2);
	}
	
}
