package OlimjonClass;

public class BuilderPractice {

	public static void main(String[] args) {
		String str= "i love java";
		StringBuilder myStr = new StringBuilder(str);
     	System.out.println(myStr);
    	//myStr.reverse();
     	//System.out.println(myStr);
//		System.out.println(myStr.capacity());
		myStr.append("f");
		System.out.println(myStr);
//		myStr.append(" and i love myself");
//		System.out.println(myStr);
//		myStr.delete(2, 6);
//		System.out.println(myStr);
		boolean boo = false;
		myStr.insert(5, boo);
//		System.out.println(myStr);
//		myStr.indexOf("love");
//		System.out.println(myStr);
//		myStr.reverse();
	System.out.println(myStr);
//		
//		int num  =5;
//		int nums =6;
//		int sum=num%nums;
//		System.out.println(sum);
//		
//		  int x = 175;
//	      int y = -184;
//	   
//	      // get and print their absolute values
//	      System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
//	      System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
//	      System.out.println("Math.abs(-0)=" + Math.abs(-0));
		

	}

}
