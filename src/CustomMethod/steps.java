package CustomMethod;

public class steps {

	public static void main(String[] args) {
		steps(-4);

	}

	public static void steps(int x) {

		if (x == 0) {
			 {
				System.out.println("sit");

			}
		} else if (x > 0) {
			for (int i = 1; i <=x; i++)
			System.out.println("Step " + i);

		} else {
			for (int n = 1; n <= x*(-1); n++) {
				System.out.println("Jump " + n);

			}

		}
	}

}
