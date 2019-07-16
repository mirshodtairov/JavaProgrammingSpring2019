package ArrayList;

import java.util.*;

public class TwoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aaa = new ArrayList<>();
		aaa.add(1);
		aaa.add(3);
		aaa.add(5);
		aaa.add(6);
		aaa.add(8);
		aaa.add(9);
		
		System.out.println(twoTimes(aaa));
	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {
		ArrayList<Integer> list = new ArrayList<>();

		int[] temp = new int[nums.size()];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = nums.get(i);

		}
		
		for (int i = 0; i < temp.length; i++) {
			list.add(temp[i]);

			list.add(temp[i]);

		}
		return list;

	}
}
