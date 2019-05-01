package day12;

import java.util.Scanner;

public class SwitchWheather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the weather is outside: ");
		String whether = scan.next();
		switch (whether) {
		case "sunny":
			System.out.println("go outside");
			break;// exit switch statemant
		case "hot":
			System.out.println("go to the beach");
			break;// exit switch statemant
		case "rainy":
			System.out.println("go shopping");
			break;// exit switch statemant
		case "snowing":
			System.out.println("change tires");
			break;// exit switch statemant
		case "windy":
			System.out.println("stay home");
			break;// exit switch statemant
		default:
			System.out.println("code java in other weather");
			break;
		}
		System.out.println("end of program");

	}

}
