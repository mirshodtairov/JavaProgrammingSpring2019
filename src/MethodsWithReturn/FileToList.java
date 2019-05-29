package MethodsWithReturn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.*;



public class FileToList {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Products.txt");
		Scanner  scan = new Scanner(file);
		//System.out.println(scan.hasNextLine());
		//System.out.println(scan.nextLine());
		ArrayList<String> data= new ArrayList<>();
		
		
		//System.out.println(scan.nextLine());
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
			data.add(line);
			
		}
		System.out.println("size of data "+data.size());
		
		
		

	}

}
