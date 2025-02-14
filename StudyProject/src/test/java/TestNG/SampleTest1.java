package TestNG;

import org.testng.annotations.Test;

//So here if you see rest of the two methods are "DEPENDEND" on the Firsy Method.
//so we will we using "dependsOnMethod",lets see how.
// since the first method is "Independant" and teh other two are "dependend" on it,then we will write the "dependend method" only on the other two method ,which are dependend.

// go to teh second method now and  type teh @test annotation as @Test(dependsOnMethods= "createContact")
// Now save aand run the program,you will see that
// so if you see here now the independant method is safe hence the dependant method are also passed
// what if say the independant method has an error,will the dependant method pass?
// Yes it will pass i.e will get skipped ,but will show 1 failure,,you can try, by just writing no 1 inthe independant method and run teh program.
// it will show like 3 run cases,1 failure and 2 skipped in the report. 
// That is if the first independant method fails then it will not go to the next methods,it will skipp the method and will not run, will not get executed.


//


public class SampleTest1 {
	
	@Test
	public void createContact() // here make sure you write the Testannotation 
	{
		
		System.out.println("Contact Created");
	}
	
	
	
	@Test(dependsOnMethods= "createContact")
		public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	
	
	@Test(dependsOnMethods= "createContact")
	public void deleteContacts()
	{
		System.out.println("Contacts Deleted");
	}

}
