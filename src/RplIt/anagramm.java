package RplIt;

import java.util.Arrays;

public class anagramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		String w1 = "listen";
		String w2 = "silent";
		System.out.println(isAnagram(w1, w2));

	}

	public static boolean isAnagram(String word1, String word2) {

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String sorted1 = new String(arr1);
		String sorted2 = new String(arr2);
		
	   if(sorted1.equalsIgnoreCase(sorted2)) {
		   return  true;
	   }
	  return false;
		
		
	}
}
		
		
//		for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i]!=arr2[i]) {
//				return false; 
//				
//			}
//			if(arr1[i]==arr2[i]) {
//				
//			}
//		}
		//return  true;
		
		

		
		//return arr2;


//		
//		int counter1 = 0;
//int counter2=0;
//
//
//for (int i = 0; i < word1.length(); i++) {
//    for (int j = 0; j < word2.length(); j++) {
//        if (word1.charAt(i) == word1.charAt(j)) {
//            counter1++;
//        }
//        if (word1.charAt(i) == word2.charAt(j)) {
//            counter2++;
//        }
//
//    }
//    if(counter1==counter2){
//        counter1 =0;
//        counter2=0;
//    }
//    else{
//        return false;
//    }
//
//}
//return true;
//
//
//}
