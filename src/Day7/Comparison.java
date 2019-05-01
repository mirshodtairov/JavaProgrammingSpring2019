package Day7;

public class Comparison {

	public static void main(String[] args) {

		System.out.println(10==10);
		System.out.println(20==20);
		int search = 5000;
		System.out.println(search == 5000);
		
		double balace = 150.0;
		boolean broke = balace<=0;
		System.out.println(broke);
		
		double transaction = 155.5;
		broke = (balace - transaction) <0;
		System.out.println(broke);
		
	}

}
