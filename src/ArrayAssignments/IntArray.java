package ArrayAssignments;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {
		int[] nums = { 10, 15, 20, 25, 30 };
		System.out.println(Arrays.toString(nums));
		int count = 0;
		for (int i : nums) {
			if (i > 17) {
				System.out.println(i);

			}

		}

		for (int i = 0; i < nums.length; i++) {
			count += nums[i];
		}
		System.out.println(count);

		int m = nums[nums.length / 2];
		int l = nums[nums.length - 1];

		System.out.println(m);
		System.out.println(l);
		
		int lowest = nums[0];
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] < lowest) {
				lowest = nums[k];

			}

		}
		System.out.println("the lowest num is: " + lowest);
        int maxNum = 0;
		for (int z = 0; z < nums.length; z++) {

			if (nums[z] > maxNum) {
				maxNum = nums[z];
				

			}

		}
		System.out.println(maxNum);
	}
}
