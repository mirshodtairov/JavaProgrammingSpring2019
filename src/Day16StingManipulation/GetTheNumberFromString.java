package Day16StingManipulation;

public class GetTheNumberFromString {

	public static void main(String[] args) {
		String sentence = "i wrote [236] lines if codes today";
		int start = sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		
		String num = sentence.substring(start, end);
		System.out.println(num);
		
		System.out.println(sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));		
		
		
		String word2="lets drink coffee";
		String word3=word2.substring(word2.indexOf('c'));
		System.out.println(word3);

	}

}
