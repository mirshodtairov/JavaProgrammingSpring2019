package Day57_Interface;

public class dog implements Pet,  Callable {

	@Override
	public void respond() {
		System.out.println("dog is responding woof-voof");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("dog is keeped in cage!!!!");
		
	}
	
	

}
