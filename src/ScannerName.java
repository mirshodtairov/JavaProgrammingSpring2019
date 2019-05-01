import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, whats is your name?");
		
		String name = scan.next();
		
		System.out.println("nice to meet you" + name);
		

	}

}
