package MethodsWithReturn;

public class HowmanyCharsInStr {

	public static void main(String[] args) {
		System.out.println(howMany("java", "a"));

	}
	
	
	public static int howMany(String str1, String str2) {
		 
			int n=str1.length();
			str1=str1.replace(str2, "");
			int n2= str1.length();
			return (n-n2);
			
		}
		
	}


