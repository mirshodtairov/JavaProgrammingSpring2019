package Day43_Incapsulation;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Computer comp1 = new Computer();
		 
		 Computer comp2 = new Computer();
		 
		 System.out.println(comp1.toString());
		 System.out.println(comp2.toString());
		 comp1.setBrand("iMac");
		 comp1.setOs("MacOs High Sierra");
		 comp1.setPrice(2020.23);
		 comp1.setBrand("Dell SXP");
		 comp1.setOs("Windows 10");
		 comp1.setPrice(1300.99);
		 System.out.println(comp1.toString());
		 System.out.println(comp2.toString());
		 
		 Computer comp3= new Computer("asus", "windos 7", 1200);
		 System.out.println(comp3.toString());
		 
		 comp3.setOs("winndows 11");
		 System.out.println(comp3.toString());
		 
		 comp3.setPrice(comp3.getPrice()-200);
		 System.out.println(comp3.toString());

	}

}
