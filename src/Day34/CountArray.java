package Day34;

import java.util.Arrays;
import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		int a[] = { 32, 2, 34, 43, 53, 2, 23 };
		System.out.println(findAccourences(a, 2));
		System.out.println(Arrays.toString(getArray()));
		int[] nums = getArray();
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(getRandomArray(10)));
		
		
//		for (;;) {                                                  
//			System.out.println(Arrays.toString(getRandomArray(10))); //Infinite loop
//			
//		}

	}

	public static int findAccourences(int[] arr, int value) {
		int count = 0;

		for (int i : arr) {
			if (value == i) {
				count++;

			}

		}
		return count;

	}

	public static int[] getArray() {
		int[] arr = { 43, 56, 67, 8, 5 };

		return arr;

	}

	public static int[] getRandomArray(int size) {

		Random rand = new Random();//Create a class object 
		int[] arrays = new int[size];//Declare array with size numbers elements 
		for (int i = 0; i < arrays.length; i++) {//loops through the size only
			arrays[i]=rand.nextInt(101);// gets the random numbers and assign to array
		}
		return arrays;

	}

}
