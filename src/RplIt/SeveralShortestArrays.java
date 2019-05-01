package RplIt;

import java.util.Arrays;
import java.util.Scanner;

public class SeveralShortestArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(", ");

		String temp = arr[0];
		String word ="";

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() < temp.length()) {
				temp = arr[i];

			}

		}
		
		for (int j = 0; j < arr.length; j++) {
			if (temp.length() == arr[j].length()) {
				word += arr[j]+" ";
			}

		}
		String[] sss=word.split(" ");
		Arrays.sort(sss);
		
			System.out.println(Arrays.toString(sss));
		}
	
	
		
		
	}


