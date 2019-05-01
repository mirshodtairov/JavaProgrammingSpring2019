package Day16StingManipulation;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url;
		System.out.println("enter the url:");
		Scanner scan = new Scanner(System.in);
		url = scan.next();

		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		} else {
			System.out.println("url is wrong");
			return;

		}//if (url.charAt(url.length()-4)=='.');
		int dotIndex= url.length()-4;
		
		if (url.charAt(dotIndex)=='.') {
			System.out.println(". is there ");
		}else {System.out.println(". might be misplased");}
		
		String domain = url.substring(4, dotIndex);
		System.out.println(domain);
		String extension=url.substring(dotIndex+1, url.length());
		System.out.println(extension);
		
		System.out.println(domain+"."+extension);

	}

}
