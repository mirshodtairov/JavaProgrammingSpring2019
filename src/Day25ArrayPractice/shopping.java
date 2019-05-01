package Day25ArrayPractice;

public class shopping {

	public static void main(String[] args) {

		String[] products = { "Tims", "H&M shirts", "Swtch Watch", "Gucci bag" };
		double[] prices = { 120.2, 5.99, 120.2, 300.5 };
		int[] itemsId = { 214212, 241412, 412414, 21141 };
		
		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("shopping list looks good");

		} else {
			System.out.println("shomthing is wrong");
			return;
		}
		for (String p : products) {
			System.out.println(p);

		}
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);

		}
		System.out.println("REVVVEEERRRRSSSS");
		for (int i = itemsId.length - 1; i >= 0; i--) {
			System.out.println(itemsId[i]);

		}
		System.out.println("REEEEPPPPOOORRRRRTTTTT");
		String report = "";
		double TotalPrice = 0.0;
		for (int i = 0; i < products.length; i++) {
			System.out.println("item" + (i + 1) + ": " + itemsId[i] + "-" + products[i] + "-$" + prices[i]);
			TotalPrice+=prices[i];
		}  
		    int maxindex=0;
		    double maxPrice =0;
			System.out.println("$"+TotalPrice);
			for (int i = 0; i < prices.length; i++) {
				if(maxPrice<prices[i]) {
					maxPrice=prices[i];
					maxindex=i;
					
					
					
				}
				
			}
			System.out.println(maxPrice+"_"+products[maxindex]);

		}
	

	}


