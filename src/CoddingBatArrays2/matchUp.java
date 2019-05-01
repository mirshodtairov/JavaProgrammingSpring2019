package CoddingBatArrays2;

public class matchUp {

	public static void main(String[] args) {

		int[] n1 = { 1, 2, 3 };
		int[] n2 = { 2, 3, 10 };
		System.out.println(matchUp(n1, n2));

	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int counter = 0;
		for (int i = 0; i < nums1.length; i++) {
			int diff = nums1[i] - nums2[i];
			if (diff >= -2 && diff <= 2 && diff != 0) {
				counter++;
			}
		}
		return counter;

	}

}
