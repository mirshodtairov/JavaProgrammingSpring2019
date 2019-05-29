package Day50_inheritance3;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an= new Animal();
		Cat cat= new Cat();
		Dog dog = new Dog();
		duck duck= new duck();
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(2);
		cat.move(4);
		dog.move(5);
		duck.move(7);

	}

}
