package Day24;

public class taskWithChars {

	public static void main(String[] args) {
		String str = "wooden spoon";
		char[] chars = str.toCharArray();
		for (char c : chars) {
			{
				if (c == 'o') {
					System.out.print("*");
				} else {
					System.out.print(c);

				}

			}

		}
	}
}
