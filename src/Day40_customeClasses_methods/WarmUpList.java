package Day40_customeClasses_methods;

import java.util.*;

public class WarmUpList {

	public static void main(String[] args) {
		
		List<String>words=new ArrayList<>();
		words.add("aa");
		words.add("aa");
		words.add("bb");
		words.add("vv");
		words.add("vv");
		
		String word1= "vv";
		System.out.println(count(words, word1));
		
		
		
		
	
	}
	public static int count(List<String> words, String word) {
		int count=0;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).equals(word)) {
				count++;
				
			}
			
		}
		return count;
	}
	

}
