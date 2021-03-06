package Pyra;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
	public static void main(String []args) {
		File pyramidFile= new File("C:\\Users\\MASRAWY\\eclipse-workspace\\Pyramids\\src\\Pyra\\pyramids.csv");
	    List<Pyramid>pyramidlst=new ArrayList<>();
		List<String>lines = new ArrayList<String>();
		try {
			lines=Files.readAllLines(pyramidFile.toPath());
		}catch(Exception e) {
			System.out.println("file not found");
		}
		for(int i=1;i<lines.size();i++) {
			String line=lines.get(i);
			String []fields=line.split(",");
			 for (int i1 =0;i1<fields.length; i1++) {
				 fields[i1]=fields[i1].trim();
				
			}
			 Pyramid p = new Pyramid(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]));
			 pyramidlst.add(p);
		}
		System.out.println("Total Number of pyramids is:"+ pyramidlst.size());
		System.out.println(lines);
		
		}
		
		
	}
	
