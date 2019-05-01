package day12;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		double num1;
		double num2;
		String report;
		Scanner scan = new Scanner(System.in);
		System.out.println("enyter the number ");
		num1 = scan.nextDouble();
		System.out.println("enyter second number ");
		num2 = scan.nextDouble();

		System.out.println("select operator: + - * % /");
		String operator = scan.next();
		double result = 0.0;
		switch (operator) {
		case "*":
			result = num1 * num2;
			break;

		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		case "/":
			result = num1 % num2;
			break;
		default:
			System.out.println("it is: " + result);
			break;

		}
		System.out.println("it is: " + result);
		

	}
}
