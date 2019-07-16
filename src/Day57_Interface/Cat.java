package Day57_Interface;

public class Cat implements Pet, Callable{

	@Override
	public void respond() {
		System.out.println("mew");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("in the house");
		
		
	}

}
