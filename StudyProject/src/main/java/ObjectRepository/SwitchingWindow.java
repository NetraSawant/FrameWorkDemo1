package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchingWindow {
	public SwitchingWindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"Select\"]")
			private WebElement prdPlusSign;
	
	@FindBy(id="search_txt")
	private WebElement prdName;
	
	@FindBy(name="search")
	private WebElement searchPrd;
	
	// so next comes dynamic xpath,but we cannot write dynamixxapth with "findby",hence we will directly write it with bussiness logic metghod.
	// so copy the entire dynamic xpath line from the testscript,and paste it inside teh body.
	//Now write teh variable inside teh bracket.
	//Now write teh method of click action to teh plus sign
	//Now next is to write teh "productname " method
	//Now next is to write teh method for search product
	// now save and go back to the camp and prod testscript nad start selectingthe lines and tehn call from there,make sure where you are seelcting from.
	
	//----------------------------------------BusinessLogic Method----------------------------------------------//
	
	public void dynamicPath(WebDriver driver,String ProName )
	{
		driver.findElement(By.xpath("//a[text()='"+ProName+"']")).click();  
	}
	
	public void clickPrdPlus()
	{
		prdPlusSign.click();
	}
	
	public void enterPrdName(String name)
	{
		prdName.sendKeys(name);
	}
	public void searchprdName()
	{
		searchPrd.click();
	}

}
