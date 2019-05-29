package Day52_Inheritance04;

public class FinalMethod {
	
	public final void method1() {
		System.out.println("Final Method 1");
	}
	
	public final static void StaticMethods(String word) {
		System.out.println("StaticMethod"+word);
	}

}
class Sub extends FinalMethod{
	//can not override since it is a final  method
//	public void method1() {
//		System.out.println("Iverriden method 1");
//		
//	}
	
	//OVERLOADED 
	public final void method1(String str) {
		System.out.println("Final Method 1");
	}
	public static void StaticMethods(String word, int nums) {
		System.out.println("StaticMethod"+word);
	}
	public final static void StaticMethods(String word, double in) {
		System.out.println("StaticMethod"+word);
	}

}
