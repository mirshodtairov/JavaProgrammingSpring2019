package MethodsWithReturn;

public class StringMethods02 {
	public static void main(String[] args) {
		
		System.out.println(countTime("java is fun", "My name is Mirshodaaa", 1));

	}
	public static int countTime(String time1, String time2, int num) {
		int counter=0;
		for (int i = 0; i < time2.length(); i++) {
			
			if (time1.charAt(num)==time2.charAt(i)) {
				counter++;
			}
		}
		return counter;
		
	}

}
