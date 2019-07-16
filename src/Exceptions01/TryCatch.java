package Exceptions01;

import java.util.*;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
		String str = "java";
		
		System.out.println("give me number to find out whats is the letter of word");
		System.out.print(str.charAt(scan.nextInt()));
		
	   
	  
		
		}catch (Exception e) {
			System.out.println("Exception heppened in try block and was cought");
			
			
		}
		
		

	}

}
