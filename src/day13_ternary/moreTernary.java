package day13_ternary;

public class moreTernary {

	public static void main(String[] args) {
	String qauality  = "good";
	int rating=(qauality.equals("good"))? 100:1;
	System.out.println("rating:"+rating);
	
	int hour = 6;
	boolean rushHour;
	rushHour=(hour>=4 && hour<=4)? true : false;
	
	System.out.println(rushHour);
	
	System.out.println(hour+" is rush hour? "+rushHour);
	
//	int AMHour;
//	String  AMRushhour = (AMHour >=6 && AMHour <= 9)? "yes" : "no";
	
	

	}

}
