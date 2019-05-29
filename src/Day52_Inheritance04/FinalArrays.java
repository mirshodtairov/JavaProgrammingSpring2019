package Day52_Inheritance04;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int [] TEAMS = new int [] {11, 11};
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		
		int[] nums = new int[] { 23, 55, 35543 };
		System.out.println(Arrays.toString(nums));

		nums = new int[] { 23423, 45645, 2, 25, 23, 4665, 1 };
		System.out.println(Arrays.toString(nums));

		final int[] finalNums = { 23, 66, 44, 11 };
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34567;
		
		finalNums[1]=4444;
		System.out.println(Arrays.toString(finalNums));

		// finalNums = new int [] {22,44,56,1123,345};
		
		final double [] PRICES = new double[3];
		PRICES [0]= 85.4;
		PRICES [1]= 99.4;
		PRICES [2]= 34.4;
		
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[1]=1000;
		System.out.println(Arrays.toString(PRICES));
		
		
		
		
		
		
	}

}
