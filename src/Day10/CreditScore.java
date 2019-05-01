package Day10;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your credit scoore:");
		int creiditsScore = 490;
		
		if(creiditsScore >= 750 && creiditsScore <= 850){
			System.out.println("exelent");
		}else if(creiditsScore >= 700 && creiditsScore <= 749) {
			System.out.println("good");
		}else if(creiditsScore >= 650 && creiditsScore <= 699) {
			System.out.println("fair");
	    }else if(creiditsScore >= 550 && creiditsScore <= 650) {
			System.out.println("poor");
		}else if(creiditsScore >= 450 && creiditsScore <= 550) {
		    System.out.println("bad");
			}
			
				
			}
		

	
}