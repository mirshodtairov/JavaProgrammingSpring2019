package AbstractClass01;

public abstract class inventor extends Laptop {

	@Override
	public void takPhoto() {
		System.out.println("new "+ laptop+" will take photoes");
		
	}

	@Override
	public void bend() {
		System.out.println("new "+ laptop+" will bend and exucute same fitures as Tablet");
	
		
	}

	@Override
	public void draw() {
		System.out.println("new "+laptop+" will be avilable with inserted pen");
		
	}
	

}
