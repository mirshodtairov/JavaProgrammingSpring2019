package InterfacePrevBatch;

public interface bike extends SuperBike, mtocicle {

	public abstract void StepOnPaddle();

	public abstract void changeDirection();
	//This are default methods
	public default void StartTheBike() {
		System.out.println("im StartTheBike default methods in interface but u can reach me even without overriding me!!!");
	}
	
	public default void StopTheBike() {
		System.out.println("im StopTheBike default methods in interface but u can reach me even without overriding me!!!");
	}
	
	public static void race() {
		System.out.println("Im racing static method of Bike Interface");
	}

}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 class MountainBike implements bike {
	
	
	int gear;
	String name;
	public MountainBike() {
		
	}

	public MountainBike(int gear, String name) {
		
		this.gear = gear;
		this.name = name;
	}
	

	

	public void RideOnMountain() {
		System.out.println("riding on mountain MountainBike");

	}

	@Override
	public void StepOnPaddle() {
		System.out.println("Stepping on pedal MountainBike");

	}

	@Override
	public void changeDirection() {
		System.out.println("changing direction MountainBike");

	}

	@Override
	public void flip() {
		System.out.println("im flippind MountainBike");
		
	}

	@Override
	public int jump() {
		 System.out.println("jumping in Mountain Bike");
		return 1;
		
	}

	@Override
	public void Spin() {
		System.out.println("im Spinning MountainBike");
		
	}
	
	public void StartTheBike() {
		System.out.println("i was default StartTheBike in interface, now im method of Mountain Bike Class");
	}
	public void StopTheBike() {
		System.out.println("i was default StopTheBike in interface, now im method of MyBike Class");
	}
	public static void race() {
		System.out.println("Im racing static method of mountainBike Class");
	}



	

}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//CONCTREAT CLASS


class MyBike extends MountainBike{

	



	@Override
	public void flip() {
		System.out.println("im flipping form MyBike");
		
	}

	@Override
	public int jump() {
		System.out.println("jumping in MyBike");
		
		return 2;
	}

	@Override
	public void Spin() {
		System.out.println("im Spinning form Mybike");
		
	}
	public void StepOnPaddle() {
		System.out.println("Stepping on pedal MyBike");

	}
	
}