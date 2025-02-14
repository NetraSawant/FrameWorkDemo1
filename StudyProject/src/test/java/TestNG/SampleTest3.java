package TestNG;

import org.testng.annotations.Test;

// ok so here we have three method here.out of which 1) method is independant,2) Second is dependant on first method. , and then first method has been prioratize second.
//And the second method is dependand on  the first method and has been priratize first.
//well the 3) method has just been given as the priority.
// Now save and run the program,and check the report.
// So here we are dealing with both teh method (dependsOn Method and the priority Method together) so it will give first prefernec to the "dependsOn method and then the priority.
// If you see the report first create contact gets executed then modify and then delete.
public class SampleTest3 {
	

	@Test(priority = 2)
	
	public void createContact() // here make sure you write the Testannotation 
	{
		
		System.out.println("Contact Created");
	}
	
	
	
	@Test(dependsOnMethods= "createContact",priority = 1 )
		public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	
	
	@Test(priority= 3)
	public void deleteContacts()
	{
		System.out.println("Contacts Deleted");
	}

}
