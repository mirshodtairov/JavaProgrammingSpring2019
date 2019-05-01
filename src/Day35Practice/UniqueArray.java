package Day35Practice;

import java.util.Arrays;

public class UniqueArray {

	public static void main(String[] args) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3, };
		System.out.println(Arrays.toString(nums));

//		for (int i = 0; i < nums.length; i++) {//outer loop
//			int temp = nums[i];
//			int count=0;
//			for (int j = 0; j < nums.length; j++) {//nested  loop
//				if (temp == nums[j] && i!=j) {
//					count++;
//					break;
//
//				}
//
//			}
//			if (count ==0) {
//				System.out.println(temp);
//			}
//
//		}
		findUniqeValues1(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void findUniqeValues1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int counter = 0;
			int temp = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (temp == nums[j] && i != j) {
					counter++;
					break;

				}

			}
			if (counter == 0) {
				System.out.println(temp);
			}

		}

	}

	//find out how many unique numbers
		//declare new array with that size
		//and loop through again and assign unique numbers
		//return the array
		public static int[] getUniqueArray(int[] nums) {
			//find out how many unique numbers
			int uniqueCount = 0;
			for(int i = 0; i < nums.length; i++) {//outer loop 
				
				int temp = nums[i]; // get a number
				int counter = 0;
				//
				for(int j = 0; j < nums.length; j++) {//inner/nested loop
					if(nums[j] == temp && i != j) {
						counter++;
						break;
					}
				}
				//
				if(counter == 0) {//is it still 0. then it is unique
					uniqueCount++;
				}	
			}
			//declare new array with that size
			int[] uniqueArray = new int[uniqueCount];
			int idx = 0;
			//and loop through again and assign unique numbers
			for(int i = 0; i < nums.length; i++) {//outer loop 
				
				int temp = nums[i]; // get a number
				int counter = 0;
				//
				for(int j = 0; j < nums.length; j++) {//inner/nested loop
					if(nums[j] == temp && i != j) {
						counter++;
						break;
					}
				}
				//
				if(counter == 0) {//is it still 0. then it is unique
					uniqueArray[idx] = temp;
					idx++;
				}	
			}
			
			//return the array
			return uniqueArray;
			
		}
}