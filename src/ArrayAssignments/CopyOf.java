package ArrayAssignments;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		int [] a = {324,345,145,4};
		int [] b = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		int [] c = Arrays.copyOf(b, 2);
		System.out.println(Arrays.toString(c));
		
		System.out.println("________________________________");
		System.out.println(Arrays.toString(a));
		 a = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(a));
		a[4]=100;
		System.out.println(Arrays.toString(a));
		

	}

}
