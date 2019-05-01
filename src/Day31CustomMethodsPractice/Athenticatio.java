package Day31CustomMethodsPractice;

import java.util.Scanner;

public class Athenticatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String UN= scan.next();
		System.out.println("Enter Pasword:");
		String P= scan.next();
		Login(UN, P);
		

	}

	public static void Login(String username, String password) {
		String validUserName="mentoring@cybertek.com";
		String validPass= "mentor123";
		if (username.equalsIgnoreCase(validUserName)  && password.equals(validPass)) {
			System.out.println("login sucessful");
			
		}else {
			System.out.println("enter valid user name or password");
		}
		
	}

}
