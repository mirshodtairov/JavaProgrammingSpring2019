package ArrayAssignments;

import java.util.Arrays;

public class Binary {
	public static void main(String[] args) {
		int[] binary = new int[8];
		int decimal = 35;
		String str = Integer.toBinaryString(decimal);
		int decimalBinary = Integer.parseInt(str);
		for (int i = binary.length - 1; i >= 0; i--) {

			binary[i] = decimalBinary % 10;

			decimalBinary = decimalBinary / 10;

		}
		System.out.println(Arrays.toString(binary));		
		
		
	}

}
