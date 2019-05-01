package Day15StringManipulation2;

public class StartsEndsWith {

	public static void main(String[] args) {
		String word1="eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("eclipse"));
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("eclipse"));

		System.out.println(word1.startsWith("a"));
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("s"));
		System.out.println(word1.endsWith("eclips"));
		
		String name="Mr. Jackson";
		
		if (name.startsWith("Mr.")){
			System.out.println("man");}
	    else if (name.startsWith("Mrs.")) {
	    	System.out.println("lady");}
	    else {System.out.println("non gender");
			
		}
		
	}

}
