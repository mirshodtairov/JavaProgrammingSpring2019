package Day49;

public class Leopard extends animal{
	
	
	public Leopard() {
		super();
		System.out.println("im Leopard constractor");
		setType("leopard");
	}
	
	public Leopard(String type) {
		super(type);
		System.out.println("leopard one agr constructor");
	}

}
