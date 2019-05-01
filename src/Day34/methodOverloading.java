package Day34;

public class methodOverloading {

	public static void main(String[] args) {
		add(24, 34);

	}

	public static void add(int num1, int num2) {
		int reuslt = num1 + num2;
		System.out.println(reuslt);
	}

	public static void add(double num1, double num2) {
		double reuslt = num1 + num2;
		System.out.println(reuslt);

	}

	public static void add(String str1, String str2) {
		String reuslt = str1 + str2;
		System.out.println(reuslt);

	}
}

//this called method overloading