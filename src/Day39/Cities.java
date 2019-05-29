package Day39;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");

		for (String string : cities) {
			System.out.print(string + " | ");
		}
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");

		}
		System.out.println();
		for (int j = 0; j < cities.size(); j++) {
			cities.set(j, cities.get(j).toUpperCase());

		}
		System.out.println(cities);

		System.out.println(cities.toString().toUpperCase());

		String longest = cities.get(0);
		for (int i = 0; i < cities.size(); i++) {

			if (longest.length() > cities.get(i).length()) {
				longest = cities.get(i);

			}

		}
		System.out.println(longest);

		String shortest = cities.get(0);
		for (int i = 0; i < cities.size(); i++) {

			if (shortest.length() < cities.get(i).length()) {
				shortest = cities.get(i);

			}

		}
		System.out.println(shortest);

		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		citiesMoreThan6.add("Tashkent");
		citiesMoreThan6.add("Urgench");
		citiesMoreThan6.add("Bukhara");
		citiesMoreThan6.add("Samarkand");
		citiesMoreThan6.add("Namangan");
		citiesMoreThan6.add("Fergana");

		for (String ct : cities) {
			if (ct.length() > 6) {
				citiesMoreThan6.add(ct);
			}
		}

		System.out.println(citiesMoreThan6);
		
		

	}

}
