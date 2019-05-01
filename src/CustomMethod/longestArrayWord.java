package CustomMethod;

public class longestArrayWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] strs= {"short", "big", "longest"};
		System.out.println(longestWordd(strs));
		

	}
	public static String longestWordd(String[] words) {
		String shortest="";
		for (int i = 0; i < words.length; i++) {
			shortest=words[i];
			if(words[i].length()> shortest.length()) {
				shortest=words[i];
			}
		}
		return shortest;
	}

}
