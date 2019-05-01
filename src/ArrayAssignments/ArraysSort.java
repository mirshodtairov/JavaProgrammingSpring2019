package ArrayAssignments;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int [] nums = {3,56,23,7,2,9,12,68,211,456,-2};
		for (int i : nums) {
			System.out.print(i);
		}
		System.out.println();
		
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.print(i+",");
		}
		

	}

}
