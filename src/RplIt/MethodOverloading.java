package RplIt;

import java.util.Arrays;

public class MethodOverloading {

	public static void main(String[] args) {

		int[] intNums = { 3, 5, 7, 9, 2, 6, 8, 2 };
		System.out.println(FindMax(intNums));

		double[] dintNums = { 3.4, 5.7, 9.7, 4.9, 2.6, 8.2 };
		System.out.println(FindMax(dintNums));

	}

	public static int FindMax(int[] nums) {
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > temp) {
				temp = nums[i];
			}
		}
		return temp;
	}

	public static double FindMax(double[] dnums) {
		double temp = dnums[0];
		for (int i = 0; i < dnums.length; i++) {
			if (dnums[i] > temp) {
				temp = dnums[i];

			}
		}
		return temp;
	}

}
