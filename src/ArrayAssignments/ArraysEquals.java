package ArrayAssignments;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// it is when two arrays is same and oreder of elements are equal
		int a []= {10,20,30};
		int b[] = {10,20,30};
		int c[] = {10,20,30,40};
		int d[] = {10,20,40,30};
		
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(c,d));
		
		Arrays.sort(d);
		
		System.out.println(Arrays.equals(c, d));

	}

}
