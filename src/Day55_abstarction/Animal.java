package Day55_abstarction;


public abstract class Animal {
	
	private String name;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void speak();
	public abstract void eat();
	
	public Animal(String name) {
		
	}

}



class cat extends mammal {

	public cat(String name) {
		super("barsik");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("cat says Meoooowww");

	}

	@Override
	public void eat() {
		System.out.println("Im cat i eat 3 times a day");
		
	}

	@Override
	public void produceMilk() {
		System.out.println("Mammal produce milk and feeds with milk");
		
	}

}
class dog extends Animal{
	
	public dog(String name) {
		super("Sharik");
	}

	@Override
	public void speak() {
		System.out.println("Dog says woof woof");
		
	}

	@Override
	public void eat() {
		System.out.println("Im dog i eat 5 time a day");
		
	}
	
	
}



