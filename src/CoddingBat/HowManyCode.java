package CoddingBat;

public class HowManyCode {

	public static void main(String[] args) {
		String Str = "codexxcope";
		int counter = 0;
		String co = "co";
		String e = "e";
		if (Str.length() < 4) {
			System.out.println(counter);

		}
		for (int i = 0; i < Str.length(); i++) {
			if (co.compareTo(Str.substring(i, i + 2)) == 0 && 
			e.compareTo(Str.substring(i + 3, i + 4)) == 0);
			counter++;

		}
		System.out.println(counter);

	}

}