package PolimorphizPreBatch;

import InterfacePrevBatch.mammal;

public class Animal implements mammal {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal cow = new Cow();
		
		cat.speak();
		dog.speak();
		cow.speak();
		cat.eat();
		dog.eat();
		cow.eat();
	}

	public void speak() {
		System.out.println("Speaking in Animal Class");
	}

	@Override
	public void eat() {
		System.out.println("i am eat method in Animal class, i was overriden from Mammal interface");
		
	}

}

class Dog extends Animal {

	public void speak() {
		System.out.println("Dog is speaking");
	}

	@Override
	public void eat() {
		System.out.println("dog eating");
	}

}

class Cat extends Animal {

	public void speak() {
		System.out.println("Cat is speaking");

	}
	public void eat() {
		System.out.println("cat eating");
	}

}

class Cow extends Animal {
	
	public void speak() {
		System.out.println("Cow is speaking");

	}
	public void eat() {
		System.out.println("cow eating");
	}
}