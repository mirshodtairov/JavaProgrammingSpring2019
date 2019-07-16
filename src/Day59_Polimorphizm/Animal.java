package Day59_Polimorphizm;

public class Animal {
	public void Talk(){
		System.out.println("animal is talking");
	}
	

}
class Zebar extends Animal{
	public void Talk(){
		System.out.println("Zebra is talking");
	}
	
}
class Tiger extends Animal{

	public void Talk(){
		System.out.println("Tiger is talking");
	}
}
class Zoo{
	
	
public static void main(String[] args) {
		Animal animal = new Animal();
		//This is not polimorphism
		
		Animal tiger = new Tiger();
		Animal zebra = new Zebar();
		
		tiger.Talk();
		zebra.Talk();
		
		Animal[] animals= new Animal[2];
		animals[0]= new Tiger();
		animals[1]= new Zebar();
		
		animals[0].Talk(); 
		animals[1].Talk(); 
		
		
		
		
		
	}
}
