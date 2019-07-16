package Day53_Inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		int i = 1234567890;    
		float f = i;    
		System.out.println(i - (int)f);
		
		
		// TODO Auto-generated method stub
		City city = new City(345, "London");
		
		City city2= new City(33344, "FairFax");
		Capital capital2= new Capital(532, "Rich,omd", 3423554L);
		
		city2.letBuildARoad();
		capital2.letBuildARoad();
		

	}

}
