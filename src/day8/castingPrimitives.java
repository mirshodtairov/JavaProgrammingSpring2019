package day8;

public class castingPrimitives {

	public static void main(String[] args) {
		int price = (int)3.4;
		int dollar = (int)price;
		
		System.out.println("price "+price);
		System.out.println("dollars "+dollar);
		 
		
		int count = 130;
		byte byteCount = (byte)count;
		System.out.println("byte counnt; "+byteCount);
		
		
		int x = 3456;
		short y = (short)x;
		System.out.println(x);
		
		
		int result = (int)(500.4/2.0);
		System.out.println(result);
		
		
		
	

	}

}
