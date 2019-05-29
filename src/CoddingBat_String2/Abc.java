package CoddingBat_String2;

public class Abc {
	public static void main(String[] args) {
		// public boolean catDog(String str) {
		String str = "catdog";
		int catCounter = 0;
		int dogCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf("dog", i) >= 0) {
				dogCounter++;
				i = str.indexOf("dog", i);
			} else {
				break;
			}

		}
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf("cat", i) >= 0) {
				catCounter++;
				i = str.indexOf("cat", i);
			} else {
				break;
			}
		}
		System.out.println(catCounter == dogCounter);

	}
}
