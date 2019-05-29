package Day46_StaticKeyword;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dinner Mom= new Dinner();
		Dinner Dad= new Dinner();
		Dinner kid= new Dinner();
		
		System.out.println(Dinner.PizzaSlices);
		
		
		Dad.takeASlice();
		kid.takeASlice();
		Mom.takeASlice();
		
		System.out.println(Dinner.PizzaSlices);
		
		System.out.println(Dad.PizzaSlices);
		
		kid.takeASlice(3);
		
		Dad.takeASlice(2);
		
		Mom.takeASlice();
		
		System.out.println(Mom.PizzaSlices);
		
		System.out.println(Dinner.PizzaSlices);
		
		

	}

}
