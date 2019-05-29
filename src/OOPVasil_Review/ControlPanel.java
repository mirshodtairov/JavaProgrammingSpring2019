package OOPVasil_Review;

import java.util.Scanner;

public class ControlPanel {
	public static void main(String[] args) {
		int cardNumber=0;
		HotDogStand[] stand= new HotDogStand[3];
		stand[0]=new HotDogStand(0, 0);
		stand[1]=new HotDogStand(1, 0);
		stand[2]=new HotDogStand(2, 0);
		
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Command");
		
		String comman = scan.next();
		
		if (comman.equals("sold")) {
			System.out.println("Enter the card number: ");
			
			cardNumber= scan.nextInt();
			stand[cardNumber].justSold();
			
			
		}else if (comman.equals("print")) {
			System.out.println("Enter cart number");
			cardNumber= scan.nextInt();
			System.out.println("cart sold "+stand[cardNumber].getSold());
		}else if(comman.equals("print all")) {
			System.out.println("Total sold "+HotDogStand.getTotal());
		}else {
			return;
		}

	}
	}
		

}
/*- Main method should asks user to enter command. 
- A command can be "sold", which in result would ask for cart number and increment its pointer. 
- Another command can be "print", which will also asks for cart number and print how many hotdogs that cart sold. 
- One command would be "print-all", that will result in printing how many HotDogs were sold by all carts. 
- Call Static method of HotDogStand for "print-all". Lastly, anything else will terminate the program.


*/