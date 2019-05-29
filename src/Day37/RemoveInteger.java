package Day37;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		
		nums.add(23);
		nums.add(4);
		nums.add(657);
		nums.add(5);
		nums.add(43);
		nums.add(-1);
		nums.add(81);
		
		System.out.println(nums);
		nums.remove(5);
		
		System.out.println(nums);
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);
		System.out.println(nums);
		
		
		

	}

}
