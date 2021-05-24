package Pyra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PyramidRead {
	public static void main(String []args) {
	    try {	
		File pyramidFile= new File("C:\\Users\\MASRAWY\\eclipse-workspace\\Pyramids\\src\\Pyra\\pyramids.csv");
		Scanner myReader=new Scanner(pyramidFile);
		while (myReader.hasNextLine()) {
			String data=myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	    }
	    catch (FileNotFoundException e) {
	    	System.out.println("notfound");
	    	e.printStackTrace();
	    }
	}

}
