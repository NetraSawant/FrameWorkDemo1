package Generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

public class WebDriver_Utility {
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void windowSwitching(WebDriver driver,String partialValue)
	{
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> it = allwin.iterator();
		
		while (it.hasNext())    // so basically we have to iterate or handle one afterthe other window,till we reach the expected window.
		{
			
			String win = it.next();  // so we will put it in a variable.
			driver.switchTo().window(win);     // so we will tell the driver to switch to the required window.
			if (win.contains(partialValue))  // so with the helpof if condition and win.contains we will copy the partial link text of the "product page i.e"url" of that page.
			{                                     // and then enter into the loop nad brek the loop.
				break;                            // this is teh standard way of handling the multiple windows we  is more often use in real time.
			}

		}
	}

	public void acceptAlert(WebDriver driver) 
		{
			driver.switchTo().alert().accept();
		
	}
		
		public static String takeScreenShotEx(WebDriver driver,String screenShotName) throws Throwable
		{
			TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
			File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots"+screenShotName+".png");
			FileUtils.copyFile(src, dest);
			
		//	return screenShotName; // Afterthsi step go back to extentReportimplementation file.and follow the steps.
			
			
			
			return dest.getAbsolutePath();
			
		}     
		
		
		
		

		
		
	}



