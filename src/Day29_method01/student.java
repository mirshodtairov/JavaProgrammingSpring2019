package Day29_method01;

public class student {

	public static void main(String[] args) {
		study("book");
		num(20);
		for (int i = 0; i < 10; i++) {
			say();
			
		}
		code();


	}

	public static void study(String smth) {
		System.out.println("Student is studying " + smth);
	}

	public static void num(int num) {
		System.out.println("They read " + num + " books a month");

	}

	public static void say() {
		System.out.println("say hello");

	}
	public static void code() {
		System.out.println("Inside Code Method");
		System.out.println("Student is coding java");
	}
	
}