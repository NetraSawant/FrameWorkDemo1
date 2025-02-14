package TestNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx3_With_TestScript {
	//so basically here we are goingto read the excel data of teh original "createOrganization_1 file",into this DataProvider file,with the help of Dataprovider method.
// Lets see how we are going to do it.
	// So first we will copy the entire testscript of create organization from "createOrganization_1 file", and paste it in this file.

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
		
		
	     
		driver.findElement(By.name("accountname")).sendKeys(name);//dont forget to type .send keysmethod here.
		 driver.findElement(By.id("phone")).sendKeys(phnNum);
	      driver.findElement(By.name("email2")).sendKeys(mailId);  
		
		
		 driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		 Thread.sleep(2000);   // donot forgetthis line orelse will show failure in the report.
		 
		 driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
        driver.findElement(By.linkText("Sign Out")).click();
        driver.quit();
}
        
        
        @DataProvider
        public Object[][] readData()                 // next here we will type (public and call for object and tehn type[][]- these two boxes mean sets of data.nad then write getdata().
        {        

       	 Random ran = new Random();
            int ranNum = ran.nextInt(1000);
            
                                                   // then we have to do object creation,and write [2][2] in the bracket,becaz we r givinghere 2 set of data.
        Object[][] objArr = new Object[3][3];

        objArr[0][0]= "AAA" + ranNum;               // Now take the refrence varable down "objArr' down
        objArr[0][1]= "9820250795";  
        objArr[0][2]= "xyz@gmail.com";                    // Now enter the data.Make sure that the integer vakues are not in inverted commas or else will show an error.

        objArr[1][0] = "BBB"+ ranNum;               // Now enter the dataagain.
        objArr[1][1] ="4036717273";
        objArr[1][2]= "cal@gmail.com";  

        objArr[2][0] = "CCC"+ranNum;               // Now enter the dataagain.
        objArr[2][1] ="5426787878";
        objArr[2][2]= "mum@gmail.com";  


        return objArr;      
        	
          
        }
        } 	
        	
        	
        
        
        
        
	 
		
        
        	
        





