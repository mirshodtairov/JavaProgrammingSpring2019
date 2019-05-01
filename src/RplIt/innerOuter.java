package RplIt;

public class innerOuter {

	public static void main(String[] args) {
		int[] outer = { 1, 3, 6, 8, 3 };
		int[] inner = { 1, 3, 8 };
		int count = 0;

		for (int i = 0; i < outer.length; i++) {
			for (int j = 0; j < inner.length; j++) {
				if (outer[i] == inner[j]) {
					count++;

				}

			}
			

		}
		if (count >= inner.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}

}
