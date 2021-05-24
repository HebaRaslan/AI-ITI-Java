package map1;

public class Country {
	    String countryName;
	    int countryCode;
		 
	
	public Country(String countryName, int countryCode) {
			this.countryCode=countryCode;
			this.countryName=countryName;
		}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

}

