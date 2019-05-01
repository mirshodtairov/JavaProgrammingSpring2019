package Day31CustomMethodsPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		double first = scan.nextDouble();
		System.out.println("Enter Second Number:");
		double second = scan.nextDouble();
		System.out.println("select operator: + - * / %");
		String operator = scan.next();

		switch (operator) {
		case ("+"):
			add(first, second);
			break;
		case ("-"):
			substract(first, second);
			break;

		case ("*"):
			multiply(first, second);
			break;

		case ("/"):
			devide(first, second);
		case ("%"):
			remind(first, second);
			break;
		default:
			System.out.println("invalid nums");

		}

	}

	public static void add(double num1, double num2) {
		System.out.println("Adding result: " + (num1 + num2));
	}

	public static void substract(double num1, double num2) {
		System.out.println("Substraction result: " + (num1 - num2));
	}

	public static void multiply(double num1, double num2) {
		System.out.println("Multiplication Result: " + num1 * num2);
	}

	public static void devide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("cannot be devided by 0");
			return;
		}
		System.out.println("Devision result: " + (num1 / num2));
	}

	public static void remind(double num1, double num2) {

		System.out.println("remiding result :" + (num1 % num2));
	}

}
