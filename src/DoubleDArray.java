
public class DoubleDArray {

	public static void main(String[] args) {
		int arr[][] = { { 32, 34, 6,6, 65 }, { 23, 731, 359, 6, 6 } };

		int matches = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				if (arr[i][j] == arr[i][j + 1]) {
					matches++;
				}

			}
			System.out.println(matches);
			System.out.println();
		}

		// System.out.println(arr[0][2]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].length);
		}

		String[][] cars = { { "Honda", "toyota", "mazda", "nissan" }, { "mazeratti", "ferarri", "aston martin" },
				{ "Jiguli", "moskvich", "Vaz" } };
		String longestWord = "";
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				if (cars[i][j].length() > longestWord.length()) {
					longestWord = cars[i][j];
				}

			}
		}
		System.out.println("------LARGEST WORD------USING FOR LOOP");
		System.out.println("            " + longestWord);
		System.out.println();
		System.out.println("-----FOR EACH LOOP-----");
		for (String[] carGroups : cars) {
			for (String carModels : carGroups) {
				System.out.println(carModels);
			}

		}
		System.out.println("PRINTING BY MODELS NEXT TO EACH OTHER");
		for (String[] carGroups : cars) {
			for (String carModels : carGroups) {
				System.out.print(carModels + " ");

			}
			System.out.println();

		}
		System.out.println("WITH COUNTRY NAME");
		for (int i = 0; i < cars.length; i++) {
			switch (i) {
			case 0:
				System.out.print("Japanese: ");
				break;
			case 1:
				System.out.print("German: ");
				break;
			case 2:
				System.out.print("Italian: ");
				break;
			}
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();

		}
	}
}
