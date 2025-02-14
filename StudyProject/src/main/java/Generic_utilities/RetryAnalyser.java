package Generic_utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class RetryAnalyser implements IRetryAnalyzer {  // this approach of rertyis not implemneted in suites ,its only implemented in classes.Absically here we will be running as musch as times teh failed script. with teh help of if condition.
	 // so after teh above step click onto teh highlighted red line,tehn you will have teh otehr lines printed,so out of those line delete@overide and also delete //aotogenereted line.     

	int count=0;
	int retryLimit=3;
	public boolean retry(ITestResult result) {  //here first we will keep only this line,tehn we will write the int count and int retrylimit above this line.
		
		if(count<retryLimit)  //then with teh help of if condition we will write say if teh count is less than the retrylimit,it will increase teh count and will return the statment true orelse  will return false.
		{
			count++;
			return true;
		}
		
		return false;
	}

}


//so basically this class is all about the listeners method ,so this class "Iretry" method is one of teh Listeners method.
// inwhich we basically intensionally fail teh assertion and run the program so taht we can take the screenshot.
// so previously we learned teh "Listeners method with the suit" and with the help of create campaign class.

// But for this method we will be using exactly teh same method of listeners class but now we will be using create product file.lets see how.
// So after following teh above steps in "RetryAnalyserFile.",we have to open create product file.
// Now in create Product file we have to  implement the above steps,so in create product file we will type Listenersanotation,teh inside teh bracket we have to give the package name.listeners followed by class name and tehn .class we have to mention lets see how
// @listeners(Generic_utilities.Listeners.class) above the classname. tehn follow the methods as below

//@Listeners(Generic_utilities.Listeners.class) // we are using this line or steps to practise Iretrylisteners method.original script is differnt.
//so the next step is to write the retrymethod in "testannotation method". so below in line 27,open teh brackets beside @Test anotation and type as follows (retryAnalyzer = Generic_utilities.RetryImp.class),
//so here i didnt getteh option odf RetryImp so i took this option (retryAnalyzer = Generic_utilities.RetryAnalyser.class.
//And then you save and run the program,you willsee teh assertion has passed,as we didnot fail it intentionally.
//so now we will fail the script intensionally by writing "Assert.fail" below createprodpage line no76. and then save and run the program.
//Now after running the program you will see taht the program re-runs for 4 times and teh report is Total tests run: 4, Passes: 0, Failures: 1, Skips: 0, Retries: 3
//But it will take only 1screenshot ,so to see the screen shot,refresh the "Advanceseelnium folder" go down to testoutput nad in taht see the failedscript.
//it will show you the screenshot picture taken by listeners method.
// it worked well with the other option which i selected.
