package Day15StringManipulation2;

public class indexOf {

	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("t"));
		System.out.println(word1.indexOf("b"));

		String url = "www.okta.com";
		int x = url.indexOf(".");
		System.out.println("show me index number: " + x);
		System.out.println(url.charAt(x + 3));

		String title = "Java - Google Search";
		int dash = title.indexOf("-");
		System.out.println(dash);
		System.out.println(title.charAt(dash - 2));
		System.out.println(title.charAt(dash + 2));

		String country = "United states of america";
		int states = country.indexOf("states");// it gives 7 coz of the beggining of the word is on 7th pos
		System.out.println(states);

		String word2 = "java, c++, python, tomcat";
		if (word2.contains("c++")) {
			System.out.println("c++ is  there ");
		} else {
			System.out.println("c++ is not there");
		}
		if (word2.indexOf("c++") >= -1){
		System.out.println("c++ is  there ");
	    } else {
		System.out.println("c++ is not there");
	   }
		

	}

}
