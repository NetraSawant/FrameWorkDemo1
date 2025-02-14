package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//---------[A]:- so now we will be Hardcoding the elements of the "HomePage" of vtiggerApplication.So the elemnets present in login page are,(Campaign,Organization,product,contact)
		//---------[B]:- So we have to create every time new page,for eg,here we have opened a "HomePage" in "ObbjectRepository".
		//---------[C]:- so right now we are dealing with "create _Camapign2" file.Likewise  other files too, we will have to perform  same action.
		//---------[D]:- so the first thing is, we will copy the " linktext locator" and its "Attribute value that is "more" from the campaign_2 file.as we have to hardcode tha step now.which are"more" and "campaign".
		//---------[E]:-then we will paste it in "HomePage-" Object repository file",But make sure you are writting teh@ sign before it.
		//---------[F]:-then we have to make the "more" web element "private" as to make it secure so that nobody can use it.
		//---------[G]:-So we have to call for "private" and then WebElement,and give a variable to it,here we have given "UserTextField" variable make the "variable" is written alltogetter.
		//---------[H]:-Again we will repeat the same process for "campaign" WebElement locator too.
		//---------[I]:-And this entire process is called as "Element Declaration".
	//===============================================================================================================================================================================================//	

	//------------------------------------STEP1:- Is to do " Element Declaration Process"-Follow teh above Steps------------------------------------------------------------------//	
	//------------------------------------STEP2:- Is to do " Element Initialization Process"- Hence we have to create "Constructor" for" Object Creation Process---------//	
	//===============================================================================================================================================================================================//	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="More") // by using FindBy method
	private WebElement moreLink; //Then make it private with the help of webelement method and type moreLink as the variable.
	
	
	@FindBy(linkText = "Campaigns")// by using FindBy method
	private WebElement campLink;//Then make it private with the help of webelement method and type campLink as the variable.
	
	@FindBy(linkText = "Organizations")// by using FindBy method
	private WebElement orgLink;//Then make it private with the help of webelement method and type campLink as the variable.
	
	@FindBy(linkText = "Products")// by using FindBy method
	private WebElement proLink; ////Then make it private with the help of webelement method and type campLink as the variable.
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement adminLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;


//---------------------------------- Now call the getter method.------------------------------------------------------------------------------//

	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getSignOutLink() {
		return signOutLink;
	}


	public WebElement getProLink() {
		return proLink;
	}


	public WebElement getOrgLink() {
		return orgLink;
	}


	public WebElement getMoreLink() {
		return moreLink;
	}


	public WebElement getCampLink() {
		return campLink;
	}
	
	
	
	//---------------------------------- Now call the Business Logic method.------------------------------------------------------------------------------//
	public void clickMoreLink()  // so create here a method statment called "clickMoreLink,create body paste teh above variable moreLink.click() action.
	{
		moreLink.click();
	}
	
	public void clickCampLink()
	{
		campLink.click();   // so create here a method statment called "clickCampLink,create body paste teh above variable campLink.click() action.
	}                       // now save and go back to the script.
	
	public void clickOrgLink()// so create here a method statment called "clickCampLink,create body paste teh above variable campLink.click() action.
	{
		orgLink.click();// now save and go back to the script.
	}
	
	public void clickProLink()// so create here a method statment called "clickProLink,create body paste teh above variable proLink.click() action.
	{
		proLink.click();// now save and go back to the script.
	}
	
	public void logOut() // so create here a method statment called "logOut(),then create body paste teh above variable adminLink.click() action.
	{
		adminLink.click();
		signOutLink.click();// also paste the signOutLink  variable down with click action. and save it.
	}

}





