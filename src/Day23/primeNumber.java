package Day23;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println("this is not prime number");
			return;

		}

	}
	System.out.println("this is  prime");

}
}
