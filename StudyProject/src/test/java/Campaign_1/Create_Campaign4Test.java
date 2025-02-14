package Campaign_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utilities.BaseClass;
import Generic_utilities.Excel_utility;
import Generic_utilities.File_utility;
import Generic_utilities.WebDriver_Utility;
import Generic_utilities.java_utility;
import ObjectRepository.CampLookUpImgPage;
import ObjectRepository.CreateCampPage;
import ObjectRepository.CreateOrgPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrgLookUpImgPage;
import ObjectRepository.ValidateCampPage;
import ObjectRepository.ValidateOrgPage;
@Listeners(Generic_utilities.ExtentReportImplementation.class)    // this line is implemented foe lsiteners class, for refernce refer to listeners class in generic_utilities.now if you save n run the program, assertion is not passed,
                                                // so you need to type @Listeners(Generic_utilities.Listeners.class) above teh classname
                                               // Then make sure that we have to always write the retry method in @testAnnotation bracket.see line33.you got to make some changes to it.
                                              // Then we have to intensionally fail the script
                                             // hence intensionally we have to fail it by typing Assert.fail(i am failing this testscript intenstionally); below the lookupimage line.then again you save and run the program.
                                            // you will see this error in the console AssertionError:  i am failing this testscript intenstionally,also you will see 1 failure in console report.Total tests run: 4, Passes: 0, Failures: 1, Skips: 0, Retries: 3
                                           // tehn you refresh the project and you will see in test_output as failed.png.Then you open that png file.it will show you the screenshot image.
                                          // Then you hav eto go to batchExecution file and save and runthe program here.
                                         // you will see teh programs runs NAd its reort is Total tests run: 6, Passes: 2, Failures: 1, Skips: 0, Retries: 3
                                        // Now refresh the folder and open the failed file you will see teh screen shot
                                       //Then go and open the emable report it will give you the actual detail report.liek the create camp file reruns for 4 times,cretae organization filed is run succesfully also the create product file is run sucessfully.
public class Create_Campaign4Test extends BaseClass {
	
//@Test(retryAnalyzer = Generic_utilities.RetryAnalyser.class) //originally script was diffrent we made chnages for retrylsitener method.
	@Test
	public void create_Campaign4Test()  throws Throwable { 
		
		

//====================================================================================================================================================================================//				
//**************************************************************************************************************************************************//		
		//-----------------------Hardcoding "HomePages "WebElement"	---------------------------------------------------------------------------------//    		
//**************************************************************************************************************************************************//			

		
		HomePage home = new HomePage(driver);
		home.clickMoreLink();
		home.clickCampLink();
//====================================================================================================================================================================================//						
//**************************************************************************************************************************************************//		
				//------------------------Hardcoding CampaignLookUpImage---------------------------------------------------------------------------------//    		
//**************************************************************************************************************************************************//			
		
		
		CampLookUpImgPage img = new CampLookUpImgPage(driver);
		img.clickCampLookUp();
		
	//	Assert.fail(" i am failing this testscript intenstionally");


		java_utility jlib = new java_utility();
		int ranNum = jlib.getRandomNum();
//====================================================================================================================================================================================//		
//**************************************************************************************************************************************************//		
				//------------------------Hardcoding the "Data Validation" Method with the help of Excel_Utility File.---------------------------------------------------------------------------------//    		
//**************************************************************************************************************************************************//			

		Excel_utility elib = new Excel_utility();
		String CampName = elib.getExcelData("Campaigns", 0, 0)+ranNum;
//====================================================================================================================================================================================//		
//**************************************************************************************************************************************************//		
		//------------------------Hardcoding "CreateOrganization detail page" with "CreateOrgPage" Repository file---------------------------------------------------------------------------------//    		
//**************************************************************************************************************************************************//			
		
		
		CreateCampPage campPage = new CreateCampPage(driver);
		campPage.enterCampDetails(CampName);
		campPage.clickSaveButton();
//====================================================================================================================================================================================//				
//**************************************************************************************************************************************************//		
				//------------------------------Hardcoding Validation steps------------------------------//---------------------------------------------------// 
//**************************************************************************************************************************************************//			

		ValidateCampPage validate = new ValidateCampPage(driver);
		String actData = validate.validateCampDetails(driver);  // so first we have made changes in this linea as we were working on assertion method.to validate the data  the actualdata from the excel data.
		                                                       //Then we went back to "validateCamppage file from "objectrepository file" made changes.
		                                                     // And then again we came back to this file and made changes in above line after making chaanges in "validateCamppage file from "objectrepository file".
	                                                        //Then you save the program and run it.but it showed an error so we had to go back to base class now and make the changes
		                                                   //so we first commented the parameter line,public void bc(string browser)line and }line,here make sure you are not commenting the @BeforeClass(groups= {"smokeTest","regressionTest"})line
		                                                  //and thne uncommented publicvoidbc()throws throwable,file utility and string browser=fib line
		                                                  //now save the program and run again.you will see that the program has runned succesfully.
		Assert.assertEquals(actData, CampName);
	    System.out.println("Camp is validated");
		
//====================================================================================================================================================================================//						
		
    	//-------------------------------Hardcoding "HomePages "WebElement"	for Signout-------------------------------------------------------//
//====================================================================================================================================================================================//					
//====================================================================================================================================================================================//						
		
//====================================================================================================================================================================================//							
		//Organization Testscript pasted below for TestNg Execution - Regional Regression Testing.
//====================================================================================================================================================================================//							
		
}	//dont forget to close the above testscript with this bracket,orelse will show an error

		
		

		
	

}
//**************************************************************************************************************************************************//				
//**************************************************************************************************************************************************//				
		
		
		


