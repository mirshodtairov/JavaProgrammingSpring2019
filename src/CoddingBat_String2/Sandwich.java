package CoddingBat_String2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sandwich {

	public static void main(String[] args) {
	
		String str = "ssabreadjambreadasfasd";
		System.out.println(getSandwich(str));
		

		

	}
	public static String getSandwich(String str) {
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");
		if (first == last) return "";

		return str.substring(first + 5, last);
		}

}

// System.out.println(str.indexOf("b"));
// ArrayList<String> aaa = new ArrayList<>();
// aaa.add(str);
// System.out.println(aaa);
// System.out.println(Arrays.toString(aaa));

// if (aaa.contains("breadjambread")) {
// System.out.println("jam");

// }else {
// System.out.println("jdgv");
// }
