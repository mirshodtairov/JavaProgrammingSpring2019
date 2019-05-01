package Day16StingManipulation;

public class concat {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat(" Selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		word = word.concat(" Automation");
		System.out.println(word);
		
		String word2= "hi";
		word2=word2.concat("-hey").concat(" how are you?");
		System.out.println(word2);
		

	}

}
