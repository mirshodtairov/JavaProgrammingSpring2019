package Day46_StaticKeyword;

public class CampusRanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Campus campus1 = new Campus("McLean");
		Campus campus2 = new Campus("Chicago");
		Campus campus3 = new Campus("New Jersey");
		
		
		Campus.campusInfo();// it will run only one time
		Campus.campusInfo();
		Campus.campusInfo();
		Campus.campusInfo();
		
	   System.out.println( Math.pow(2.0, 3.0));

	}

}
