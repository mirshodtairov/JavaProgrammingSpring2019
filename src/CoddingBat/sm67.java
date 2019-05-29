package CoddingBat;

import java.util.Arrays;

public class sm67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numsber[] = { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 };
		System.out.println(sum67(numsber));

	}

	public static int sum67(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				while (nums[i] != 7) 
					i++;

				

			} else
				sum += nums[i];

		}
		return sum;
	}

}
