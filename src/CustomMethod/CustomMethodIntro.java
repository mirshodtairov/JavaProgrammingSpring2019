package CustomMethod;

public class CustomMethodIntro {

	public static void main(String[] args) {
		howAreYou();
		reply();
		SeeYou();
		System.out.println("See you letter");

		for (int i = 0; i < 10; i++) {
			sayHello();

		}
		sayHelloTo("HALILI");
		howMuch(300);
	    
		String SomeRandonName="MARUf";
		sayHelloTothis(SomeRandonName);
		
		Calculator.muliplication(34, 43);
		
		
		
		
	}

	public static void Answer() {
		System.out.println("Hi, how are you?");
	}

	public static void sayHello() {
		System.out.println("Hello");
	}

	public static void howAreYou() {
		System.out.println("Hello, haow are you");
	}

	public static void reply() {
		System.out.println("Im good, how are you?");
	}

	public static void SeeYou() {
		System.out.println("Bye, have a nice day");
	}

	public static void sayHelloTo(String name) {
		System.out.println("Hello " + name);
	}

	public static void howMuch(int num) {
		System.out.println("i need " + num + " dollars");
	}

	public static void sayHelloTothis(String name) {
		System.out.println("Hello " + name);
	}
}
