package ArrayList;

import java.util.*;

public class ArrayAsList {

	public static void main(String[] args) {
		ArrayList<Integer>myList = new ArrayList<>();
		
		
		
		List<Integer>nums=Arrays.asList(32,54,56,67);
		
		
		System.out.println(nums);
		nums.size();
		System.out.println(nums);
		nums.set(0, 100);
		//nums.remove(0);
		System.out.println();
		for (int i = 0; i < nums.size(); i++) {
			
			System.out.println(nums.get(i));
		}
		
		

	}

}
