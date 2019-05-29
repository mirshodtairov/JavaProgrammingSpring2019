package Day42CustomClasses_Incapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger burger = new Burger();
		burger.name="cowboy";
		String[] ings = {"onions", "american cheese", "pickles", "lettuce", "b7 souce"};
		burger.ingredients=ings; 
		
		System.out.println(burger.name);
		System.out.println(Arrays.toString(burger.ingredients));
		System.out.println(burger.ingredients[0]);
		
		for (int i = 0; i < burger.ingredients.length; i++) {
			System.out.print(burger.ingredients[i]+", ");
			
		}

	}

}
