package TestNG;

import org.testng.annotations.Test;

public class SampleTest_Invocation {  // here Invocation means runnning teh same testscript with same set of data, ,ultiple times is called as invocation.
	
	@Test(invocationCount =3 )
	public void createContact() // here make sure you write the Testannotation 
	{
		
		System.out.println("Contact Created");
	}
	
	
	
	@Test
		public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	
	
	@Test
	public void deleteContacts()
	{
		System.out.println("Contacts Deleted");
	}

}

	


