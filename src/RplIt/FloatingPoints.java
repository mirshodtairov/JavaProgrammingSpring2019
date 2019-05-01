package RplIt;

import java.util.Arrays;
import java.util.Scanner;

public class FloatingPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		double total = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter score for judge " + (i + 1));
			score[i] = input.nextFloat();
			

		}
		Arrays.sort(score);
		float sum=0;
		for (int i = 1; i < score.length-1; i++) {
			sum+=score[i];
			
			
		}
		System.out.println("enter diff lel: ");
		float d = input.nextFloat();
		if (d>1.2 && d<3.8) {
			total= (sum*d*0.6);
			
		}
		System.out.println(total);

		// FINAL OUTPUT
		 System.out.printf("Total: %.2f", total);
	}
}