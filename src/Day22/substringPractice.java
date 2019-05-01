package Day22;

public class substringPractice {

	public static void main(String[] args) {
		String word="java";
//		System.out.println(word.substring(0,1));
//		System.out.println(word.substring(1,2));
//		System.out.println(word.substring(2,3));
//		System.out.println(word.substring(3,4));
//		
//		System.out.println();
//		
//		int i =0;
//		System.out.print(word.substring(i, i+1));
//		i++;
//		System.out.println(word.substring(i, i+1));
//		
//		System.out.println(); 
//		
//		for (int j = 0; j <= 3; j++) {
//			System.out.println(word.substring(j,j++));
			
			for (int b = 3; b >= 0; b--) {	
				System.out.println(word.substring(b, b+1));
			}
						
		}
	}


