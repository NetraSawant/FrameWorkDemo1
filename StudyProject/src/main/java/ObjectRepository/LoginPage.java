package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//---------[A]:- so now we will be Hardcoding the elements of the "LoginPage" of vtiggerApplication.So the elemnets present in login page are,(username,password,loginbutton)
	//---------[B]:- So we have to create every time new page,for eg,here we have opened a "login page" in "ObbjectRepository".
	//---------[C]:- so right now we are dealing with "create _Camapign2" file.Likewise in otehr files too we will have to perform  same action.
	//---------[D]:- so the first thing is, we will copy the " name locator" and its "Attribute value".
	//---------[E]:-then we will paste it in "loginPage-" Object repository file",But make sure you are writting teh@ sign before it.
	//---------[F]:-then we have to make the "username" web element "private" as to make it secure so that nobody can use it.
	//---------[G]:-So we have to call for "private" and then WebElement,and give a variable to it,here we have given "UserTextField" variable make the "variable" is written alltogetter.
	//---------[H]:-Again we will repeat the same process for "Password" WebElement too.
	//---------[I]:-Again we will repeat the same process for "Login" WebElement too.But this time make sure the locator name is right.its "id".
	//---------[J]:-And this entire process is called as "Element Declaration".
//===============================================================================================================================================================================================//	

//------------------------------------STEP1:- Is to do " Element Declaration Process"-Follow teh above Steps------------------------------------------------------------------//	
//------------------------------------STEP2:- Is to do " Element Initialization Process"- Hence we have to create "Constructor" for" Object Creation Process---------//	
//===============================================================================================================================================================================================//	
public LoginPage(WebDriver driver)     // so basically we are doing initialization process by creatinga constructor named"LoginPage" which has to be teh same name as teh class name. and type"WebDrive driver " in the bracket.
{
	PageFactory.initElements(driver, this);// tehn type "PageFactory and call (.initElements aand type driver,this)
	                                      // Now we have to call the "getetr method",lets see how.
	                                     // So we will first select the variable "user_name" below,tehn with the helpof right click,go to sources and then click to "getter'.it will open window click select all getters and tehn generate.
	                                    // So will see it will generate getters method for all (username,password,login button below.)
                                    	// So with teh help of getters we can call teh different class.
	

}
//------------------------------------STEP2:- Is to do " initialiazation Process"-------------------------------------------------------------------//		

// so here basically we will callteh "getter method by clicking "source" on the tool bar, then click "getter nad setter",then a small window will open asking to slect nad then click generate.
//After hitting the generate button you will see below the getter methods have been printed.
// Now what you have to do is we have to go back to any of the files and we have to call from there.
// Rest of teh steps are mentioned in the file itself,so follow accordingly.


	@FindBy(name= "user_name")
	private WebElement UserTextField;
	
	@FindBy(name= "user_password")
	private WebElement PassWordTextfield;	
	
	@FindBy(id="submitButton")
	private WebElement LoginButton;

//----------------------- GETTER METHODS------------------------------------//
	
	

	public WebElement getUserTextField() {
		return UserTextField;
	}


	public WebElement getPasswordTextfield() {
		return PassWordTextfield;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
	
//-------------------------------BussinessLogic Method--------------------------------------------------------------------------------------------------------------------------//		
	// Now we will try with Business Logic,lets see how.
	// Again here for Bussiness logic method create a method called "loginToApp",then type teh variables needed like (String userName,stringPassWord)
	//Then copy teh above "UserTextField" and call for sendKeys(userName)
	//Then copy teh above "PassWordTextfield" and call for sendKeys(passWord)
	//Then copy teh above "LoginButton" and call for "click" action to perform.
	// Rest of the steps have to be followed in the file.
	
	/**
	 * This method is used to login to an application.
	 * @param userName
	 * @param passWord
	 */
	
	
	public void LoginToApp(String userName,String passWord)
	{
		UserTextField.sendKeys(userName);
		PassWordTextfield.sendKeys(passWord);
		LoginButton.click();
	}
	
}
