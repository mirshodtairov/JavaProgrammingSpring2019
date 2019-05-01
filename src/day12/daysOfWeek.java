package day12;

import java.util.Scanner;

public class daysOfWeek {

	public static void main(String[] args) {

		Scanner sacn = new Scanner(System.in);
		System.out.println("day: ");
		int day = sacn.nextInt();
		switch (day) {
		case 1:
			System.out.println("day is monday");
			break;// exit switch statemant
		case 2:
			System.out.println("day is tue");
			break;// exit switch statemant
		case 3:
			System.out.println("score is wed");
			break;// exit switch statemant
		case 4:
			System.out.println("day is thr");
			break;// exit switch statemant
		case 5:
			System.out.println("day is fri");
			break;// exit switch statemant
		case 6:
			System.out.println("score is sat");
			break;// exit switch statemant
		case 7:
			System.out.println("score is sun");
			break;// exit switch statemant

		}
	}

}
