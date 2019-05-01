package Day21;

import java.util.Scanner;

public class register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many items did you purchase");
		int  item= scan.nextInt();
		String name="";
		double totalprice=0;
		String allItems="";
		double price=0;
		for (int i = 1; i<=item; i++) {
			System.out.println("whats is the item munber"+i);
			name=scan.next();
			allItems=allItems+","+name;
			System.out.println("whats the "+name+" price?");
			price=scan.nextDouble();
			
			totalprice=totalprice+price;
			
		}
		System.out.println(allItems.substring(1,allItems.length()));
		System.out.println(totalprice);
	}
	

}
