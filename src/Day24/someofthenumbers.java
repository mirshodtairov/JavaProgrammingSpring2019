package Day24;

import java.util.Arrays;

public class someofthenumbers {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]>max) {
				max=numbers[i];
			}
			
		}
		System.out.println(max);
		
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k]>max) {
				min=numbers[k];
		}
	}
		System.out.println(min);

}
}
