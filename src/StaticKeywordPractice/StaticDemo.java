package StaticKeywordPractice;

public class StaticDemo {

	public static void main(String[] args) {
		
		
		System.out.println(Abc.num);
		Abc .A();

	}

}
class Abc{
	
	static int num = 15;
	
	public static void A(){
		System.out.println("im A  method and i belong to class Abc");
		//System.out.println(num+=num);
	}
}
class Abc2 extends Abc{
	
	public static void A() {
		System.out.println("im A  method and i belong to class Abc2");
		
	}
	
	
}
