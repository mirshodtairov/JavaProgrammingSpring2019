package RplIt;

public class count_appearance {
	public static void main(String[] args) {
		String [] str= {"a","foo","bar","foo","bla"};
		String str1="foo";
		System.out.println(count_appearance(str,str1));

	}

	public static int count_appearance(String[] arr, String t) {
		int count = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i].equals(t)) {
				count++;

			}

		}
		return count;

	} // end count_appearance

}
