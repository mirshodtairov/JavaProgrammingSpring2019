package Day52_Inheritance04;

public class FinalVeriables {
	
	//final int Roadster_MAX_RANGE ;             // final constant veritable must be initialized right away  
	                                             //or it constarctor
	
	
	
	final int Roadster_MAX_RANGE ;
	
	final int MDEL_3_MAX_SPEED=240;
	final int MODEL_X_Passengers;
	final String JAN= "JANUARY";
	
	
	public static final String COMPANY_NAME ="CYBERTEK";
	public static final String ADMIN_USER;
	
	static {
		ADMIN_USER= "AddminUser@gmail.com";
	}
	
	public FinalVeriables() {
		
		Roadster_MAX_RANGE=610;
		
		{
			MODEL_X_Passengers=7;
		}
		
	}
	
	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT=5;
		final double PI = 3.1415;
		System.out.println(MAX_PASSENGERS_COUNT);
		
        //MAX_PASSENGERS_COUNT=6;                // can  not not be changed
		
		final int SSN;
		SSN = 3232432;
		
		FinalVeriables fv= new FinalVeriables();
		System.out.println(fv.MDEL_3_MAX_SPEED);
		
		
		//SSN++;                                 // can not be changed
		
		System.out.println("company name "+COMPANY_NAME);
		System.out.println("company name: "+FinalVeriables.COMPANY_NAME);
		System.out.println(ADMIN_USER);
		
	}

}
