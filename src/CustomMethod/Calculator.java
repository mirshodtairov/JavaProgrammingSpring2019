package CustomMethod;

import java.util.*;

import ArrayAssignments.doubleAndTripleIt;
import Day20.divisonTable;

public class Calculator {
	public static void main(String[] args) {
		double n1 = 4;
		double n2 = 3;
		add(n1, n2);
		substruct(n1, n2);
		division(n1, n2);
		muliplication(n1, n2);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();

		System.out.println(
				"Choose operation: \n" + "1 - adding \n" + "2 - substacting \n" + "3 - miltiply \n" + "4 - devide");
		int operator = scan.nextInt();
		switch (operator) {
		case 1:
			add(n2, n2);
			break;
		case 2:
			substruct(n1, n2);
			break;
		case 3:
			muliplication(n1, n2);
			break;
		case 4:
			division(n1, n2);
			break;
		default:
			System.out.println("error not valid number");

		}

	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}

	public static void substruct(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
	}

	public static void division(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(result);
	}

	public static void muliplication(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
	}

}
