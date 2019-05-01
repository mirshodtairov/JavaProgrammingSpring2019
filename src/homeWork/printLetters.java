package homeWork;

public class printLetters {

	public static void main(String[] args) {
	 String word="amazon facebook";
	 int  idx=0 ;
	 while (idx<word.length()) {
		 System.out.println(word.charAt(idx));
		 idx++;
	 }
	 int idx2=word.length()-1;
	 while (idx2>= 0) {
		 System.out.println(word.charAt(idx2));
		 idx2--;
	 }
	 
	 
	 
	 
//	 
//	 System.out.println(word.charAt(0));
//	 int  idx=0 ;
//      System.out.println(word.charAt(idx));
//      idx++;
//      System.out.println(word.charAt(idx));
//      
      
	}

}
