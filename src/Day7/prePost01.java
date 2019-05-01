package Day7;

public class prePost01 {

	public static void main(String [] args) {
		
		int num = 0;
		int num2 = num++;
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		
		int apples = 6;
		int bananas = apples++;
		int pears = ++apples;
		System.out.println("Apples "+apples);
	    System.out.println("Bananas "+bananas);
	    System.out.println("Pears "+pears);
	    
	    
	    int p1 = 10;
	    int sum = p1++ +5;
	    System.out.println(p1);
	    System.out.println(sum);
	    
	    
	    int x = 8;
	    int y = 5;
	    int xy = x++ + ++y;
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(xy);
	    	 
	}
}
