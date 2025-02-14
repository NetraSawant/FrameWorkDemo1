package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateOrgPage {
	public ValidateOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// So after tehabove step, we cannot validate so many variables with teh help of "FindBy",hence we will directly use "BussinessLogic method .lets see how.
	// so we will first we will create a method name" validateorgDetails().
	// then we will first copy the entire loop from the test script and paste it down
	// So after pasting where ever you are getting error, we have to initialize it.lets see how.
	// so whst you do is  inside teh bracket of the method statement type (WebDriver driver,String OrgName).
	// Now you will see that there is no error.
	// so now save it and go back to test csript file and call from there.
	
	public String validateOrgDetails(WebDriver driver) // dont forget to create body first.
	{
		  
        String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Organization Name\"]")).getText();
 //       if(actData.contains(OrgName))
 //   	{
 //   		System.out.println("Organization Name is created");
 //   	}
 //   	else
 //   	{
 //   		System.out.println("Organization Name is not created");  // save and run the program. you will see "organization Name is created in console."
 //   	}
		return actData;
	}
   

}
