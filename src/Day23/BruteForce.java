package Day23;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expacteduserName = "admin";
		String expactedpassword = "admin123";
		int attempts = 5;
		String username = "";
		String pass = "";
		do {
			if (attempts == 0) {
				System.out.println("you have exceede number of ayyamps");
				System.out.println("this user has been deactivated");
				return;

			}
			attempts--;
			System.out.println("please enter user name");
			username = scan.next();
			if (!username.equals(expactedpassword)) {
				System.out.println("wrong");
				System.out.println("attempts left: " + attempts);
				continue;
			}
		} while (!username.equals(expacteduserName) || !pass.equals(expactedpassword));
		{
			System.out.println("Login Succsesful");
		}

	}

}
