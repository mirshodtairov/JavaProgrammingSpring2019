package RplIt;

public class uniqueChar {
	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("spoon"));//jav
	}

	public static String uniqueChars(String str) {
		String make = "";
		for (int i = 0; i < str.length(); i++) {
			if (!make.contains(""+str.charAt(i))) {
				make += str.charAt(i);
			}

		}
		return make;

	}

}
