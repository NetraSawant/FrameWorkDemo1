package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampLookUpImgPage {
	public CampLookUpImgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement campLookUp;
	
//----------------------------------Getter method for campaingImagelokup Image---------------------------------------------------//	
	
	public WebElement getCampLookUp() {
		return campLookUp;
	}
//-----------------------------------------BusinessLogic Method for campaignImageLookup Image------------------------------//	
	public void clickCampLookUp()
	{
		campLookUp.click();
	}
	
	
	
	
		
	

}
