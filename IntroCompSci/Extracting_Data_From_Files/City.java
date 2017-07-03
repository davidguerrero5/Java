package labextracredit;
//David Guerrero
//10/20/2016

public class City {
	String countrycode;
	String city;
	String region;
	int population;
	double latitude;
	double longitude;

	public City(String countrycode, String city, String region, int population, double latitude, double longitude) {
		this.countrycode = countrycode;
		this.city = city;
		this.region = region;
		this.population = population;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String toString() {
		return this.city + "," + this.population + "," + this.latitude + "," + this.longitude;
	}
	
	// all comparison methods are located inside the Reader class! 
	
}
