package Day37;

import java.util.*;

public class ArraysAList {

	public static void main(String[] args) {

		List<Integer> cars = Arrays.asList(4, 5, 6, 7, 65, 4, 3);
		System.out.println(cars);
		// cars.add(4);
		// System.out.println(cars);

		List<Double> prices = Arrays.asList(43.5, 54.6, 7.5, 12.0);
		System.out.println(prices);

		double sum = 0;
		for (Double double1 : prices) {
			sum += double1;
		}
		System.out.println(sum);
		
		
		double num2=0;
		for (int i = 0; i < prices.size(); i++) {
			num2+=prices.get(i);
			
		}
		System.out.println(num2);
		
		

	}
}