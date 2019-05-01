package Day14StringManipulation;

public class charAt {

	public static void main(String[] args) {
	String word = "compute r";
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	System.out.println(word.charAt(8));
	 
	String word2 = "Cybertek";
	if (word2.charAt(0)=='C'){
	System.out.println("C is first letter");}
	else {System.out.println("C is not first letter");}
	

	String word3 = "civic";
	
	char first = word3.charAt(0);
	char last = word3.charAt(4);
	
	if (first==last) {
		System.out.println("first and last match");}
	else {System.out.println("first and last does not match");
	}
	
	}

}
