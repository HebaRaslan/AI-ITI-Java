package map1;

import java.util.Comparator;

public class comp implements Comparator<City>{
	
	public int compare(City c1,City c2) {
		return c1.getPopulation().compareTo(c2.getPopulation());
	}
}
