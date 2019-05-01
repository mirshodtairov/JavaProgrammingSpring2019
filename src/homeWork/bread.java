package homeWork;

import java.util.Scanner;

public class bread {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int a = 0;
		int b = 0;
		int count = 0;

		for (int i = 0; i < str.length() - 6; i++) {
			if (str.substring(i, i + 7).equals("mirshod")) {
				count++;

			}

		}
		if (count>=2) {
			a=str.indexOf("mirshod");
			b=str.lastIndexOf("mirshod");
			System.out.println(str.substring(a + 7, b));

		}else if(count<2) {
			System.out.println("Nothing");
		}
		
	}
}
