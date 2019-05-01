package ArrayAssignments;

public class arrayLength {

	public static void main(String[] args) {
		String[] family = { "Mirshod", "Mansur", "Maruf", "Mukhamad", "Adolat" };
		for (String str : family) {
			if (str.contains("M"))
				continue;
			System.out.println(str);

		}

	}

}
