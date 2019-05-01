package CoddingBat;

public class xyzMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xyzMiddle("AvvAxyzBbbvvB"));

	}

	public static boolean xyzMiddle(String str) {
		if (str.contains("xyz")) {
			int a = str.indexOf("xyz");

			String beg = str.substring(0, a);
			String end = str.substring(a + 3, str.length());
//			System.out.println(beg);
//			System.out.println(end);
			if (beg.length() == end.length()) {
				return true;
			} else if (beg.length() - 1 == end.length()) {
				return true;

			}else if (beg.length()== end.length()-1)

			return true;

		}
		return false;

	}

}
