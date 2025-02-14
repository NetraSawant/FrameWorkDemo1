package Generic_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver;  // so here we have added this line while learning "listeners class" as we had to intialize another driver so we made it static.not reletated to orginal script.
	// also we will be reinitilizing the driver while launching the browesr in here base class line no 66.Then we have to call it from the listeners class.
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	
	
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void BT()
	{
		System.out.println("Parallel Execution Starts");
	}
	
//	@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
//	public void BC(String BROWSER)
//	{	
	
	public void BC() throws Throwable
	{
		File_utility flib = new File_utility();
		String BROWSER = flib.getKeyAndValuePair("browser");
		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
		  driver = new EdgeDriver();	
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new EdgeDriver(); // default  browser
		}
		sdriver=driver;
		System.out.println("Launching The Browser");
	}
	
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void BM() throws Throwable
	{
		File_utility flib = new File_utility();
			String URL = flib.getKeyAndValuePair("url");
			String USERNAME = flib.getKeyAndValuePair("username");
			String PASSWORD = flib.getKeyAndValuePair("password");
			
			WebDriver_Utility wlib = new WebDriver_Utility();
				wlib.maximizeWindow(driver);
				wlib.waitForPageToLoad(driver);				
			
			driver.get(URL);
			
				LoginPage login = new LoginPage(driver);
				login.LoginToApp(USERNAME, PASSWORD);
			
			
		System.out.println("Login Into The Application");
	}
	
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void AM()
	{
	HomePage home = new HomePage(driver);   // here we have done the object creation for logout.
		home.logOut();	
		System.out.println("Loggingout Of The Application");
	}
	
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void AC()
	{
		driver.quit();    // here also we are closing the browser.
		System.out.println("Closing The Browser");
	}
	
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("Parallel Execution Close");
	}
	
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("DataBase Conenction Close");
	}
	
	

}
