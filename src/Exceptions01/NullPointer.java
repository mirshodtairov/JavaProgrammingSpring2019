package Exceptions01;

public class NullPointer {
	
	public static void main(String[] args) {

		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		}

		 

	 public static String makeThreeSubstr(String word,int startIndex, int endIndex){
		   String re="";
		    for(int i= 1; i  <=3; i++){
		     ;
		      re+=word.substring(startIndex, endIndex );
		      
		    }
		    return re;
		    
		  }
		 

		
}
