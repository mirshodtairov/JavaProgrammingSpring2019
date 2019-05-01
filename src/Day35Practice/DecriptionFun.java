package Day35Practice;

public class DecriptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String w= "glwzb dzh z tivzg wzb zmw dv xlwvw qzez";
		String b = "r olev qze";
		System.out.println(dencriptSentence(w));
		System.out.println(dencriptSentence(b));

	}
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		// return encrypted.charAt(alphabet.indexOf(ch));

		int i = encrypted.indexOf(ch);
		char ret = alphabet .charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String coverted = "";
		for (int i = 0; i < word.length(); i++) {
			coverted += decryptChar(word.charAt(i));

		}
		return coverted;
	}

	public static String dencriptSentence(String senternce) {
		String[] str = senternce.split(" ");
		String m = "";
		for (String word : str) {
			m += decryptWord(word)+" ";
		}

		return m.trim();
	}

}


