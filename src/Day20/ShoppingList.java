package Day20;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		boolean countinue;
		double price = 0;
		int count = 1;
		double totalProce = 0;

		do {
			System.out.println("Enter Item" + count + " and its price: ");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport += "Item" + count + ":" + " " + item + " Price: " + price;
			count++;
			totalProce = totalProce + price;
			System.out.println("Add one more item?");
			if(countinue = scan.next().equalsIgnoreCase("yes"))
				shoppingListReport += ", ";
		} while (countinue);
		System.out.println(shoppingListReport);
		System.out.println(totalProce);
	}
}

//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println("Enter Item" + i + " and its price: ");
//			item = scan.next();
//			price = scan.nextDouble();
//
//			System.out.println("Add one more item?");
//			countinue = scan.next();
//            shoppingListReport = "Item" + i + ":" + " " + item + " Price: " + price;
//			if (!countinue.equalsIgnoreCase("no")) {
//				
//				totalProce = price + price;
//			} 
//
//			}
//		

//		System.out.println(shoppingListReport);
//		System.out.println(totalProce);
