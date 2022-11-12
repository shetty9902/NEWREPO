package Frames_2;

import org.testng.annotations.DataProvider;

public class Dataprovider
{
	@DataProvider(name ="cred")
	public static String[][] data()
	{
	String arr[][]= {{"vade","123456789"}};
	 return arr;
	
	}

}
