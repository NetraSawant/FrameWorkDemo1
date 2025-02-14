package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionEx {
	
	// HardAssert is used for mandatory fields.
	// HardAssert is static in Nature
	// If Assert fails stops the execution immediately.And furthur execution will not happen.
	// And will show AssertionError.
	
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals("B", "A");  // here the expected value is B and the actual value is A
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void m2()  // here we have taken String data type
	{
		String ExpData = "Shobha";
		String actData = "Shobha";
		Assert.assertEquals(actData, ExpData);   
	}

	@Test
	public void m3() // here we have taken integer datatype.
	{
		int a=10;
		int b=10;
		Assert.assertEquals(b, a);   // here the expected value is b and the actual value is a,
		System.out.println("Values are equal"); // And then you pass the printing statement. 
		                                       // then dont forget to give the test annotation,now to run the program	click on the run below the test annotion    
		
	}
	
	@Test
	public void m4()
	{
		int a=10;
		int b=1;
		Assert.assertEquals(b, a, "not equal"); // so here the expected data is b,actual data is a and then the printing line 'not eual.
		System.out.println("Values are equal"); // or else the printing statement is "Values are eual".
	}
	
	@Test
	public void m5()
	{
		int a=10;
		int b=1;
		Assert.assertNotEquals(b, a, "equal values"); // here actual is b and expected is a.
		System.out.println("Not Equal"); // As you see both the values are not equal ,so it should print "Not Equal".
		
	}
	
	@Test
	public void m6()
	{
		int a=10;
		int b=10;
		Assert.assertNotEquals(b, a, "equal values"); // here actual is b and expected is a.
		System.out.println("Not Equal"); // As you see both the values are  equal ,so it should print "equal values did not expect [10] but found [10]".
	}
	
	@Test
	public void m7()
	{
		String expData="Qspiders";
		String actData="Qspider";
		Assert.assertTrue(actData.equalsIgnoreCase(expData),"False=");
		System.out.println("True==="); // As you see both the values are not equal ,so it should print "AssertionError: False= expected [true] but found [false]".
	}
	@Test
	public void m8()
	{
		String expData="Shobha";
		String actData="Shob";
		Assert.assertFalse(actData.contains(expData), "Same values==");
		System.out.println("False value"); // check the console and also change the value to same and then see the message in console.
	}

	@Test
	public void m9()
	{
		String s="qspider";
		Assert.assertNull(s, "It is not null");
		System.out.println("it is null");  // .AssertionError: It is not null expected [null] but found [qspider]
		// now you can also try by leaving the string value empty within the inveted quotes.you will see the error as AssertionError: It is not null expected [null] but found []
	}
	
	@Test
	public void m10()
	{
		String s="netra";
		Assert.assertNotNull(s, "It is  null");
		System.out.println("it is not null");  // it is not null
		// now you can also try by giving some  string value say "netra" within the inveted quotes.you will see the error as it is not null as you have given the value as netra.
	}
	
	@Test
	public void m11()
	{
		String s="Hello";
		String s1="Hello";
		Assert.assertSame(s1, s, "not same");
		System.out.println("Same values");
				
	}
	
	@Test
	public void m12()
	{
		String s="Hello";
		String s1="Hell";
		Assert.assertSame(s1, s, "not same");
		System.out.println("Same values");  //AssertionError: not same expected [Hello] but found [Hell]
				
	}
	@Test
	public void m13()
	{
		String s="Hello";
		String s1="Hello";
		Assert.assertNotSame(s1, s, "same");
		System.out.println("Not Same values"); // AssertionError: same expected not same [Hello] but found [Hello]
				
	}
	
	@Test
	public void m14()
	{
		String s="Hello";
		String s1="Hell";
		Assert.assertNotSame(s1, s, "same");
		System.out.println("Not Same values");  //Not Same values
				
	}
		
		@Test
		public void m15()  //say if you intentionally want to fail the script.
		{
			Assert.fail("I am Failing the script");  //AssertionError: I am Failing the script
		}
	
	
}
