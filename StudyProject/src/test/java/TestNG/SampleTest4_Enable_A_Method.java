package TestNG;

import org.testng.annotations.Test;

public class SampleTest4_Enable_A_Method {  // so here we are using enable method,which is basically not executing one method out of all.
	// say like in this program we dont want to execute second method which is modify method ,thne we will use "enable" mEthod and run the program.
	// So if you see the report it will show only two methos runned that is create method and delete Method.
	@Test
	public void createContact() // here make sure you write the Testannotation 
	{
		
		System.out.println("Contact Created");
	}
	
	
	
	@Test(enabled = false)
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
