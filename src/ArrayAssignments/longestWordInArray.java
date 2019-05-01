package ArrayAssignments;

import java.util.Scanner;

public class longestWordInArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		String length = "";
		for (int i = 0; i < 5; i++) {
			words[i] = input.nextLine();
		
				if (words[i].length()>length.length()) {
					length=words[i];
					
				}
			}
		
		System.out.println(length);

		}

	}

