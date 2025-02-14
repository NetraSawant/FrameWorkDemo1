package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgLookUpImgPage {
	public  OrgLookUpImgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	private WebElement orgLookUp;
	
	
	
	
	



	//-----------------------------------------------Getter Method---------------------------------------------------------------//
	public WebElement getOrgLookUp() {
		return orgLookUp;
	}
//----------------------------------------------BusinessLogic Method----------------------------------------------------------//
	
	public void clickOrgLookUp()
	{
		orgLookUp.click();
	}
	
	
	
	

}
