package ArrayAssignments;

import Day20.forLoop1;

public class findLagestArray {

	public static void main(String[] args) {
//		double[] prices = { 33.4, 342.3, 43.21, 54.3, 65.3, 6.0, 545.3, 12.43 };
//		double max=0.0;
//		
//		for (double d : prices) {
//			if (max<d) {
//				max=d;
//			}
//			
//		}
//		System.out.println(max);
//		
//		String [] str= {"mama", "likes", "cooking"};
//		String str2=str[0];
//		for (int i = 1; i < str.length; i++) {
//			if (str2.length()<str[i].length()) {
//				str2=str[i];
//			}
//			
//		}
//		System.out.println(str2);
//		
//
//	}

		int[] num = { 5, 34, 5, -3, 53, 6, 7, 9 };
	
			int x = num[0];
			int main = 10;

			for (int i = 1; i < num.length; i++) {
				if (x + num[i] == 10) {
					System.out.println("array has numbers in combination makes 10");
					

				} else {
					System.out.println("no match");
				}
			}
		}
	}
