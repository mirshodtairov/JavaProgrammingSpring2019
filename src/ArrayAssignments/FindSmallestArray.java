package ArrayAssignments;

import java.util.Iterator;

public class FindSmallestArray {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int evennums = 0;
		int oddNums = 0;
		int[] nums = { 23, 12, 41, 411, 4123, 421, 12, 212, 64, 2, 542, 323 };
		int theSmallest = nums[0];
		for (int i : nums) {
			if (i < theSmallest) {
				theSmallest = i;

			}

		}
		System.out.println(theSmallest);

		for (int i : nums) {
			sum += i;
			if (i % 2 == 0) {
				evennums += i;
			} else {
				oddNums += i;
			}

		}
		System.out.println(sum);
		System.out.println(evennums);
		System.out.println(oddNums);
		System.out.println(oddNums + evennums);

	}

}
