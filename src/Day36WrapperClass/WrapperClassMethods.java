package Day36WrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE );
		System.out.println(Byte.MAX_VALUE);
		
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int count = Integer.parseInt("33465653");
		System.out.println("Count  "+count);
		 
		int  count2 = Integer.valueOf("434652");//this returns Int
		System.out.println("count "+count2);//this returns Integer 
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('@'));
		System.out.println(Character.isAlphabetic('p'));
		System.out.println(Character.isAlphabetic('5'));
		String str ="java";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(2)));
		
	   String word = "akwjf1134nsdbn";
	   for (int i = 0; i < word.length(); i++) {
		   if(Character.isDigit( word.charAt(i) )) {
				System.out.print(word.charAt(i));
			}
	}
		

	}

}
