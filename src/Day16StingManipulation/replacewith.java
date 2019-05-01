package Day16StingManipulation;

public class replacewith {

	public static void main(String[] args) {
		String sentence = "Codding is fun";
		sentence = sentence.replace(" ", "");
		System.out.println(sentence);

		String mixed = "J@-V|";
		String mixerd1 = mixed.replace("-", "");
		System.out.println(mixerd1);

		String result = "about 115,000,000 result (0.66 seconds";
		String result1 = result.replace("about ", "").replace("result", "").replace("seconds", "").replace("(0.66", "");
		System.out.println(result1);
		
		String string2 = result1.replace(result1.charAt(3), '-');
		System.out.println(string2);
		
		
		
		
		

	}

}
