package ArrayAssignments;

import java.util.Iterator;

public class ifArrayHasE {

	public static void main(String[] args) {
		String[] str = { "four", "two", "three", "five", "one", "two" };
		int counter = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("e")) {
				counter++;

			}
		}
		System.out.println(counter);

		System.out.println("IF CONTAINS E FOR EACH LOOP");
		for (String string : str) {
			if (string.contains("e"))
				System.out.println(string);
		}
		System.out.println("IF CONTAINS E FOR LOOP");
		for (int j = 0; j < str.length; j++) {
			if (str[j].contains("e")) {
				System.out.println(str[j]);
			}

		}
		System.out.println("MORE THAN 3 LETTER");
		for (int l = 0; l < str.length; l++) {
			if (str[l].length() > 3) {
				System.out.println(str[l]);
			}

		}
		System.out.println("REVERSE ORDER");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);

		}
		System.out.println("SERTAIN AMMOUNT OF WORD With SUBSTRING");
		for (String string1 : str) {
			System.out.println(string1.substring(0, 2));

		}
		System.out.println("CONCOTENATING PARTS");
		for (String string2 : str) {
			System.out.println(string2.substring(string2.length() - 2) + string2.substring(0, string2.length() - 2));

//		}System.out.println("REPETTION WORDS");
//		for (int h = 0; h < str.length; h++) {
//				String temp=str[h];
//				boolean www=true;
//			for (int z = 0; z < str.length; z++) {
//			
//					if (temp==str[z] &&  h!=z) {
//						System.out.println(temp);
//						
//					}else {System.out.println("No repetition");}
		}
		System.out.println("COCATINATING WITH CHARAT");
		for (String string3 : str) {
			System.out.println(string3.charAt(0) + "" + string3.charAt(string3.length() - 1));
		}
		System.out.println("REVERSE ORDER");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);


	}

}
}
