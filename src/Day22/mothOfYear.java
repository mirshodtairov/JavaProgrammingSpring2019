package Day22;

import java.util.Scanner;

public class mothOfYear {
	
    
 	public static void main(String[] args) {
 		Scanner scan=new Scanner(System.in);
 		
		int month;
		do {
			System.out.println("enter mothn");
			month = scan.nextInt();

		}while (month<=12 && month>0);
		System.out.println("invalid number");

	}

}
