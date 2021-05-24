package map1;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvReader {


	public static void main(String[] args) {
		
		File CountryFile=new File("C:\\Users\\MASRAWY\\eclipse-workspace\\map1\\src\\map1\\Countries.csv");
		File CityFile=new File("C:\\Users\\MASRAWY\\eclipse-workspace\\map1\\src\\map1\\Cities.csv");
		
		List<String> CountryLines =new ArrayList<>();
		List<String> CityLines =new ArrayList<>();
		List<Country> Countrylst=new ArrayList<>();
		List<City>Citylst=new ArrayList<>();
		Map<String,List<City>>map =new HashMap<>();
 
		try {
			CountryLines=Files.readAllLines(CountryFile.toPath());
			System.out.println(CountryLines.size());
			CityLines=Files.readAllLines(CityFile.toPath());
			System.out.println(CityLines.size());
		}
		catch (Exception e)
		{
			System.out.println("Can't read");
			return;	
		}
       
		
		for(int i=0;i<CountryLines.size();i++)
        {
        	String line=CountryLines.get(i);
        	String[] splitted =line.split(",");
        	Country mcountry = new Country(splitted[0],Integer.parseInt(splitted[1]));
        	Countrylst.add(mcountry);
        	map.put(splitted[1],new ArrayList<>());
        }
        
		
		for(int i=0;i<CityLines.size();i++)
        {
        	String line=CityLines.get(i);
        	String[] splitted =line.split(",");
        	City mcity=new City(splitted[0],Integer.parseInt(splitted[1]),Double.parseDouble(splitted[2]),Integer.parseInt(splitted[3]),splitted[4]);
        	Citylst.add(mcity);	
			List<City> lst=map.get(splitted[3]);
			lst.add(Citylst.get(i));
			map.put(splitted[3],lst);
        }
		System.out.println("Total Number of country is:"+ Countrylst.size());
		System.out.println(CountryLines);
		System.out.println("Total Number of city is:"+ Citylst.size());
		System.out.println(CityLines);
		System.out.println(map);
		
		
		for(int i=0; i<map.get("1").size();i++) {
			System.out.println(map.get("1").get(i));
			List<City> finallst=sort(map.get("1"));
		}

		
		
		
	
	}
public static  List<City> sort(List<City>Citylst){
	
{
	Citylst.sort(new comp());
	return  Citylst;
}
}
}

	

