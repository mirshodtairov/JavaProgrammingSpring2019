package OOPSavichJavaPractice;

public class village {

	public static void main(String[] args) {
	   Pet pet1 = new Pet();
	   pet1.Pet("Murka", 2, 1.4);
	   System.out.println(pet1.getAge());
	   System.out.println(pet1.getName());
	   System.out.println(pet1.getWeight());
	   
	   Pet pet2  =  new Pet("Pishak", -1, 42.5);
	   System.out.println(pet2.getAge());
	  
	  

	}
}