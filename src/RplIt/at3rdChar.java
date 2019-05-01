package RplIt;

public class at3rdChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(at3("lon", "foo"));
	}

	public static String at3(String target, String word) {
		String mix = "";
		if (target.length() > 3) {
			mix = target.substring(0, 3) + word + target.substring(3, target.length());
			return mix;
		}
		return target;

	}

}
