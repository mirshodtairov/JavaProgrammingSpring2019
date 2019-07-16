package Day57_Interface;

public class BMWi8 implements Electric, Aotonomous  {
	
	
	

	@Override
	public void charge() {
		System.out.println("BMWi8 is charging at home");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("this car self driving");
		
	}

}
