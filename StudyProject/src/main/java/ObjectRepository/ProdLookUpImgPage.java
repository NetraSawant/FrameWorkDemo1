package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdLookUpImgPage {
	public ProdLookUpImgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement prodLookUp;

//--------------------------------------------------Getterts Method-----------------------------------------------------------------------//
	public WebElement getProdLookUp() {
		return prodLookUp;
	}

	
	//--------------------------------------------------Business Logic Method-----------------------------------------------------------------------//
	
	public void clickProdLookUp()
	{
		prodLookUp.click();
	}
}
