package Day27;

import java.util.Arrays;

public class copyOf2 {

	public static void main(String[] args) {
		int [] nums1 = {34, 53, 56, 78, 65};
		int[] nums2= Arrays.copyOfRange(nums1, 2, 9);
		System.out.println(Arrays.toString(nums2));
		
		int[] brandNew = {34, 23, 54, 23};
		brandNew= Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println(Arrays.toString(brandNew));
		brandNew[4]=200;
		brandNew[5]=200;
		brandNew[6]=200;
		brandNew[7]=200;
		brandNew[8]=200;
	//	brandNew[9]=200;
		System.out.println(Arrays.toString(brandNew));
		

	}

}
