package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	public CreateProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "productname")
	private WebElement prodName;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	@FindBy(name="productcode")
	private WebElement parNum;
	
	
	//------------------------------------------------------------GettersMethod----------------------------------------------------------------------------//
	public WebElement getProdName() {
		return prodName;
	}
	
	public WebElement getParNum() {
		return parNum;
	}
	
//------------------------------------------------------------BusinessLogic Method----------------------------------------------------------------------------//	

	public void enterProdName(String Name,String ParNum ) // here we are giving in variable forms in the bracket.
	{
		prodName.sendKeys(Name);//copy the variable  from above bracket and paste it
		parNum.sendKeys(ParNum);
		
	}
	
	public void clickSaveButton() // so here we are creating a separe method for "Save" ,caz not neccessary in every file we will be utilizing at the same time.
	{
		saveButton.click();
	}

	
	

	

	
	
}
