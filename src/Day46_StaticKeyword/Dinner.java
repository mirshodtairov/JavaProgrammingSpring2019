package Day46_StaticKeyword;

public class Dinner {
	
	public static int PizzaSlices= 8;
	
	
	
	public void takeASlice() {
		PizzaSlices--;
	}
	
	public void takeASlice(int count) {
		PizzaSlices-=count;
	}

}
