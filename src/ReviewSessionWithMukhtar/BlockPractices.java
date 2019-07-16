package ReviewSessionWithMukhtar;

public class BlockPractices {
	static String names;
	
	static {
		names="John";
		
	}
	
	{
		names="Aaron";
		
	}
	public BlockPractices() {
		names="muradil";
		
	}
	
	
	int num1=10;
	
	
	public static void main(String[] args) {
		System.out.println(names);
		
		BlockPractices obj = new BlockPractices();
		
		System.out.println(obj.num1=20);
		System.out.println(obj.names);
	}

}
