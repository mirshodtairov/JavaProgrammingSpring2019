package CoddingBatArrays2;

import java.util.*;

public class centeredAverage {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 5, 5, 10, 8, 7 };
		int result = 0;
		int everage= 0;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		for (int i = 1; i < nums.length - 1; i++) {
			result += nums[i];
			everage=result/(nums.length-2);
			
			//result = result / (nums.length);

		}
		System.out.println(everage);

	}
}
