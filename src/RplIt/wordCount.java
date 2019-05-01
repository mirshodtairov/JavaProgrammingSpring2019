package RplIt;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String www= "";
		System.out.println(wordCount(www));

	}
	public static int wordCount(String words) {
		
		
		
		String [] str=words.split(" ");
		
		
			if(str.length==1) {
			return 1;
		}else if (str.length==0) {
			return 0;
		}
			return str.length;
			
	}
}
	