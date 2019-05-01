package MethodsWithReturn;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= new int[5];
		Random rdm= new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i]=rdm.nextInt(101);
		}
		System.out.println(Arrays.toString(nums));

	} 
	

}
