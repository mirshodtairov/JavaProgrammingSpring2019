package day11;

import java.util.Scanner;

public class calulator {

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
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;

		}
		System.out.println("result "+result);

	}
}
