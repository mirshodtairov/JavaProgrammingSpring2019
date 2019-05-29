package Day41;

import java.util.*;

public class WarmUpList {

	public static List<Integer> doubleList(List<Integer> nums) {

		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		return nums;

	}
	
	public static void main(String[] args) {
		
		
		List<Integer> ns= new ArrayList<>();
		ns.add(5);
		ns.add(4);
		ns.add(6);
		ns.add(9);
		System.out.println(doubleList(ns));
		
	}

}
