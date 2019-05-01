package Day17_whileloops;

public class stairsLength {

	public static void main(String[] args) {
		String stairs="*";
		while (stairs.length()<=10) {
			System.out.println(stairs);
			stairs= stairs +"*";
			
		}
		String stairs1="*";
		int num=1;
		while(num<=10) {
			System.out.println(stairs1);
			stairs1+="*";
			num++;
			
		}

	}

}
