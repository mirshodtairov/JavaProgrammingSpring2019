package Day53_Inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city = new City(345, "London");
		
		City city2= new City(33344, "FairFax");
		Capital capital2= new Capital(532, "Rich,omd", 3423554L);
		
		city2.letBuildARoad();
		capital2.letBuildARoad();
		

	}

}
