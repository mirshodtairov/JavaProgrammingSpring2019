package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayToArrayListAndReverse {

	public static void main(String[] args) {
		int arr [] = {43,56,8,3,9,2,5,0,1};
		List<Integer>nums= Arrays.asList(43,56,8,3,9,2,5,0,1);
		//nums.add(100);
		//nums.add(200);
		//int [] arr2= nums.toArray(new Integer[nums.size()]);
		System.out.println((nums));
		System.out.println(nums.size());
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		
		

	}

}
