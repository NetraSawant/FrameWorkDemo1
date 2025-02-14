package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampPage {
	public CreateCampPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="campaignname")
	private WebElement campName;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	
//-------------------------------------------------------Getter Method---------------------------------------------------------------------------//
	public WebElement getCampName() {
		return campName;
	}
	
//-----------------------------------------------------BusinessLogic Method-----------------------------------------------------------------------------//
	
	public void enterCampDetails(String CampName)
	{
		campName.sendKeys(CampName);
		
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	
}
