package PolimorphizPreBatch;

public class ClosingItem {
	public static void main(String[] args) {
		shirt sh = new shirt("Abercrombie", 23, 2);
		ClosingItem c1 = new shirt("polo", 20, 32);
		ClosingItem c2 = new ClosingItem("polo", 20);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		ClosingItem c3= new hat("just name", 34, "fashion");
		System.out.println(c3.toString());
//		hat c4 = (hat) new ClosingItem("VChi", 32);
//	    System.out.println(c4.toString());
		shirt sh1 = (shirt) new ClosingItem("2A", 22);
		System.out.println( sh1.toString());

	}

	String name;
	int price;

	public ClosingItem(String name, int price) {
		this.name = name;
		this.price = price;

	}

	@Override
	public String toString() {
		return "ClosingItem [name=" + name + ", price=" + price + "]";
	}
	
	

}
//_____________________________________________________________________________________________

class shirt extends ClosingItem {
	int size;

	public shirt(String name, int price, int size) {
		super(name, price);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "shirt [size=" + size + ", name=" + name + ", price=" + price + "]";
	}

	public void printShitrInfo() {
		System.out.println("printing shirt info");
	}

}

//_____________________________________________________________________________________________

class hat extends ClosingItem {
	String type;

	public hat(String name, int price, String type) {
		super(name, price);
		this.type = type;

	}
	public String toString() {
		return "hat [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}