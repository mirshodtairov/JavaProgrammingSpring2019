package Day55_abstarction;

public class SailBoat extends Vehicle {

	public SailBoat(int wheels, double type, String name, String powerSource) {
		super(0, 3.5, "AjS", "wind");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("going towards the sun");
		
	}
	
	
	

	
	
}
class bike extends Vehicle{

	public bike(int wheels, double type, String name, String powerSource) {
		super(wheels, type, "bike", "person");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("cicling");
		
	}
	
	
	
}
