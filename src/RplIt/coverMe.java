package RplIt;

public class coverMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String coverString(String main, String coverME) {

		if (main.contains(coverME)) {
			return main.replace(coverME, "[" + coverME + "]");
		}
		return main;
	}

}
