package Project2;

import java.io.File;
import java.util.Scanner;

public class LoadArray {
	//Class will load array. You need to pass through an array and filename.txt for class to work
	public static String[] loadedArray(String[] arrayToLoad, String filename) throws Exception 
	{	
		int index = 0;	
		File fileRet = new File(filename);
		Scanner scan = new Scanner(fileRet);
		
		while(scan.hasNext())
		{
			arrayToLoad[index] = scan.nextLine();
			index++;
		}
		
		scan.close();
		return arrayToLoad;
	}//end of method
}
