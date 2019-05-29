package VasylApril11Fundamentals;

import java.util.Arrays;

public class CharPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNumber = "(240) 567 7834";
		char[] chars= phoneNumber.toCharArray();//it will convert string into arrays of chars
		System.out.println(Arrays.toString(chars));
		int digitCouner = 0;
		for (char c : chars) {
			if (Character.isDigit(c)) {
				digitCouner++;
			}
		}
		System.out.println(digitCouner);
		
		
		String name = "Mike";
        // Character.isAlphabetic(codePoint) --> to verify if name is valid
        boolean isValid = false;
        // we can use for each loop only with collections of data
        // since name is a string, we need to use method .toCharArray() that will
        // convert
        // string into array of chars
        // for(char var: name.toCharArray()) {
        //
        // }
        for (int i = 0; i < name.length(); i++) {
            char var = name.charAt(i);
            isValid = Character.isAlphabetic(var);
            
            if(isValid == true) {
                System.out.println(var + " : letter");
            }else {
                System.out.println(var + " : not letter");
            }
        }
    }
}
