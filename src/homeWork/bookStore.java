package homeWork;

import java.util.Scanner;

public class bookStore {

	public static void main(String[] args) {
		int freeBooks = 0;

		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer == true) {
			freeBooks = nbooksPurchased / 5;
			nbooksPurchased = nbooksPurchased % 5;
			}else if(isPremiumCustomer == true){
			freeBooks = nbooksPurchased / 4;
			nbooksPurchased = nbooksPurchased % 4;
			} else if(isPremiumCustomer == false) {
			freeBooks = nbooksPurchased / 7;
			nbooksPurchased = nbooksPurchased % 7;}
			else if(isPremiumCustomer == false){
			freeBooks = nbooksPurchased / 6;
			nbooksPurchased = nbooksPurchased % 6;}
		System.out.println(freeBooks);
	}

}
