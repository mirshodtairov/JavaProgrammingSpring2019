package Day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" } };

		String longest = "";
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " | ");
				longest = countries[i][j];

			}

		}
		for (int x = 0; x < countries.length; x++) {
			System.out.println(countries[x][0] + "|");

		}
		System.out.println();

		String[] cities = new String[9];
		for (int z = 0; z < countries.length; z++) {

			cities[z] = (countries[z][1]);

		}
		System.out.println(Arrays.toString(cities));

		for (int a = 0; a < cities.length; a++) {
			if (countries[a][0].equals("Bolivia")) {
				if (countries[a][1].equals("La Paz")) {
					System.out.println(true);
				} else {
					System.out.println(false);

				}
				break;
			}

		}

	}

}
