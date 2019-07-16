package StaticObjectCounter;

public class A {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		obj3.Counter();
	}
	
	
	
	static int i=0;
	
	public A(){
		i++;
		
	}
	
	public void Counter() {
		System.out.println(i);
		
	}

}
