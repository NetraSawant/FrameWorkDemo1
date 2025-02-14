package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWith_Integres {  // In order to execute the same Testscripts with different sets of data multiple times is called as DataProvider Annotation.
	// And its return type is 2dObjectarray.
    // So we will first create a method.and will try to give some varaibles liek "src i.e (source) and "dest".
	// DataProvider with Integer Values

@Test(dataProvider ="getData")
public void bookTickets(String src,String dest,int costOfTicket) //dataprovider with integer values
{
System.out.println("Book Tickets from "+src+" to"+ dest+costOfTicket);  //here we are printing a statement
}


@DataProvider
public Object[][] getData()                 // next here we will type (public and call for object and tehn type[][]- these two boxes mean sets of data.nad then write getdata().
{                                           // it will ask you for return type
                                           // then we have to do object creation,and write [2][2] in the bracket,becaz we r givinghere 2 set of data.
Object[][] objArr = new Object[3][3];

objArr[0][0]= "Banglore";               // Now take the refrence varable down "objArr' down
objArr[0][1]= "goa";  
objArr[0][2]= 5000;                    // Now enter the data.Make sure that the integer vakues are not in inverted commas or else will show an error.

objArr[1][0] = "Banglore";               // Now enter the dataagain.
objArr[1][1] ="mumbai";
objArr[1][2]= 10000;  

objArr[2][0] = "Banglore";               // Now enter the dataagain.
objArr[2][1] ="chennai";
objArr[2][2]= 4000;  


return objArr;                             //	//Basically tehre are two differnt sets of data in two different methods
                    // Now we have to connect these two methods together with the help of "data Provider method.Lets see how.
                    // So the second method has teh values of the data of first  method.
                    // so we have to specify data provider in the test annotation,means we have to write @Data ctrl+space and click the method data provider, above teh second method and then we have to write teh method that is"getData" method from second method,copy it and paste it inthe first method as write @() and type data ctrl+space click dataProvider and tehn = copy the method name " getData") inside the bracket. @test(DataProvider="getData)
                    // And then you save the program and run it.

}

}
