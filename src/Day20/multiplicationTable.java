package Day20;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 1 || num > 10) {
			System.out.println("invalid number");
			return;
		}
		for (int sum = 1; sum <= 10; sum++){
			System.out.println(num+" X "+sum+"="+sum*num);
		}
			
			
		
		}

	}


