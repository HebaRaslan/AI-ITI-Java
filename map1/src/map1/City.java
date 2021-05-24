package map1;

public class City {
	String cityName;
    String continentName;
    double Area;
    int counrtyCode;
    int population;
   
    
    public City(String cityName, int population, double Area, int  counrtyCode,String continentName) {
    	this.cityName=cityName;
        this.continentName=continentName;
        this.Area=Area;
        this.counrtyCode= counrtyCode;
        this.population=population;
	}



public String getCityName() {
return cityName;
}
public void setCityName(String cityName) {
this.cityName = cityName;
}

public String getContinentName() {
return continentName;
}
public void setContinentName(String continentName) {
this.continentName = continentName;
}
public double getArea() {
return Area;
}
public void setArea(double Area) {
this.Area = Area;
}
public int getCounrtyCode() {
return counrtyCode;
}
public void setCounrtyCode(int counrtyCode) {
this.counrtyCode = counrtyCode;
}
public int getPopulation() {
return population;
}
public void setPopulation(int population) {
this.population = population;
}


	

}
