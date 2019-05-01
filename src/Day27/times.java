package Day27;

import java.util.Arrays;

public class times {

	public static void main(String[] args) {
		int[] time1 = { 0, 12 };
		int[] time2 = { 12, 34 };

//		System.out.println(Arrays.toString(time1));
//		System.out.println(Arrays.toString(time2));

		
		 if (time1[0] > time2[0]) {
			System.out.println(Arrays.toString(time2) + " is earlier");
		} else if (time1[0] < time2[0]) {
			System.out.println(Arrays.toString(time1) + " is earlier");
		} else if (time1[0] == time2[0] && (time1[1] > time2[1])) {
			System.out.println(Arrays.toString(time2) + " is earlier");
		} else if (time1[0] == time2[0] && (time1[1] < time2[1])) {
			System.out.println(Arrays.toString(time1) + " is earlier");
		} else if  (time1[0] == time2[0] && (time1[1] == time2[1]))
			System.out.println("Same Time");
		

	}

}
