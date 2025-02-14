package TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utilities.Excel_utility;
import Generic_utilities.java_utility;


public class DataProviderEx4 {
	
	@Test(dataProvider = "readData")
	public void createOrganization(String name,String phnNum,String mailId) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
		driver.findElement(By.linkText("Organizations")).click();  // It  opens the Organization page. 
		driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();// here inspect teh lookup image
		
		
		java_utility jlib = new java_utility();
		int ranNum = jlib.getRandomNum();
	
	      driver.findElement(By.name("accountname")).sendKeys(name+ranNum);//dont forget to type .send keysmethod here.
		 driver.findElement(By.id("phone")).sendKeys(phnNum);
	      driver.findElement(By.name("email2")).sendKeys(mailId);  
		
		
		 driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		 
		 Thread.sleep(2000);   // donot forgetthis line orelse will show failure in the report.

		 
		 
		 driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
        driver.findElement(By.linkText("Sign Out")).click();
        driver.quit();
}
        
        
        @DataProvider
        public Object[][] readData() throws Throwable                 // next here we will type (public and call for object and tehn type[][]- these two boxes mean sets of data.nad then write getdata().
        {
		Excel_utility elib = new Excel_utility();        // After following teh steps from excel utility file ,you now have to do object creation,save it in refernec variable elib
		Object[][] data = elib.getDataProviderData("DataProvider");  // Agin take the refrence variable elib down and call getdataproviderData and paste teh excel sheet name in it"DataProvider" 
		                                                             // Then again save it in a rerence variable "data"
		                                                             // And lastly changeteh return type tppe to "data". Now save and run the program.
        	
        	return data;        

       	
          
        }
	
}
        	
        	


