import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");

		try {

			int nums = scan.nextInt();
			System.out.println("this is your number: " + nums);
		} catch (Exception e) {
			System.out.println("i said number you dunmb ass");
		}
		
		try {
			int a []= {1};
		System.out.println(a[0]);
		}catch (NullPointerException e) {
			System.out.println("your arrays valiue is null");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bounds Exception");
		}catch (Exception e) {
			System.out.println("there was some mistake");
		}
		
		
		
		

	}

}
