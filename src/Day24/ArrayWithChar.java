package Day24;

public class ArrayWithChar {

	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}

		String str = "wooden spoon";
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c);

		}
		System.out.println();
		str = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
			str += chars[i];
		}
		System.out.println(str);
		

	} 
	    
}