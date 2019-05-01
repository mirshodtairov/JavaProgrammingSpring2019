package Day17_whileloops;

import java.util.Scanner;

public class giveMeFive$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int dollars=0;
		
		while(dollars!=5) {
			System.out.println("give me 5 bucks");
			dollars = scan.nextInt();
			
		}
		System.out.println("thanks");
		

	}

}
