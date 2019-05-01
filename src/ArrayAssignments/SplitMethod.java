package ArrayAssignments;

public class SplitMethod {

	public static void main(String[] args) {
		String words = ("java-selenium-cucumber-Selenium");
		String[] splittedWords = words.split("-");
		
			
        System.out.println(splittedWords.length);
        
        for (String w : splittedWords) {
        	System.out.println(w);
			
		}
        String sentence= ("we alove reston, i have been to 8 mane placess");
        String[] z = sentence.split(" ");
        System.out.println(z.length);
        for (String string : z) {
        	System.out.println(string);
        	
			
		}
       // System.out.println(sentence.split(" ")[0]]);
        
		}
	

	}


