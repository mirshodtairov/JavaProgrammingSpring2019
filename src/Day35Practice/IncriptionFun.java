package Day35Practice;

public class IncriptionFun {

	public static void main(String[] args) {
//		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
//
//		String word = "nrihslw";
//		String build = "";
//		char first = word.charAt(0);
//		int position = alphabet.indexOf(first);
//		System.out.println(position);
//		char enChar = encrypted.charAt(position);
//		System.out.println(first + " --> " + enChar);
//
//		String str = "";
//		for (int i = 0; i < word.length(); i++) {
//			char ch = word.charAt(i);
//			int index = alphabet.indexOf(ch);
//			str += encrypted.charAt(index);
//
//		}
//		System.out.print(str);

		System.out.println(encryptChar('z'));

		String normal = "mirshod";
		String encryptWord = encryptWord(normal);
		System.out.println(normal + "  --> " + encryptWord);
		
		
		String w= "java is fun";
		String b = "i love jav";
		System.out.println(encriptSentence(w));
		System.out.println(encriptSentence(b));
		

	}

	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		// return encrypted.charAt(alphabet.indexOf(ch));

		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}

	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));

		}
		return cyphered;
	}

	public static String encriptSentence(String senternce) {
		String[] str = senternce.split(" ");
		String m = "";
		for (String word : str) {
			m += encryptWord(word)+" ";
		}

		return m.trim();
	}

}
