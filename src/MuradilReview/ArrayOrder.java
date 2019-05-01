package MuradilReview;

public class ArrayOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 6, 7, 9, 13, };
		int[] nums2 = { 1, 4, 6, 3, 9, 13, };

		IsSorted(nums2);

	}

	private static void IsSorted(int[] nums) {
		boolean sorted = true;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				sorted = false;
				break;

			}

		}
		System.out.println("arrays is sorted? " + sorted);
	}
	
	
	
	

}
