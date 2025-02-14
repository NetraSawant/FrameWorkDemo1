package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateProdPageWithCampaign {
	public ValidateProdPageWithCampaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateProd(WebDriver driver,String ProName)  
	
	{
		String actProName = driver.findElement(By.xpath("//span[@id=\"dtlview_Product\"]")).getText();   // here inspect "product" and also make sure you are copying thr right path.      
	//       if(actProName.contains(ProName))
	//		{
	//			System.out.println("Product Name is created");
	//		}
	// 		else
	// 		{
	// 			System.out.println("Product Name is not created");
	// 		}
		return ProName;
	        
	}
	
	

}
