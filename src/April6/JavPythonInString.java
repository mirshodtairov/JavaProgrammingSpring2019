package April6;

import java.util.Scanner;

public class JavPythonInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sentence=scan.nextLine();
		int count = 0;
		int count2=0;
	
		for (int i = 0; i < sentence.length()-3; i++) {
			if (sentence.substring(i, i+4).equals("java")) {
				count++;
			}
			
		}
		for (int i = 0; i < sentence.length()-5; i++) {
			if (sentence.substring(i, i+6).equals("python")) {
				count2++;
			}
		}
		if (count==count2) {
			System.out.println(true);}
			else {System.out.println(false);
			}
		}

	}


