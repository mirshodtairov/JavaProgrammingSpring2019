package Day24;

public class minValueArray {

	public static void main(String[] args) {
		String [] cities = {"washington dc", "Kyiv", "Annandale", "moscow", "sitambul", "baku", "miami", "silver Spring"};
		System.out.println(cities.length);
		String citiesWithM="";
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("m")) {
				System.out.println(cities[i]);
				
				
			}
			
		}
		for(String city: cities) {
			if (city.startsWith("m")) {
				System.out.println(city);
			}
		}

	}

}
