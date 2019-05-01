package RplIt;

public class reverseAndSwap {

	public static void main(String[] args) {
		int[] nums = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		System.out.println("REVERSE ORDER");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
        System.out.println("first half"); 
		for (int j = 0; j < nums.length / 2; j++) {
			System.out.println(nums[j]);

		}
		System.out.println("second half");
		for (int j2 = nums.length / 2; j2 < nums.length - 1; j2++) {
			System.out.println(nums[j2]);

		}
		

	}
}
