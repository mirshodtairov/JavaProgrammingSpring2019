package Day20;

import java.util.Scanner;

public class divisonTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int result;
		
		for (int b=1; b<=100; b++) {
			result=num*b;
			System.out.println(num+"*"+b+"="+result);
			
		}
		

	}

}
