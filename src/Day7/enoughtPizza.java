package Day7;

public class enoughtPizza {
	
public static void main(String[] args) {
	
	int pizzacount = 30;
	int studentCount = 145;
	
	boolean isEnought = pizzacount * 8 / studentCount <=2;
	
	System.out.println("is Enought: "+isEnought);
	
}
}
