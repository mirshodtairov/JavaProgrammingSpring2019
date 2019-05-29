package RplIt;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String input="student";
		String temp="";
		String[] ccc= input.split("");
		//System.out.println(Arrays.toString(ccc));
		  for(int i=ccc.length-1; i>=0; i--) {
			  temp=ccc[i];
		  }
		  System.out.println(ccc);
		
		
		  char ch[]=input.toCharArray();  
		  String revers="";
		  for(int i=input.length()-1; i>=0; i--){
		    revers+=ch[i];
		  }
		System.out.println(revers);
		  
		   
		}

	}


