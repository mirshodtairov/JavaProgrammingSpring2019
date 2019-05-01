package Day17_whileloops;

import java.util.Scanner;

public class attemptsPinCode {

	public static void main(String[] args) {
		int secretincode = 4321; 
		Scanner scan = new Scanner (System.in);
		
		int pincode =0;
		int attempts = 0;
		while (pincode != secretincode && attempts <=3) {
			System.out.println("enter pincode");
			
			pincode = scan.nextInt();
			attempts++;
			
			if(attempts == 3 && pincode != secretincode ) {
				System.out.println("card is bloked");
				return;
			}
		}

	}

}
