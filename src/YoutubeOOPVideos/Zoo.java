package YoutubeOOPVideos;

public class Zoo {

	public static void main(String[] args) {
		Animals animal = new Animals(30, "Tiger", "Predator");

		animal.living();
		animal.eat();
		animal.intertain();
		animal.sleep();

		Fish fish = new Fish(30, "Pompano", "Gulf of Mexico");
		fish.swim();
		fish.rest();

		Bird bird1 = new Bird(12, "Tomas", "Parrot");
		//bird1.fly();
		bird1.name();
		bird1.age();
		
		Chicken chick1 = new Chicken(3, "w", "Travaaydniy");
		chick1.fly();

	}

}
