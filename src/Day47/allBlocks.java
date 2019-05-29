package Day47;

public class allBlocks {
	
	int nonStatic=10;
	static int staticInt=10;
	
	static {
		System.out.println("Static block i run 1st and only once");
		staticInt--;
	}
	
	{
		System.out.println("INIT block - i run each time object is created Before the constarctor");
		nonStatic+=5;
		staticInt+=5;
	}
	
	public allBlocks(){
		System.out.println("CONSTACTOR - I run time object is created aftre INIT block ");
		nonStatic+=3;
		staticInt+=3;
		
	}

}
