import java.util.Scanner;

public class canada {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String capital;
        System.out.println("what is the capital of Canada?");
        capital = scan.next();
        
        
        if(capital.equals("Ottawa")) //capital.equalsIgnoreCase => it will ignore all 
        	                           //of the case differences and type true 
        {
         System.out.println("your answer is correct");
        }else {
            System.out.println("you are not right");
            
            
        }
       
    }

}