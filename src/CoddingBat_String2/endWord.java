package CoddingBat_String2;

public class endWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String wordEnds(String str, String word) {
		String wo="";
		int a=str.indexOf(word);
		int b=str.lastIndexOf(word);
		
		wo+=str.substring(a-1, a)+str.substring(a);
	
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+word.length()).equals(word)) {
				
			
		}
		
		
		return word;
		  
	}
		return wo;

}
}
