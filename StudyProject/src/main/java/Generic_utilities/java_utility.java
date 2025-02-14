package Generic_utilities;

import java.util.Random;

public class java_utility {
	
	/**
	 * This method is used to avoid Duplicate values
	 * @return
	 */
	
	public int getRandomNum()
	{
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		
		return ranNum;
		
	}

//	public int getRandomNum1()
//	{
//		Random ran = new Random();
//		int ranNum = ran.nextInt(1000);
//		return ranNum ;
//	}
	

}
