package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
	SoftAssert soft = new SoftAssert();  //do object creation,save it in a variable and call the method "assertEquals".Well this method is used very rare.
	soft.assertEquals(false, true);      // if you see here carefully the values are not same but still the assertion is passed in console,taht means the actual validation is not done properly
	System.out.println("Step3");         // Hnece we need to follow a method called "assertall method"
	System.out.println("Step4");         // So at teh end of all the steps we will pass this method    
	soft.assertAll();                    // So now save and run the program,you will see the assertion is passed and also is failed.
	                                     //AssertionError: The following asserts failed:expected [true] but found [false],so the proper validation has happened.
	
	
		
	}

}
