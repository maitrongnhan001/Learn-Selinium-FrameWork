package basicsOfTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class FirstTestNGProgram {
	
	@Test(priority=2)
	public void tc1 () 
	{
		AssertJUnit.assertEquals(12, 14);
		System.out.println("My first testNG Testcase");
	}
	
	@Test(priority=3)
	public void tc2 ()
	{
		System.out.println("My second testNG Testcase");
	}
	
	@Test(priority=1)
	public void tc3 ()
	{
		System.out.println("My third testNG Testcase");
	}
}
