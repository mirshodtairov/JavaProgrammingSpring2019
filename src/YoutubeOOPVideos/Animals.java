package YoutubeOOPVideos;

public class Animals {

	String name;
	//String name1;
	int age;
	//int yersInTheZoo;
	String type;
	
	public Animals(int age, String name, String type) {
		this.age=age;
		this.name=name;
		this.type=type;
		
	}

	public void eat() {
		System.out.println(name + " is eating ");
	}

	public void intertain() {
		System.out.println(name + " is intertaining audiance");
	}

	public void living() {
		System.out.println(name + " is inhabitating in the zoo for "+age+" years");
	}

	public void sleep() {
		System.out.println(name + " is tired, " + name + " is going to take a nap");

	}
	

}
