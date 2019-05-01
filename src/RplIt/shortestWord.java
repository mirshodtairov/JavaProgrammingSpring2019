package RplIt;

import java.util.Scanner;

public class shortestWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
		String red = null;
		String string = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				
			if (str[i].length() > str[j].length()) {
				string = str[j];

			}
			
			
			}
		}
		System.out.println(string);

	}
}