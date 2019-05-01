package Day20;

public class CountHowMany {

	public static void main(String[] args) {
		//wrd
		//char to count the number of accurances
		
		String word="computer programming";
		char MyChar='m';
		int counter=0;
		for(int i =0; i<word.length(); i++) {
			if (word.charAt(i)==MyChar) {
				counter++;
			}
			
		}
		System.out.println(counter);

	}

}
