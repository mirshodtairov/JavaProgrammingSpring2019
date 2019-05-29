package RplIt;

import java.util.*;

public class FuelStops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(2);
//		    arr.add(1);
//		    arr.add(2);
//		    arr.add(6);
		int times = refuel_times(arr, 4);
		System.out.print(times);// should output 5

	}

	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
		int sum = 0;
		int number = 0;
		for (int i = 0; i < deliveries.size(); i++) {
			sum += deliveries.get(i);

		}

		number = sum / max_fuel;
		if(number%max_fuel!=0) {
			return number+1;
		}
		return number;
	}

}
