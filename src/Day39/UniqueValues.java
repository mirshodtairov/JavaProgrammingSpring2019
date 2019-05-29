package Day39;

import java.util.*;

//mport com.sun.tools.javac.util.List;

public class UniqueValues {

	public static void main(String[] args) {
		// List<Integer> nums = new ArrayList<>();

		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(4);
		nums.add(8);

		System.out.println(nums);

		ArrayList<Integer> unique1 = new ArrayList<>();
		// int n = unique.get(0);
		for (Integer num : nums) {
			if (!unique1.contains(num)) {
				unique1.add(num);

			}
		}
		System.out.println(unique1.toString());

		ArrayList<Integer> unique2 = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			int value = nums.get(i);
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(j) == value && i != j) {
					count++;
					break;
				}

			}
			if(count==0) {
				unique2.add(value);
			}

		}
		System.out.println(unique2);
	}

}
