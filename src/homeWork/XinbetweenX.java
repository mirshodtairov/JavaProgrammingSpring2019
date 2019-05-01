package homeWork;

import java.util.Scanner;

public class XinbetweenX {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	   if   (word.startsWith("x") && word.endsWith("X")){
			    	String word1=word.substring(word.indexOf("x")+1,word.indexOf("X"));
			    	System.out.println(word1);}
		 else if (word.startsWith("X") && word.endsWith("X")){
			    	String word2=word.substring(word.indexOf("X")+1,word.indexOf("X"));
			    	System.out.println(word2);}
		 else if (word.startsWith("X") && word.endsWith("x")){
			    	String word3=word.substring(word.indexOf("X")+1,word.indexOf("x"));
			    	System.out.println(word3);}
		else if (word.startsWith("X")){
			  		String word4=word.substring(word.indexOf("X")+1);
			  	System.out.println(word4);}
	    else if (word.startsWith("x")){
			  		String word5=word.substring(word.indexOf("x")+1); 
			  	    System.out.println(word5);}
		else if (word.endsWith("X")){
			  	String word5=word.substring(0,word.indexOf("X"));
			  	System.out.println(word5);}
		else if (word.endsWith("x")){
			  		String word6=word.substring(0,word.indexOf("x"));
			  		System.out.println(word6);}
	  else{System.out.println(word);}

}
}

