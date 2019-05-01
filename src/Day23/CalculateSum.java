package Day23;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if (str.substring(0, 3).equals("bad")) {
			System.out.println(true);
		} else if (str.substring(1, 4).equals("bad")) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}
	}
}
//		for (int i = 0; i <6; i++) {
//			System.out.println("emter number");
//			number=scan.nextInt();
//			if (number<=0) {
//				continue;
//			}
//			sum=sum+number;
//		}
//		System.out.println(sum);
//
//	}
//
//}
