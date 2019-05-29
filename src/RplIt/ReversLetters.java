package RplIt;

import java.util.Arrays;

public class ReversLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "<..[dvcx..z]>";//<..[vcxz..]>
		char[] list = str.toCharArray();
		//System.out.println(Arrays.toString(list));
		String reverse = "";
		int x=list.length-1;
		for (int i = 0; i < list.length; i++) {
			if (!Character.isAlphabetic(list[i])) {
				reverse += list[i];
			} else {
				for (int j = x-1; j >= 0; j--) {

					if (Character.isAlphabetic(list[j])) {
						reverse += list[j];
						x=j;
						break;

					}

				}

			}
		}
		System.out.println(reverse);

	}
}

//	 public static String reverseLetters(String word){
//		 char [] list= word.toCharArray();
//		 String reverse="";
//		 
//			for (int i = 0; i < list.length; i++) {
//				if(Character.isDigit(list[i])) {
//					reverse+=list[i];
//				}
//				for (int j = list.length; j > 0; j--) {
//					if(Character.isAlphabetic(list[j])) {
//						reverse+=list[j];
//					}
//				}
//				
//			}
//			return reverse;
//		}
