package Day15StringManipulation2;

public class IndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash= list.indexOf("-");
		System.out.println(firstDash);
		
		int seconddash=list.indexOf("-", 5);
		System.out.println(seconddash);
		
		int thirddash=list.indexOf("-", 14);
		System.out.println(thirddash);
		
		int fourthdash= list.indexOf("-", 15);
		System.out.println(fourthdash);
		
		int lastdash= list.lastIndexOf("-");
		System.out.println(lastdash);
		

	}

}
