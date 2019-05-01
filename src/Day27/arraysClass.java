package Day27;

import java.util.Arrays;

public class arraysClass {

	public static void main(String[] args) {
		int nums[] = { 123, 23, 12, 54, 123, 3267 };
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		int nums2 []= {3423,3412,34,2334,321,757,2,54};
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		int lowest=nums2[0];
		int highets=nums2[nums2.length-1];
		System.out.println(lowest+" "+highets);
		

	}

}
