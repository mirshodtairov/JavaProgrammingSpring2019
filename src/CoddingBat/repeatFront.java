package CoddingBat;

public class repeatFront {

	public static void main(String[] args) {
		
		System.out.println(repeatFront("Chocolate", 4));

	}

	public static String repeatFront(String str, int n) {
		
		
			String make = "";
			for (int i = 0; i < n; i++) {
				
				make += str.substring(0, n-i);
				

				//return make;

			}
				
		return make;
	}

}
