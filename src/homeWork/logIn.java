package homeWork;

import java.util.Scanner;

public class logIn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter user name: ");
		String UserName = scan.next();

		System.out.println("enter user name:cybertak ");
		String Password = scan.next();

		String ValidUserName = "cybertek@mail.ru";
		String ValidPassword = "woodenspoo123";

		if (UserName.equals(ValidUserName) && Password.equals(ValidPassword)) {
			System.out.println("login Succesfull");

		} else if (!UserName.equals(ValidUserName) && !Password.equals(ValidPassword)) {
			System.out.println("invalid username and password");

		} else if (UserName.equals(ValidUserName) && !Password.equals(ValidPassword)) {
			System.out.println("invalid password");

		} else if (!UserName.equals(ValidUserName) && Password.equals(ValidPassword)) {
			System.out.println("invalid username");

		}

	}
}
