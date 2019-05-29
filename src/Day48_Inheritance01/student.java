package Day48_Inheritance01;

public class student extends person {
	
	
	int stidentID;
	String clazz;
	
	
	public void code(String lang) {
		System.out.println(name+"is coding"+lang);
		
	}
	
	public void attendClass() {
		System.out.println(name+" is attending"+clazz+" class");
		
	}
	
	
	

}
