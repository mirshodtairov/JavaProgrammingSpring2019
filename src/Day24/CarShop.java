package Day24;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}

		System.out.println("*********************");
		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);

			}
			System.out.println("*********************");
			for (String b : cars) {
				if (b.endsWith("a")) {
					System.out.println(b);
				}

			}
			System.out.println("*********************");
			for (String a : cars) {
				if (a.length() > 5) {
					System.out.println(a);
				}
			}
			System.out.println("*********************");
			String temp = cars[0];
			cars[0] = cars[cars.length - 1];
			cars[cars.length - 1] = temp;
			
			
			System.out.println(Arrays.toString(cars));
			
			System.out.println("Before sorting");
	        System.out.println(Arrays.toString(cars));
	        Arrays.sort(cars);
	        System.out.println("After sorting");
	        System.out.println(Arrays.toString(cars));

		}

	}
}
