package ArrayAssignments;

import java.util.Arrays;

public class FrontPeace {
	public static void main(String[] args) {
		int[] num = { 1 , 5 ,5 ,3};
		int size = 0;
//		if (num.length >= 2) {
//			size = 2;
//		} else {
//			size = num.length;
//		}
		int[] num2 = new int[num.length > 2 ? 2 : num.length];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num[i];
		}
		System.out.println(Arrays.toString(num2));

	}

}
