package homeWork;

public class logicalStatement {

	public static void main(String[] args) {
		boolean b1 = 9>3 && 10==10;
		System.out.println("b1 is "+b1); //true
		
		boolean b2 = true && 10==10;
		System.out.println("b1 is "+b2);
		
		boolean b3 = true && true && 10==10;
		System.out.println("b1 is "+b3);
		
		boolean b4 = true && true || 10==11;
		System.out.println("b1 is "+b4);
		
		boolean b5 = false && true || 10==10;
		System.out.println("b1 is "+b5);
		
		boolean b6 = false && (true || 10==10);
		System.out.println("b1 is "+b6);
		
		boolean b7 = false && false || (true || 10==10);
		System.out.println("b1 is "+b7);
		
		 boolean topicDone = true;
	     boolean isMoreThan3Pm = true;
	     boolean everyThingIsClear = true && !false;
	        
	     boolean letsGoForABreak = topicDone && isMoreThan3Pm && everyThingIsClear;
	        
	     System.out.println("letsGoForABreak: " + letsGoForABreak);
	     
	     boolean b10 = !true || true && true;
	     System.out.println("b10 is: "+b10);
	    		 
	    		 

	}

}
