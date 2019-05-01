import java.util.Scanner;

public class threeChoiceOptions {
	
	

	int option1;
	int option2;
	int option3;
	

	public static void main(String[] args){
		System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");
	     
	    
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int option1 = scan.nextInt();
	    if (option1==1){System.out.println("user selected 1");}
	    
	   
	    int option2 = scan.nextInt();
	    if (option2==2){System.out.println("user selected 2");}
	    
	    int option3 = scan.nextInt();
	    if (option3==3){System.out.println("user selected 3");
	    
	    }

	}

}
