import java.util.Scanner;

public class secondsConverter {

	public static void main(String[] args) {
		int inputSeconds, hours, minutes, seconds;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter seconds: ");{
        inputSeconds = scan.nextInt();
        
        hours = inputSeconds / 3600;
        inputSeconds = inputSeconds % 3600;
        minutes = inputSeconds / 60;
        inputSeconds = inputSeconds % 60;
        seconds = inputSeconds;
        
        System.out.println(hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
        
        
        	
			
	    
		}
	}

}
