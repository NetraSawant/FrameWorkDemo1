package Generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class Excel_utility {
	
	/**
	 * This method is used to read data from ExcelSheet.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable 
	 * @throws Throwable
	 */
	
	
	
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable 
	{
	//	FileInputStream fis1 = new FileInputStream("./src/test/resources/asha.xlsx"); 
		FileInputStream fis1 = new FileInputStream(IpathConstant.excelPath);// Now lets see if it reads the data by using teh above "path" method
		                                                                    // So first go to "IpathConstant" file in geenric utility
	                                                                    	// Follow all the instruction and then come back to this "Excel_utility file and follow the below steps.
		                                                                    // Select the source code and copy it and paste the source down
		                                                                    // then type (IpathConstant.excelPath)
		                                                                   // Now lets see if it reads the data by using teh above "path" method by opening nay  program file and running it.
	                                                                    	// It runs successfully.
		
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);		
		String excelData = cell.getStringCellValue(); 
		System.out.println(excelData);
		return excelData;
	}
	
	
	
	public String readExcelDataUsingFormatter(String sheetName,int rowNum,int cellNum) throws Throwable
	{
	
	FileInputStream fis1 = new FileInputStream("./src/test/resources/asha.xlsx"); 
	
	
	Workbook book = WorkbookFactory.create(fis1);
	Sheet sheet = book.getSheet(sheetName);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);	
	
	DataFormatter format = new DataFormatter(); 	
	String ExcelData = format.formatCellValue(cell);
	System.out.println(ExcelData);
	return ExcelData;
	
	}
	
//----------------next method of reading the excel data drom the dataProvider method.-------------------------------------------------//
	
	//--[A]: so we first wrote the method statement as "public string getDataProviderData().
	//--[B]:- Then we copied the ;ines till sheetname from above and pasted down.
	//--[C]:- Then we wrote teh variable name in the bracket as"String and copied teh variable as "sheetname from below"
	//--[D]:- Then we gave its return type by putting the cursor on the red line near the  Method statement line.
	//--[E]:- Then we will throw the declaration statement to throwable.you will notice all the red lines or the errors have gone.
	//--[F]:- So after following all the above steps you will see that it will anvigate to the sheet.Now we have to read it,but there are mutliple rows and coloumns in that excel sheet"asha excel sheet and taht dataproviderdata sheet"
	//--[G :- So now we first have to figure out teh the last row and last cell of that sheet first,so that our,reading of data becomes easy.
	//--[H]:- So now to get the last row number we have to call the direct method with th ehelp of refernec variable "sheet',see below.
	//--[I]:- Now store it  in a variable as "LastRow"
	//--[J]:- So now in that sheet we also need the last cell number,hence we will again copy the refernce variable "sheet" nad paste it down.
	//--[K]:- And then we will call for "getRow(0again".type getlastCellNum();) nad store it in a variable called LastCell.
	//--[L]:- After that we have to do object creation of "2dArray". And store it in a refrence variable.
	//--[M]:- After doing teh object creationmake sure you are copying the above refernece avriable"lastrow and lastcell" nad pasting it in the brackets.
	//--[N]:- Now We will take a "for iterator Loop" for last row
	//--[O]:- Here you have to copy teh refrence variable "LastRow" and paste it in place of "obj.lenght"
	//--[P]:- Now we have to take another "For iterator Loop" for last cell
	//--[Q]:- Now here you have to copy teh refrence variable "LastRow" and paste it in place of "obj.lenght"
	//--[R]:- Now here you need to again take the reference avriable sheet down and call for"getrow method and click for (i) tehn again call getcell method and click(j) and tehn again call toString() method.
	//--[S]:- Now Save it in a refernec variable of "i and j".
	//--[T]:- And then change the return type from sheetname to"obj".
	//--[U]:- Now save and go back to teh testscript of "DataProviderEx4".
	
	
	
	public Object[][] getDataProviderData(String sheetName) throws Throwable
	{
		FileInputStream fis1 = new FileInputStream("./src/test/resources/asha.xlsx"); 
		
		
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		
		int lastRow = sheet.getLastRowNum()+1;
		short LastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow][LastCell];  //After doing teh object creationmake sure you are copying the above refernece avriable"lastrow and lastcell" nad pasting it in the brackets.
		for (int i = 0; i < lastRow; i++)                // here you have to copy teh refrence variable "LastRow" and paste it in place of "obj.lenght"
		{ 
		for (int j = 0; j < LastCell; j++)                // here you have to copy teh refrence variable "LastCell" and paste it in place of "obj.lenght"
		{            
			obj[i][j]=sheet.getRow(i).getCell(j).toString();       // now here you need to again take the reference avriable sheet down and call for"getrow method and click for (i) tehn again call getcell method and click(j) and tehn again call toString() method.
		}	
			
		}
		
		
		return obj;
		
		
	}
}
	
	
//So here we are trying to Optimize the data fetched from excel sheet.
//Hence we will create a file called "Excel_utility" in generic_utilities package.
//Then we will  type the method statment as [public String getExcelData()]
//Then we will copy and paste lines from [FileInputStream fis1 = new FileInputStream("./src/test/resources/asha.xlsx") to line System.out.println(CampName)] from "createCAmpaign1 file."
//Then we will delete(+ranNum),then it will show as throw declaration ,so do the declaration to throwable.
//Now keep yur cursor to the highlighted line in the method statment.It will ask to return the value,so click to "add return statement"
//It will pass the return statement down with the variable "CampName".
//So now if you see in every testscript teh sheet,row nad cell names are differnt,so in that case we will call it from the "method statement" by creating variables in it.
//So we will delete the "campaigns" from the sheet and then in the method statement inside the bracket we will teh variables as "String sheetName,int rowNum,int cellNum".
//Then copy the variable - sheetName and paste in place of Campaigns. make sure you are not putting the inverted commas for sheetname,or else the program will not run.
//Then copy the variable "rowNum and paste in place of "0".
//Then copy the variable "cellNum" and paste in place of "0".
//Then in line "String cell value" we will write "exceldata" in place of"CampName"
////Then in line "printing statment line" we will write "exceldata" in place of"CampName"
////Then in line "return value line" we will write "exceldata" in place of"CampName".
//Now copy the above program and save it.
//Then go to the "CreateCampaign1 file" an damake sure you delect teh rows first of the test script.
//Then you start calling the "excel_utility file".
	
	
	
	
	






