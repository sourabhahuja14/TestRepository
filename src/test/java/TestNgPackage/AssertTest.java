package TestNgPackage;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class AssertTest {
	
	@Test
	public void hardass()
	{
		System.out.println("Hard Assert Started");
		
		System.out.println("Hard Assert Started");
		Assert.assertEquals(67,67,"Values did not Match");
		System.out.println("Hard Assert Ended");
		System.out.println("Hard Assert Started");
		
	}
	
	@Test
	public void softAssert()
	{
		SoftAssert assertion=new SoftAssert();
		
		Assert.assertEquals(12,12,"Issue in SoftAssert");
		
		System.out.println("Soft Assert Ended");
		
		assertion.assertAll();
	}

}
