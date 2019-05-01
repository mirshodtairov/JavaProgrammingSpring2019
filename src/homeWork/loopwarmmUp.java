package homeWork;

import java.util.Scanner;

public class loopwarmmUp {

	public static void main(String[] args) {

		double balance;
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your balance:");
		balance = scan.nextDouble();
		int count = 0;
		while (balance > 0) {
			count++;
			System.out.println("whats the transaction #" + count + " amount?");
			double transaction = scan.nextDouble();
			if (transaction > balance) {
				System.out.println("your balance is negative");
			}
			balance -= transaction;
			System.out.println("current balance " + balance);

		}
		System.out.println("insufficient founds," + balance);
		System.out.println("transaction total: " + count);

	}

}
