package homeWork;

import java.util.Scanner;

public class warm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int areaCode;
		int localNumber;
		String PhoneNumber;
		
		System.out.println("enter erea code: ");
		areaCode = scan.nextInt();
		
		System.out.println("enter local number: ");
		localNumber = scan.nextInt();
		
		PhoneNumber ="("+areaCode+")-"+localNumber;
		System.out.println(PhoneNumber);
		

	}

}
