package TestNG;

import org.testng.annotations.Test;



public class SampleTest {
	
	//Here we are creating a simple file called "sampleTest"
	// Normally we write teh main method "public static void main (Stringargs[]); method
	// But here in TestNG File we dont use Main method ,instead we use Test Annotation,So without test annotation the program cannot be runned.
	// So we are going to write different Methods here just see how a TestNG file runs.
	// so for the first time when you write @Test make sure you click to add"TestNG library.
    // After this step you will see that the TestNg library is added on the left hand side of "Project explorer"
	// And then we will import teh file,how you got to take the cursor on the "test and you will have the options there.
    // And then you save and run the program.
	// After running the program ,you will see the report run in console.
	// so Sofar we are writing @Test Annotation before every method,which is not posible to write it on eg15 testcases or moretahn that every single time,hence we will write above the class name file
	// so that its applicable to all the rest of the methods. and then run the program. you will see all the three methods printed in the report in console. 
	
	// But After running the program, the report is not printing in the order what we placed,rather it sprinting in the alphabetical order.
	// so to change the order of execution we will have to go with " PRIORITY".lETS SEE HOW
	// So the default value of priorit is "0".
	//Hence we will remove the "@test anoation above teh class name ,and then we will write @Test(priority= 1,2,3) any of those inside the brackets and it will run according to its priority.
	// Now you will see the report gets printed exactly in the order it was written. it also accepts the negative value eg(-1,0,1).
	
	
	@Test(priority = 1)
	public void createContact() // here make sure you write the Testannotation 
	{
		System.out.println("contact Created");
	}
	
	
	@Test(priority = 2)
	public void greetingPeople()
	{
		System.out.println("Hello Everybody");
	}
	
	@Test(priority = 3)
	public void deleteContacts()
	{
		System.out.println("Contacts Deleted");
	}
	
	
}
