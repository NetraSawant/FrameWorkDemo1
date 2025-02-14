package Campaign_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.BaseClass;
import Generic_utilities.Excel_utility;
import Generic_utilities.File_utility;
import Generic_utilities.WebDriver_Utility;
import Generic_utilities.java_utility;
import ObjectRepository.CampLookUpImgPage;
import ObjectRepository.CreateCampPage;
import ObjectRepository.CreateOrgPage;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrgLookUpImgPage;
import ObjectRepository.ProdLookUpImgPage;
import ObjectRepository.SwitchingWindow;
import ObjectRepository.ValidateCampPage;
import ObjectRepository.ValidateOrgPage;
import ObjectRepository.ValidateProdPageWithCampaign;

public class CreateCampaign_withProduct3Test extends BaseClass {
	
@Test(groups="smokeTest")
	 public void createCampaign_withProduct3Test()throws Throwable {
			

					
			
	                WebDriver_Utility wlib = new WebDriver_Utility();
					HomePage home = new HomePage(driver);
					home.clickProLink();


	//----------------------------------Implementing Getter Method----------------------------------------------------------//

//**************************************************************************************************************************************************//	
//====================================================================================================================================================================================//					
			    	// Hardcoding "ProductLookUpImgPage "WebElement"	"LookUpImage"
					
					//All steps are same as "hardcoding of HomePage WebElement".But we have to craete a new File called "ProdLookUpImgPage" in "Object Repository"
//====================================================================================================================================================================================//					
				// step[1]:- Create a new file called  "ProdLookUpImgPage" in "Object Repository" package.
				// step[2]:- So in that file ,follow the steps exactly as we did normally in "home page".
				// step[3]:- Then come back to teh testscript file and seelct teh line.	
				// step[3]:- Then type new prodLookUpImgPage(driver) and do its object creation and save it in a variable called"img".
				// step[3]:- paste teh variable down and type clickProdLookUp().
				// step[3]:- Now save and run the program.
										
					//	driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
			  		ProdLookUpImgPage img = new ProdLookUpImgPage(driver);
			  		img.clickProdLookUp();	
					
					
					
	  
//**************************************************************************************************************************************************//	
	        //-----------------------Successfully Navigated to First product page. -------------------------------------------------------------//
//**************************************************************************************************************************************************//	
//**************************************************************************************************************************************************//		
//[3]:-------------------------------- Calling Random Class-------------------------------------------------------------//	
//**************************************************************************************************************************************************//	  		
	  	//--------STAGE2:--------[A]:- We will first Hardcode the "Random Class" Method with the help of Java_Utility File.---------------------------------------------//
		      
			
           	//  ----------------------[i]:-  After HARDCODING to GENERIC,we will call the " Java_utility file", in this Testscript file----------------------------//
           //------------------------[ii]:- First Select the method.
          //-------------------------[iii]:- Then type new java_utility().Then save it in refrence variable "jlib"
         //--------------------------[iv]:- Then copy the refrence variable "jlib" and paste it down,now call (.getRandomNum() method) nad save it in refrence varibale "ranNum"
        //---------------------------[vii]:- Now save and run the program.     


 //   Random ran = new Random();
 //   int ranNum = ran.nextInt(1000);


java_utility jlib = new java_utility();
int ranNum = jlib.getRandomNum();

//**************************************************************************************************************************************************//	
//-----------------------Successfully called the Random class. -------------------------------------------------------------//
//**************************************************************************************************************************************************//	 		
//**************************************************************************************************************************************************//	
//---------------Sucessfully Hardcoded the Random class to Generic  and also successfully called it.--------------------------//
//**************************************************************************************************************************************************//	

			
//**************************************************************************************************************************************************//			  		
			

	             
	        
//[4]:- Reading Data from Excel sheet and not Saving it.	
	              
	            //----------(a) First we copied teh following steps from the previous create productfile.
	      		             

//====================================================================================================================================================================================//						
//**********************************************************************************************************************************************************************************************************************************************//		
	
//-----------------------[C]:- We will Then Hardcode the "Data Validation" Method with the help of Excel_Utility File.------------------------------------------//		
           
                           	// [a]:- So we will first select all the rows and then call the "Excel_utility File
                            // [b]:-  So here first type new excel_utility,the save in variable called "elib"
                           // [c]:-Then again take the variable elib down and call for "getExcelData" and tehn paste the (Campaigname,0,0) nad then here we will concatinate the random class variable "+ranNum".
                      // [d]:-then save it in the above variable"CampName" and its returntype is string.
                     //  [e]:- Now save and run the program.



	//          FileInputStream fis2 = new FileInputStream("./src/test/resources/Grocery.xlsx");
	        
	//          Workbook book1 = WorkbookFactory.create(fis2);
	//          Sheet sheet1 = book1.getSheet("Product");
	//          Row row1 = sheet1.getRow(0);
	//          Cell cell1 = row1.getCell(0);
	//          String ProName = cell1.getStringCellValue()+ranNum;
	//          System.out.println(ProName);

Excel_utility elib = new Excel_utility();
	String ProName = elib.getExcelData("Product", 0, 0)+ranNum;
	//--------------------------------------------------------------------------------------------------------------------------------------//  		
  	//-----------------------------------------------------// Hardcoding "CreateProduct detail page" with "CreateProdPage" Repository file---------------------------------------------------------------------------------//    		
//--------------------------------------------------------------------------------------------------------------------------------------//   
  	  		//---Step1:- [a]:- First select all the three lines.
  	  	        //---Step1:- [b]:- Then we will optimize all the three lines in one line,which is below all the lines. 	
  	         	//---Step1:- [c]:- Then we will call the CraeteOrgPage file from Repository. 
  	        	//---Step1:- [d]:- so type new CreateOrgPage(driver),tehn save it in avariable called"page".
  	        	//---Step1:- [E]:- Take the variable down and call for enterOrgPagedetails method".
  	        	//---Step1:- [F]:- Now its time to select the "SAVE" method line.
  	  	 	    //---Step1:- [g]:- so now go back to Repository file and follow exactly same steps for "save method, do its bussiness logic method.	
  	        	//---Step1:- [h]:- So now call the CreateorgPAge file from repository for " save method".see how
  	  	       //---Step1:- [i]:-so just type "	page.clickSaveButton();" and save and run the program.
  	  //---------------------------------------------------------x-----------------------------------------------------------------------------//   	
  	  		
	          
	          
	          
	          
	     //     driver.findElement(By.name("productname")).sendKeys(ProName);
	CreateProductPage prodPage = new CreateProductPage(driver);    // so this is a window switching page hence"prdpage' is the refernec variablle given.
	prodPage.enterProdName(ProName, ProName);    //USERNAME,
	prodPage.clickSaveButton(); 
	   		    
	 //     driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	
	          
	          
	    
			

			
			
//**************************************************************************************************************************************************//	
//[5]:- -----------  Now the next step	is to successfully click the"Campaign element" of the Application. And also successfully navigate to its other pages.//	
	       
	          //----------------------------------------[a]:-Inspecting "More Element" to get through "Campaign" Element"/ Save and Run-----------------------------------------------------------------------------------------//
	  		//----------------------------------------[b]:-Inspecting "C"Campaign" Elementampaign" Element" /Save and Run-----------------------------------------------------------------------------//
	        //----------------------------------------[c]:-Inspecting "lookup image /Save and Run-----------------------------------------------------------------------------//
//--------------------------------------------------------x-----------------------------------------------------------------------------------------//		  		
//====================================================================================================================================================================================//					
	       // Hardcoding "HomePages "WebElement"	
//====================================================================================================================================================================================//					
	       		
	       		//--------[A]:- So after generating "getter" method in " HomePage",we will call it from this file.Lets see how.fOR REFRENCE SEE "HOMEPAGE IN "OBJECT REPOSITORY".
	       		//--------[B]:- Then we will keep the rest below lines in comment.
	       		//--------[C]:- So we will do teh objectcreation by typing "new and call "HomePage(driver),tehn we will save it in a refrence variable called"home".
	       		//--------[D]:- Then take teh sme refrence variable down and call clickMoreLink() method.
	       		//--------[E]:- Then take teh sme refrence variable down and call clickCampLink() method.		
	       		//--------[F]:- Now save and run the Program.		
	       	   // --------[G]:-Here we implemented teh getter method,but the no of lines are more than teh actual text script,hence we have to optimize it,so we will be using "bussiness logic method" in "Loginpage".	
//----------------------------------Implementing Getter Method----------------------------------------------------------//
	     
	         // driver.findElement(By.linkText("More")).click();     
			//  driver.findElement(By.linkText("Campaigns")).click();   // It  opens teh campaign page.
			
	  		HomePage home1 = new HomePage(driver);
	  		home1.clickMoreLink();
	  		home1.clickCampLink();
	  		
	  //----------------------------------Implementing BussinessLogic Method-------not needed here as taken care with getter method---------------------------------------------------//		
	  		
//************************************************************************************************************************************************//	
//************************************************************************************************************************************************//	
//====================================================================================================================================================================================//					
	  	    	// Hardcoding "CampaignLookUpImgPage "WebElement"	"LookUpImage"
	  			
	  			//All steps are same as "hardcoding of HomePage WebElement".But we have to craete a new File called "CampLookUpImgPage" in "Object Repository"
//====================================================================================================================================================================================//					
	  		// step[1]:- Create a new file called  "CampLookUpImgPage" in "Object Repository" package.
	  		// step[2]:- So in that file ,follow the steps exactly as we did normally in "home page".
	  		// step[3]:- Then come back to teh testscript file and seelct teh line.	
	  		// step[3]:- Then type new campLookUpImgPage(driver) and do its object creation and save it in a variable called"img".
	  		// step[3]:- paste teh variable down and type clickCampLookUp().
	  		// step[3]:- Now save and run the program.
	  			
	  			
	  	//	driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
	  		
	  			CampLookUpImgPage img1 = new CampLookUpImgPage(driver);
	  			img1.clickCampLookUp();
	  			
//====================================================================================================================================================================================//					
		  		
//**************************************************************************************************************************************************//	
//**************************************************************************************************************************************************//	
	  							// So far we have sucessfully navigated to the Campaign page. 	
//**************************************************************************************************************************************************//	
//**********************************************************************************************************************************************************************************************************************************************//		
//	  			[6]:- Reading Data from Excel sheet and Saving it.	
	  						
	  						//----------(a) First we copied teh steps from create Campaighn class.
	  						//----------(b) read the data from excel and save it.
	  						
//**********************************************************************************************************************************************************************************************************************************************//		
	  						
	  				//-----------------------[C]:- We will Then Hardcode the "Data Validation" Method with the help of Excel_Utility File.------------------------------------------//		
//**********************************************************************************************************************************************************************************************************************************************//					               
	  						                           	// [a]:- So we will first select all the rows and then call the "Excel_utility File
	  						                            // [b]:-  So here first type new excel_utility,the save in variable called "elib"
	  						                           // [c]:-Then again take the variable elib down and call for "getExcelData" and tehn paste the (Campaigname,0,0) nad then here we will concatinate the random class variable "+ranNum".
	  					                          // [d]:-then save it in the above variable"CampName" and its returntype is string.
	  					                         //  [e]:- Now save and run the program.
	  										
	  							
	  						                    
	  						            //      FileInputStream fis1 = new FileInputStream("./src/test/resources/Grocery.xlsx");
	  						                
	  						            //      Workbook book = WorkbookFactory.create(fis1);
	  						            //      Sheet sheet = book.getSheet("Campaigns");
	  						            //      Row row = sheet.getRow(0);
	  						            //      Cell cell = row.getCell(0);
	  						            //      String CampName = cell.getStringCellValue();
	  						            //      System.out.println(CampName);
	  						

	  						Excel_utility elib1 = new Excel_utility();
	  							String CampName = elib1.getExcelData("Campaigns", 0, 0)+ranNum;
	  						
	  						                  
//--------------------------------------------------x------------------------------------------------------------------------//	       
// Hardcoding of only "campaign name" as later teh process is of window switching method.	  					
//------------------------------------------------x---------------------------------------------------------------------------------------------//		  						                  
	  						                 CreateCampPage campPage = new CreateCampPage(driver);
	  						               campPage.enterCampDetails(CampName);
	  						                  
	  						          		//driver.findElement(By.name("campaignname")).sendKeys(CampName);  // here inspect the campaignname field
//--------------------------------------------------x------------------------------------------------------------------------//	       
//------------------------------------------------x---------------------------------------------------------------------------------------------//	              		  						    		  					  			       	
							//Hardcoding of window switching starts from here.  
	  						           // So for refernec see in " switchingWindow" repository file.    
//-------------------------------------------------x---------------------------------------------------------------------------------------------//				  							  			
	  							  	//   driver.findElement(By.xpath("//img[@alt=\"Select\"]")).click(); // here while saving you will notice it open the "vendors page.
	  					                                                                                // so we ghave to switch to the "product page"
	  					                                                                               // Hence we will handle the windows with the help of "IF Condition methods.
	  							  		
	  							  		
	  							  			
//====================================================================================================================================================================================//							  							  		
//-------------------------------------------------x---------------------------------------------------------------------------------------------//		  							  			
	  							  			
	  								         
	  							  		//[7]: Switching Windows and navigating to the "PRODUCT Page and Not Vendors Page.
	  							  							            
	  							  							           Set<String> allwin = driver.getWindowHandles();
	  							  							     		Iterator<String> it = allwin.iterator();
	  							  							     		
	  							  							     		while (it.hasNext())    // so basically we have to iterate or handle one afterthe other window,till we reach the expected window.
	  							  							     		{
	  							  							     			
	  							  							     			String win = it.next();  // so we will put it in a variable.
	  							  							     			driver.switchTo().window(win);     // so we will tell the driver to switch to the required window.
	  							  							     			if (win.contains("products&action"))  // so with the helpof if condition and win.contains we will copy the partial link text of the "product page i.e"url" of that page.
	  							  							     			{                                     // and then enter into the loop nad brek the loop.
	  							  							     				break;                            // this is teh standard way of handling the multiple windows we  is more often use in real time.
	  							  							     			}

	  							  							     		}
//------------------------------------------------------------------x------------------------------------------------------------------------------//
	  							  							     		SwitchingWindow windowSwitch = new SwitchingWindow(driver); //so here basically we have called all the lines one after teh other.
	  							  							         	windowSwitch.clickPrdPlus();
	  							  							         	wlib.windowSwitching(driver, "products&action");// so we tried to run the program,without this line ,and we could not run asit would get stuck up ,where we are not able to print the particular item name in the search bar.so we figured out that teh window has not been switched
	  							  							                                                        	// so we have to select the line number426,which w forgot to,then we have to add the switching method above which is (wlib.windowSwitching(driver,"products&action").because we are switching from that window to teh next window.
	  							  							            windowSwitch.enterPrdName(ProName);
	  							  						            	windowSwitch.searchprdName();
	  							  					                	windowSwitch.dynamicPath(driver, ProName);
	  							  							             
	  							  		//            driver.findElement(By.id("search_txt")).sendKeys(ProName);  // very important ,make sure you are using"id("search_txt")only ,caz or else it will not print the product name in search bar,and you get stuckup there itself.
	  							  							         			             
//--------------------------------------------------x----------------------------------------------------------------------------------------------//	 
	  	//-------------------It will successfuly take you to the product page wher teh particular product is shown-------------------------//------------------------------------------------------------//	 
//--------------------------------------------------x----------------------------------------------------------------------------------------------//	 		              

	  							  		//[8]:-Inspecting the particular " Generated product" And then using Dynamic XPATH.		             
	  							  							             
	  							  							             
	  							  							          //   driver.findElement(By.name("search")).click();  //here inspect the product generated.
	  							  							             
	  							  						//driver.findElement(By.xpath("//a[text()='Milk566']")).click();  //here inspect the search field.but evry single time it will generate anew product,so we cannot use same path again.
	  							  						                                                                // hence now we have to use DYNAMIC XPATH.
	  							  						                                                               // SO NOW WE WILL DESELECT THE ABOVE PATH AND THEN WRITE THE DYNAMIC XPATH.LETS SEE HOW.
	  							  					     // SO IN THE ABOVE PATH YOU WILL SEE ONLY "MILK566" IS DYNAMIC MEANS WILL BE CHANGING ALL THE TIME.
	  							  						// SO NOW INSTEAD OF PASSING THE DATA DIRECTLY WE WILL BE CONCATINATING THE DATA FROM EXCEL SHEET,BY FIRST TYPING DOUBLE INVERTED COMMAS,THEN ++ SIGN,THEN COPY THE REFRENCE VARIABLR: "ProName" and paste it between the two plus signs.
	  							  						//Now save and run the program.
	  							  						
	  							  					//	driver.findElement(By.xpath("//a[text()='"+ProName+"']")).click();    // now save and run the program  
	  							  						
	  							  		//[9]: Again Switching from child window to Parent window.:- Make sure you are making the minor changes	.Then run teh program and then inspect save	button.
	  							  						
	  							  						
	  							  						Set<String> allwin1 = driver.getWindowHandles();
	  							  				 		Iterator<String> it1 = allwin1.iterator();
	  							  				 		
	  							  				 		while (it1.hasNext())    // so basically we have to iterate or handle one afterthe other window,till we reach the expected window.
	  							  				 		{
	  							  				 			
	  							  				 			String win1 = it1.next();  // so we will put it in a variable.
	  							  				 			driver.switchTo().window(win1);     // so we will tell the driver to switch to the required window.
	  							  				 			if (win1.contains("Campaigns&action"))  // so with the helpof if condition and win.contains we will copy the partial link text of the "product page i.e"url" of that page.
	  							  				 			{                                     // and then enter into the loop nad brek the loop.
	  							  				 				break;                            // this is teh standard way of handling the multiple windows we  is more often use in real time.
	  							  				 			}

	  							  				 		}
	  							  				     
//-------------------------------------------------x---------------------------------------------------------------------------------------------//							
	  		// The below line is basiccaly from campaign file,we switched to campaign file,
	  		// Hence we will have to go to createCampPage from repository file and write it there for "Save" method and then call from there.
	  		// When we wentto teh file we saw that teh save method is already wriiten ,hence we will directly go the testscript nad call from there.
	  		// so select the line first and tehn call.					  				 		
	  							  				 		
	  							  				 		
	  							  				 	//	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click(); // now here we will inspect teh save button,but the save buttonis not clicked,lets see why.
	  							  					                                                                          	//becaz,the driver is still focused on child window,it needs to be switched to parent window ,hence we will be writting switch method again.
	  							  						                                                                       //And paste it below the dynamic xpath. in the above method.but make sure you are making the minor changes.
	  							  					                                                                        	//Now save and run the program,it should click the save button now.
	  							  	campPage.clickSaveButton();			 		
	  							  				 		
	  							  			  			
//====================================================================================================================================================================================//						  		
	  							//========$$$$$$$$$$$$$$$$$$$$$$$$$======================$$$$$$$$$$$$$$$$$$$$$$$$$$$$$==============================$$$$$$$$$$$$$$$$$$$$$$$$$===============//
	  								//-----------------------------------------------------// Hardcoding "CreateOrganization detail page" with "CreateOrgPage" Repository file---------------------------------------------------------------------------------//    		
	  								            //---Step1:- [a]:- First select all the  line.
	  								  	        //---Step1:- [b]:- Then we will optimize all the  line ,which is below  the line. 	
	  								         	//---Step1:- [c]:- Then we will call the CraeteCampPage file from Repository. 
	  								        	//---Step1:- [d]:- so type new CreateCampPage(driver),tehn save it in avariable called"page".
	  								        	//---Step1:- [E]:- Take the variable down and call for enterCampPagedetails method".
	  								        	//---Step1:- [F]:- Now its time to select the "SAVE" method line.
	  								  	 	    //---Step1:- [g]:- so now go back to Repository file and follow exactly same steps for "save method, do its bussiness logic method.	
	  								        	//---Step1:- [h]:- So now call the CreatecampPage file from repository for " save method".see how
	  								  	       //---Step1:- [i]:-so just type "	page.clickSaveButton();" and save and run the program.
	  		  //---------------------------------------------------------x-----------------------------------------------------------------------------//   	
	  												  						     
	  		// [10]---------------------------------------LAST STEP-----FINAL VALIDATION OF THE DATA--------------------------------------------------------//
	  							  				 		
	  							  				 		// Here we have to validate both "campaign name" and " product name". its a must.
	  							  	
	  							  	
	  							  				 		
	  							  				// 		String actCampData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText(); //here inspect the campaign name.
	  							  			   //		if(actCampData.contains(CampName))
	  							  				// 		{
	  							  				 //			System.out.println("Campaign Name is created");
	  							  				 //		}
	  							  				 //		else
	  							  				 //		{
	  							  				 //			System.out.println("Campaign Name is not created");
	  							  				 //		}
	  							  	
	  							ValidateCampPage validateCamp = new ValidateCampPage(driver);
	  							String actData = validateCamp.validateCampDetails(driver); 						
	  							
	  							Assert.assertEquals(actData, CampName);
	  						    System.out.println("Camp is validated");
	  							
	  							  				 		
//---------------------------------------------------------------------------------------------------------------------------------------//		            
	  							  						              
	  							  						   //     String actProName = driver.findElement(By.xpath("//span[@id=\"dtlview_Product\"]")).getText();   // here inspect "product" and also make sure you are copying thr right path.      
	  							  						   //     if(actProName.contains(ProName))
	  							  						 //		{
	  							  						 //			System.out.println("Product Name is created");
	  							  						 //		}
	  							  						// 		else
	  							  						// 		{
	  							  						 //			System.out.println("Product Name is not created");
	  							  						 //		}
	  							  						        
	  							ValidateProdPageWithCampaign prdValidate = new ValidateProdPageWithCampaign(driver);
	  						String actData1 = prdValidate.validateProd(driver, ProName);
	  							
	  							Assert.assertEquals(actData1, ProName);
	  							System.out.println("Create Product is validated");
	  							
	  							
//========$$$$$$$$$$$$$$$$$$$$$$$$$======================$$$$$$$$$$$$$$$$$$$$$$$$$$$$$==============================$$$$$$$$$$$$$$$$$$$$$$$$$===============//		  							
//-----------------------------------------------------x----------------------------------------------------------------------------------------//				        
	  	                                //[11]:- Signout Procedure:-
//====================================================================================================================================================================================//					
	  		///-------------------------------Hardcoding "HomePages "WebElement"	for Signout-------------------------------------------------------//
//====================================================================================================================================================================================//					

	  							  						             //--------[A]:- So after generating "getter" method in " HomePage",we will call it from this file.Lets see how.fOR REFRENCE SEE "HOMEPAGE IN "OBJECT REPOSITORY".
	  							  						            //--------[B]:- Then we will keep the rest below lines in comment.
	  							  						           //--------[C]:- So we will type directly "home.logOut();.		 			
	  							  						          //--------[E]:- Now save and run the Program.		
	  							  						         // --------[F]:-Here we implemented teh getter method,but the no of lines are more than teh actual text script,hence we have to optimize it,so we will be using "bussiness logic method" in "Loginpage".			              

	  							  						       					        
	  							  						        
	  							  						      //  driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
	  							  					          //    driver.findElement(By.linkText("Sign Out")).click();  //it has sucessfully  created n signout.
	  							  						        
	  							  						     
	  							  					            	
//**************************************************************************************************************************************************//	
	  				        //---------------Sucessfuly Signout--------------------------//	
//**************************************************************************************************************************************************//	


	  							
//====================================================================================================================================================================================//							
	  								//Organization Testscript pasted below for TestNg Execution - Regional Regression Testing.
//====================================================================================================================================================================================//							
	  								
	}	//dont forget to close the above testscript with this bracket,orelse will show an error

	  								
	  								
	  						//		@Test(groups={"regressionTest","smokeTest"})
	  								public void Create_Organization4Test() throws Throwable {
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
	  											home.clickOrgLink();
	  									//====================================================================================================================================================================================//				
	  									//**************************************************************************************************************************************************//		
	  										
	  											//------------------------Hardcoding OrganizationLookUpImage---------------------------------------------------------------------------------//    		
	  									//**************************************************************************************************************************************************//
	  											OrgLookUpImgPage img = new OrgLookUpImgPage(driver);
	  											img.clickOrgLookUp();
	  									//====================================================================================================================================================================================//			
	  									//**************************************************************************************************************************************************//		
	  											//------------------------Hardcoding the Random class---------------------------------------------------------------------------------//    		
	  									//**************************************************************************************************************************************************//			
	  									   //     java_utility jlib = new java_utility();
	  										    int ranNum = jlib.getRandomNum();				
	  									//====================================================================================================================================================================================//								
	  									//**************************************************************************************************************************************************//	

	  											//------------------------Hardcoding the "Data Validation" Method with the help of Excel_Utility File.---------------------------------------------------------------------------------//    		
	  									//**************************************************************************************************************************************************//			
	  										  //  Excel_utility elib = new Excel_utility();
	  									  		String OrgName = elib.getExcelData("Organization", 0, 0)+ranNum;	
	  									//**************************************************************************************************************************************************//		
	  									  			//-----------------------Hardcoding the "Data Validation" Method with the help of Excel_UtilityDataFormatter File.--------------------------------------------------------------------------------//    		
	  									//**************************************************************************************************************************************************//			

	  									  	   	String PhNum = elib.readExcelDataUsingFormatter("Organization", 1, 0); 
	  									  	  	String email = elib.readExcelDataUsingFormatter("Organization", 2, 0);   
	  									//====================================================================================================================================================================================//								
	  									//**************************************************************************************************************************************************//	
	  									  	//------------------------Hardcoding "CreateOrganization detail page" with "CreateOrgPage" Repository file---------------------------------------------------------------------------------//    		 		
	  									 			
	  									//**************************************************************************************************************************************************//			
	  									  	  CreateOrgPage page = new CreateOrgPage(driver);
	  									    	page.enterOrgDetails(OrgName, PhNum, email);
	  									    	page.clickSaveButton();  
	  									//====================================================================================================================================================================================//								
	  									//**************************************************************************************************************************************************//	
	  											//------------------------------Hardcoding Validation steps------------------------------//---------------------------------------------------// 
	  									//**************************************************************************************************************************************************//			
	  									    	ValidateOrgPage validate = new ValidateOrgPage(driver);
	  									      	validate.validateOrgDetails(driver);	     	
	  									//====================================================================================================================================================================================//								
	  									//**************************************************************************************************************************************************//	
	  									      		//------------------------------Hardcoding Validation steps------------------------------//---------------------------------------------------// 
	  									//**************************************************************************************************************************************************//			
	  									      
	  								
	  							
	  								
	  							

	  						
//**************************************************************************************************************************************************//				
//**************************************************************************************************************************************************//				
	  								

}
}


	  							  			
	  							  			
	  		
	  					  		   		  		
	  			
	  			
	  			
	  			
   
	          
	          
	         
			
			

			           


