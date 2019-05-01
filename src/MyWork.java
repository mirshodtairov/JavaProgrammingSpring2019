import java.util.Scanner;

public class MyWork {

	public static void main(String[] args) {
		
		int myCoint;
		int myMoney;
		int total;
		Scanner scan = new Scanner(System.in);
        System.out.println("My total Coints is: ");
        myCoint = scan.nextInt();
        
       
        System.out.println("My total Money is: ");
        myMoney = scan.nextInt();
        
        
        total = myCoint+myMoney;
        System.out.println("My Total: "+total);
   
	} 
	
}
