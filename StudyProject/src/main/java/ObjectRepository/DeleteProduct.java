package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
	public DeleteProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value=\"Delete\"]") 
			private WebElement selectDelete;
	
	
//----------------------------------------------------------------------------------------------------------------//	
	
	public void selectPrd(WebDriver driver,String ProName)
	{
		driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='"+ProName+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	
	public void clickDeleteButton() // create a nother method statement for teh loop.
	{
		selectDelete.click();
	}
	
	
	
	
	public void validatePrdDeleted(WebDriver driver,String ProName) // copy from "Actualfile_creating_Add_Delete_Product2 file.
	{
		   
		   List<WebElement> prdList = driver.findElements(By.xpath("(//table[@class=\"lvt small\"]/tbody/tr/td[3])[position()>1]"));
	 	   Boolean flag=false;
	 	   
	 	   for (WebElement prdName : prdList)
	 	   {
	 		 String actPrd = prdName.getText();
	 		 if(actPrd.contains(ProName))
	 		 {
	 			 flag=true;
	 			 break;
	 		 }
			
	       }
	 	   
	 	  if(flag)
	 	  {
	 		  System.out.println("Product is deleted");
	 	  }
	 	  
	 	  else
	 	  {
	 		  System.out.println("Product is not deleted");
	 	  } 
	}                                                             // Now go back to the testscript and callfrom there.       


}
