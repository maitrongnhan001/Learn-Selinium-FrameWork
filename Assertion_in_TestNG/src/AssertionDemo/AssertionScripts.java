package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	@Test
	public void test1 () {
		System.out.println("Testcase1 started");
		Assert.assertEquals(12, 13);
		System.out.println("Testcase1 completed");
	}
	
	@Test
	public void test12 () {
		System.out.println("Testcase2 started");
		Assert.assertEquals(12, 13, "Dropdown count down dose not match. Please check it with deveploer");
		System.out.println("Testcase2 completed");
	}
	
	@Test
	public void test13 () {
		System.out.println("Testcase3 started");
		Assert.assertEquals("Hello", "Hello", "Words dose not match! Please raise a bug");
		System.out.println("Testcase3 completed");
	}
}
