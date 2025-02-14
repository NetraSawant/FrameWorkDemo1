package Product_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utilities.BaseClass;
import Generic_utilities.Excel_utility;
import Generic_utilities.File_utility;
import Generic_utilities.WebDriver_Utility;
import Generic_utilities.java_utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ProdLookUpImgPage;
import ObjectRepository.ValidateProdPage;


@Listeners(Generic_utilities.Listeners.class) // we are using this line or steps to practise Iretrylisteners method.original script is differnt.
// so the next step is to write the retrymethod in "testannotation method". so below in line 27,open teh brackets beside @Test anotation and type as follows (retryAnalyzer = Generic_utilities.RetryImp.class),
//so here i didnt getteh option odf RetryImp so i took this option (retryAnalyzer = Generic_utilities.RetryAnalyser.class.
// And then you save and run the program,you willsee teh assertion has passed,as we didnot fail it intentionally.
// so now we will fail the script intensionally by writing "Assert.fail" below createprodpage line no76. and then save and run the program.
//Now after running the program you will see taht the program re-runs for 4 times and teh report is Total tests run: 4, Passes: 0, Failures: 1, Skips: 0, Retries: 3
//But it will take only 1screenshot ,so to see the screen shot,refresh the "Advanceseelnium folder" go down to testoutput nad in taht see the failedscript.
// it will show you the screenshot picture taken by listeners method.
public class Create_Product4Test extends BaseClass {
	
	@Test(retryAnalyzer = Generic_utilities.RetryAnalyser.class) // here please check teh actual option wriiten above in notes.
	public void create_Product4Test() throws Throwable {
		
		//****************************************************************************************************************************************************************************************************//							
		    //---------------Sucessfully Hardcoded the BrowserLaunching Method to Generic  and also successfully called it.--------------------------//	
		//**************************************************************************************************************************************************//	
		WebDriver_Utility wlib = new WebDriver_Utility();
		java_utility jlib = new java_utility();
		File_utility flib = new File_utility();
		Excel_utility elib = new Excel_utility();
			
		//====================================================================================================================================================================================//				
		//**************************************************************************************************************************************************//		
					//-----------------------Hardcoding "HomePages "WebElement"	---------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
			HomePage home = new HomePage(driver);
			home.clickProLink();
		//====================================================================================================================================================================================//						
		//**************************************************************************************************************************************************//		
							//------------------------Hardcoding ProductLookUpImage---------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
			ProdLookUpImgPage img = new ProdLookUpImgPage(driver);
			img.clickProdLookUp();
		//====================================================================================================================================================================================//		
		//**************************************************************************************************************************************************//		
					//------------------------Hardcoding the Random class---------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
		//	java_utility jlib = new java_utility();
				int ranNum = jlib.getRandomNum();			
		//====================================================================================================================================================================================//		
		//**************************************************************************************************************************************************//		
								//------------------------Hardcoding the "Data Validation" Method with the help of Excel_Utility File.---------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
			//	Excel_utility elib = new Excel_utility();
		  		String ProName = elib.getExcelData("Product", 0, 0)+ranNum;
		//====================================================================================================================================================================================//		
		//**************************************************************************************************************************************************//		
		  					//-----------------------Hardcoding the "Data Validation" Method with the help of Excel_Utility File.-DataFormatter--------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
		  		 String ParNum = elib.readExcelDataUsingFormatter("Product", 1, 0);
		//====================================================================================================================================================================================//		
		//**************************************************************************************************************************************************//		
		  				//------------------------Hardcoding "CreateProduct detail page" with "CreateOrgPage" Repository file---------------------------------------------------------------------------------//    		
		//**************************************************************************************************************************************************//			
		            
		CreateProductPage prdpage = new CreateProductPage(driver);
		prdpage.enterProdName(ProName, ParNum);	
	//	Assert.fail();
		prdpage.clickSaveButton();
		//====================================================================================================================================================================================//				
		//**************************************************************************************************************************************************//		
						//------------------------------Hardcoding Validation steps------------------------------//---------------------------------------------------// 
		//**************************************************************************************************************************************************//			

		ValidateProdPage validate = new ValidateProdPage(driver);
		String actData = validate.validateProdDetails(driver);
		Assert.assertEquals(actData, ProName);
		System.out.println("Create Product is validated");
	
		//====================================================================================================================================================================================//						

		//-------------------------------Hardcoding "HomePages "WebElement"	for Signout-------------------------------------------------------//
		//====================================================================================================================================================================================//					

						
		
		//**************************************************************************************************************************************************//
		//**************************************************************************************************************************************************//
				

		}
		}
				
						


			
				



