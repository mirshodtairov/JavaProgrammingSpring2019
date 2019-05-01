package Day20;

public class oddEven2 {

	public static void main(String[] args) {
		
		for (int weekdays =1; weekdays<=7; weekdays++) {
			
			switch (weekdays) {
			case 1:
			System.out.println(weekdays+"Monday");
			break;
			case 2:
				System.out.println(weekdays+"Tuesday");
				break;
			case 3:
				System.out.println(weekdays+"wednesday");
				break;
			case 4:
				System.out.println(weekdays+"thursdy");
				break;
			case 5:
				System.out.println(weekdays+"friday");
				break;
			case 6:
				System.out.println(weekdays+"saturday");
				break;
			case 7:
				System.out.println(weekdays+"sunday");
				break;
				default:
				System.out.println("finish");
			
			
			}
		}
		

	}

}
