package CoddingBat;

import java.util.Arrays;

public class bigDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,6,10};
		System.out.println(bigDiff(a));
		

	}

	public static int bigDiff(int[] nums) {

		int max = nums[0];
		int min = nums[0];
		int minus = 0;
		if (nums.length >= 2) {
			for (int i = 0; i < nums.length; i++) {
				if (max < nums[i]) {
					max = nums[i];

				}
				if (min > nums[i]) {
					min = nums[i];

				}

			}
			minus = max - min;
			return minus;

		}else 
			return max;
	}

}
