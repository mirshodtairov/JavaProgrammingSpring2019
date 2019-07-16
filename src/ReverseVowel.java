import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowel {

	public static void main(String[] args) {

		String str = "\"Ab,c,de!$";//eb,c,dA!$

		String reverse = "";
		
		ArrayList<Character> list = new ArrayList<>();
		
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				list.add(str.charAt(i));
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'A' && str.charAt(i) != 'e' &&str.charAt(i) != 'E'
					&& str.charAt(i) != 'i' && str.charAt(i) != 'I' && str.charAt(i) != 'o' && str.charAt(i) != 'O'
							&& str.charAt(i) != 'u' && str.charAt(i) != 'U') {
				list.add(i, str.charAt(i));

			}

		}
		for (int i = 0; i < list.size(); i++) {
			reverse+=list.get(i);
			
		}
		
		
		System.out.println(reverse);
		

	}

}
