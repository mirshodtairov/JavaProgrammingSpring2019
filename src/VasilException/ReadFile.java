package VasilException;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {// throws Throwable
		// TODO Auto-generated method stub

		File file = new File("products.txt");
		Scanner scanner=null;
		try {

			scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (Throwable t) {
			System.out.println("File not found");
			t.printStackTrace();

		}finally {
			try {
			scanner.close();
			}catch (NullPointerException n) {
				System.out.println("Null Pointer Exception in finally blocck");
			}
		}

	}

}
