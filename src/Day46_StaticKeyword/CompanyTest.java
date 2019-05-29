package Day46_StaticKeyword;import day11.calulator;

public class CompanyTest {

	public static void main(String[] args) {
		System.out.println(Compani.cname);
		
		
		System.out.println(Compani.cname.toUpperCase());
		
		Compani.cname.toUpperCase();//THIS TO METHODS ARE SIMILAR SINTATICLI
		System.out.println();      //THEY BOTH HAVE STATIC VERIABLE AND METHODS
		
		Compani c= new Compani();
		System.out.println(c.cname);
		System.out.println(Compani.cname);
		

	}

}
