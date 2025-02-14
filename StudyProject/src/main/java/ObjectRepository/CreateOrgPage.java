package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	public CreateOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	
	@FindBy(id="phone")
	private WebElement phnNum;
	
	@FindBy(name="email2")
	private WebElement mail;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")	
	private WebElement saveButton;
	
	
	
//--------------------------------------------------------Getters Method---------------------------------------------------------------------//	

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getPhnNum() {
		return phnNum;
	}

	public WebElement getMail() {
		return mail;
	}
	
	
	
//--------------------------------------------------------Business Logic Method---------------------------------------------------------------------//		
	
	public void enterOrgDetails(String OrgName,String phnNo,String mailId) // here we are giving in variable forms in the bracket.
	{
		orgName.sendKeys(OrgName);//copy the variable  from above bracket and paste it
		phnNum.sendKeys(phnNo);//copy the variable  from above bracket and paste it
		mail.sendKeys(mailId);//copy the variable  from above bracket and paste it.Now save the file and go back to the testscript file.
	}
	
	public void clickSaveButton() // so here we are creating a separe method for "Save" ,caz not neccessary in every file we will be utilizing at the same time.
	{
		saveButton.click();
	}

}

// So here we are basically saving all the methods performed while creating organization page i.e(organization details page and also the save action)  in one file that called "Create OrgPage. 
// steps are same as the other repository file"
