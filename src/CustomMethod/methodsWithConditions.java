package CustomMethod;

import java.util.*;

public class methodsWithConditions {

	public static void main(String[] args) {

		int a;
		int b;
		//System.out.println("Enter two numbers");
//    	Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		b = scan.nextInt();
//		getmax(a, b);
		//int [] arr= {30,40,50};
		int x []= {23,43,56,68}; 
		//int arr[]= new int[x];
		getmaxArr(x);
		
		
		getmaxArr(new int [] {30,2,53,465,5});
		
		
		maxWithSort(new int [] {23,57,32,68,241});
		

	}

	public static void getmax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger");

		} else if (num1 < num2) {
			System.out.println(num2 + " is larger");

		} else {
			System.out.println("numbers are equal");
		}
	}

	int temp = 0;

	public static void getmaxArr(int[] num) {
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > temp) {
				temp = num[i];

			}
		}
		System.out.println(temp);
	}
	public static void maxWithSort(int [] num2) {
		Arrays.sort(num2);
		System.out.println(num2[num2.length-1]);
	}
	

}
