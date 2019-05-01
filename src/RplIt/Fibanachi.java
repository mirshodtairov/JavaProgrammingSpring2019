package RplIt;

public class Fibanachi {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			a = b;
			b = sum;
			sum = a + b;
		}
		System.out.println(sum);

	}

}
