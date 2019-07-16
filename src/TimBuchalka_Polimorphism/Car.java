package TimBuchalka_Polimorphism;

public class Car {

	private boolean engine;
	private int cylinders;
	private int wheel;
	private String name;

	public Car(int cylinder, String name) {
		this.cylinders = cylinder;
		this.name = name;
		this.wheel = 4;
		this.engine = true;

	}

	public int getCylinders() {
		return cylinders;
	}

	
	public String getName() {
		return name;
	}
	
	
	public void StartEngie() {
		System.out.println("CAR is Startng Engine!!!");
		
	}
	public void Eccelerate() {
		System.out.println("CAR is eccelerating!!!");
	}
	public void Break() {
		System.out.println("CAr is Breaking!!!");
	}
	

}
class BMW extends Car{

	public BMW(int cylinder, String name) {
		super(cylinder, name);
		
	}
	
	public void StartEngie() {
		System.out.println("BMW is Startng Engine!!!");
		
	}
	public void Eccelerate() {
		System.out.println("BMW is eccelerating!!!");
	}
	public void Break() {
		System.out.println("BMW is Breaking!!!");
		
	}
	
		
}
class Honda extends Car{
	public Honda(int cylinder, String name) {
		super(cylinder, name);
		// TODO Auto-generated constructor stub
	}
	public void StartEngie() {
		System.out.println("HONDA is Startng Engine!!!");
		
	}
	public void Eccelerate() {
		System.out.println("HONDA is eccelerating!!!");
	}
	public void Break() {
		System.out.println("HONDA is Breaking!!!");
	}
}
class AstonMartin extends Car{
	public AstonMartin(int cylinder, String name) {
		super(cylinder, name);
		// TODO Auto-generated constructor stub
	}
	public void StartEngie() {
		System.out.println("ASTON_MARTIN is Startng Engine!!!");
		
	}
	public void Eccelerate() {
		System.out.println("ASTON_MARTIN is eccelerating!!!");
	}
	public void Break() {
		System.out.println("ASTON_MARTIN is Breaking!!!");
	}
	
	
}

