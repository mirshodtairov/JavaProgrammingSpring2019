package RplIt;

import java.util.*;

public class combineALLLLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> list = new ArrayList<>();

		list.addAll(wordList1);
		list.addAll(wordList2);
		
		return list;

	}
	
	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
		for (int i = 0; i < wordList.size(); i++) {
			wordList.remove(targetWord);
			
		}
		return wordList;
		
		
	}
	public static boolean isError(String line) 
	  {
	   String []  myList=line.split(" ");
	   
	   for (int i = 0; i < myList.length; i++) {
		   if (myList[i].equals(line)) {
			   
			   return true;
		   }
		
	}
	return false;
	   
	    
	  }

	

}
