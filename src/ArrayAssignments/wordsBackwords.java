package ArrayAssignments;

import java.util.Scanner;

public class wordsBackwords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String newString="";
	    for (int i=0; i<sentence.length(); i++) {
	          newString = sentence.charAt(i) + newString;

	}
	    System.out.println(newString);

}
}