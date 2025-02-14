package Generic_utilities;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportImplementation implements ITestListener
{

	ExtentReports report; // making these two classes global and saving it in variable called report and test.
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {  /// [B] Second step:- so copy the above variable report down
		test=report.createTest(result.getMethod().getMethodName());
	}

	
	public void onTestSuccess(ITestResult result) {  //[C] Third Step:Again copy the above variabel test and paste down
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable()); // So after this step go to generic_utility and open webdriver _utility
		// now in webDriver_utilityFile, down type a public static method and follow the steps.
		
	}

	
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable()); 
		
		String screenshot=null;
		try {
			screenshot=WebDriver_Utility.takeScreenShotEx(BaseClass.sdriver, result.getMethod().getMethodName());
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshot);
		
	}

	
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable()); 
		
	}

	
	public void onStart(ITestContext context)  // [A] FirstStep to be taken //this is basically the baclground of teh report. next is system configuration.
	{
		String time = new Date().toString().replace(" ", "_").replace(":", "_");  //here we need to add an Dependency,hence go to google type maven repository and type ExtentReports.now copy thedeepndency and paste it in pom xml file and dont forget to update the project and save the pomxml file.
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html"+time);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("VtigerReports");
		spark.config().setReportName("Shobha");
		
		//system configuration// so here first we will make ityt globally,so we will use two classes.lets go up and do that ExtentReports report; // making these two classes global and saving it in variable called report and test.
		// Now comeback again down and do the system configuration.
		
		report =new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("executedBy", "SHOBHA");
		report.setSystemInfo("reviewedBy", "Netra");
		
	}

	
	public void onFinish(ITestContext context) {
		
		report.flush();
		
	}   // After this step we have to implement into the test script,hence we will be using createcampaignfile.
	 // so there again we will make some changes like above the classname as @Listeners(generic_utilities.ExtentReportImp.class)
	//Then select the line@Test(retryAnalyzer=generic_utilities.RetryImp.class)
	//Then type @test

}
