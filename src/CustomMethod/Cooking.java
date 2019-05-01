package CustomMethod;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		todayCooking("Pilav");
		ingredients("Rice, Beef, Carrots, Onions, ChickPeace, Garlic");
		time(60);
		theWayOfCooking();
		ready();
		Calculator.add(2, 4);

	}
	
	
	public static void todayCooking(String foodname) {
		System.out.println("today we are cooking "+foodname);
	}
	public static void ingredients(String ingredients) {
		System.out.println("we will need: "+ingredients);
	}
	public static void time(int time) {
		System.out.println("You will need to cook it for "+time+" minutes");
	}
	
	public static void theWayOfCooking() {
		System.out.println("Fry meat first, tost onions and fry it with meat together, pour some water, and close lid, let onions melt"
				+ "pour some more water and toast carrot, after put rice and cover it to the top rice eith water, after 30 min flop the rice"
				+ "and wiat another 20 min");
	}
	
	public static void ready() {
		System.out.println("Your food is ready, enjoy");
	}

}
