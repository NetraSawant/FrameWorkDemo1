package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateCampPage {
	public ValidateCampPage(WebDriver driver)
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
		
		public String validateCampDetails(WebDriver driver) // dont forget to create body first.  // Again here we have made some changes in this line later,original was differnt, when we we were learning assertion topic to validate teh data.
		{
			String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
			
			
//			if(actData.contains(CampName))
//			{
//				System.out.println("Campaign Name is created");
//			}
//			else
//			{
//				System.out.println("Campaign Name is not created");
//			}
			return actData;
		}

}
