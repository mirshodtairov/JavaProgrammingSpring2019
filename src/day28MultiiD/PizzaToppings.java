package day28MultiiD;

import java.util.Arrays;

public class PizzaToppings {

	public static void main(String[] args) {

		String pizzas[][] = { { "pineapple", "pepperroni" }, { "anchovies", "mushroom", "olives" }, { "4 cheese" },
				{ "chiken", "tomatoes", "onions" }, { "green peppers", "shrimp", "brocolli" } };

		// System.out.println(Arrays.toString(pizzas[0]));

		for (String pizza[] : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
	}
}