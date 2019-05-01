package Day33;

public class AgeCalculator {

	public static void main(String[] args) {
		calculateAge(2025);
		

	}
	public static int calculateAge(int year) {
		if (year <=0  || year>2019) {
			System.out.println("invalid year");
		     return 0;}
		if (2019-year < 14 && 2019-year > 1){
			System.out.println("child");
		}else if (2019-year < 25 && 2019-year > 15) {
			System.out.println("yuongster");
		}else if (2019-year < 64 && 2019-year > 26) {
			System.out.println("adult");
		
			
		}else {
			System.out.println("senior");
			
		}
		return year;
		
	}

}
