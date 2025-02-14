package Generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_utility {
	
	/**
	 * This method is used to read data from properties_file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	public String getKeyAndValuePair(String key) throws Throwable
	{
		//FileInputStream fis = new FileInputStream("./src/test/resources/file.properties.txt");
		FileInputStream fis = new FileInputStream(IpathConstant.filePath);// Now lets see if it reads the data by using teh above "path" method
                                                                         // So first go to "IpathConstant" file in geenric utility
    	                                                                 // Follow all the instruction and then come back to this "File_utility file and follow the below steps.
                                                                         // Select the source code and copy it and paste the source down
                                                                        // then type (IpathConstant.filePath)
                                                                       // Now lets see if it reads the data by using teh above "path" method by opening nay  program file and running it.
                                                                   	// It runs successfully.

	

		Properties pro = new Properties(); // with the help of this method we can read the data from propertiesclass.
		
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
		
	}

}


// so what we did is we created file_utility class first,tehn we made sure taht the "properties file" link is changed from local disc to class file.
//so tha incase if we furthur delete teh path we still have it in the "project file".
// Then we will also make sure that teh"random class" what we created while writing the testscript includes this(String OrgName = cell.getStringCellValue()+ranNum;)under[D] method of create organization class.
// If you donot make those changes will show an error.Now save and run the program,it should run successfuly.
// Then you copy from line FileInputStream to pro.load(fis) from "create organization file" and paste is above in "file_utility."
//Then make sure you make the above changes like inline 16,change it to "key and value".then change the method statemnt from " void to String"
// It will ask for return value,then type "value" in it.
// Now save this file and go back to "organization file and now call for "file_utility". To  convert into Generic method
// once you get inside file_utility file make sure you "deselect the lines from file inputstream to String PASSWORD = pro.getProperty("password");".