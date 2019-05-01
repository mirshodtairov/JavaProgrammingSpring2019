package day32MethodsWithReturn;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class ArrysParametr {

	public static void main(String[] args) {
		int myarray[] = { 32, 46, 76, 94, 26 };
		printArray(myarray);
		printArray(new int[] { 33, 56, 78, 3, 8 });
		int [] n1={32,46,57,2,7,4};
		int [] n2= {34,7634,8,89,3,5};
		
		print2array(n1,n2);

	}

	public static void printArray(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print2array(int[] nums, int[] num2) {
		if (nums.length>num2.length) {
			printArray(nums);
			printArray(num2);
		
		}else {
			printArray(nums);
			printArray(num2);
		
		}
	}
	
	
	
}
