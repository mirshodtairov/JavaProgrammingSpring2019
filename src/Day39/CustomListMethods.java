package Day39;

import java.util.*;

import Day21.register;
import Day23.primeNumber;

public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> nimsList = new ArrayList<>();
		nimsList.add(23);
		nimsList.add(10);
		nimsList.add(67);
		nimsList.add(77);
		nimsList.add(85);
		printList(nimsList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);
		System.out.println(sumList(doubleList));

		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list);

		System.out.println(getandomList(20));
		List<Integer> rList = getandomList(10);
		System.out.println(rList);

		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("123");
		strNums.add("123");
		strNums.add("123");
		strNums.add("123");

		System.out.println(converToString(strNums));

		List<Integer> converted = converToString(strNums);
		System.out.println(converted);

	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static int sumList(List<Double> nums) {
		double sum = 0.0;
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);

		}
		return (int) sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			nums.add(i);

		}
		return nums;
	}

	public static List<Integer> getandomList(int size) {
		Random r = new Random();
		List<Integer> ranNums = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			ranNums.add(r.nextInt(100));

		}
		return ranNums;

	}

	public static List<Integer> converToString(List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for (String str : strList) {
			newList.add(Integer.parseInt(str));

		}
		return newList;

	}

}
