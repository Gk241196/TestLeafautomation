package Pageobjects;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingpackage {
	@Test(groups="Testcase1")
	public void Testcase1()

	{
		System.out.println("Testcase1 executed");
		
		
	}
	@Test(groups="Testcase2")
	public void Testcase2()
	{
		System.out.println("Testcase2 executed");
	}
	@Test(groups="Testcase3")
	public void Testcase3()
	{
		System.out.println("Testcase3 executed");
	}
	@Test(groups="Testcase4")
	public void Testcase4()
	{
		System.out.println("Testcase2 executed");
	}
}

	

