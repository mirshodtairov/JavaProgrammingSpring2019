package Day27;

import java.util.Arrays;

public class equals {

	public static void main(String[] args) {
		int[] nums1 = { 4, 5, 6, 7, 10 };
		int[] nums2 = { 4, 5, 6, 7, 10 };
		System.out.println(Arrays.equals(nums1, nums2));
		if (Arrays.equals(nums1, nums2)) {
			System.out.println("they are exactly same");
		} else {
			System.out.println("please chande value");
		}
		String sts[]= {"one", "two", "three"};
		String sts2[]= {"one", "two", "three"};
		System.out.println(Arrays.equals(sts, sts2));
		boolean match = Arrays.equals(sts, sts2);
	}

}
