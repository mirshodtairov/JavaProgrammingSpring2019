package Day50_inheritance3;

public class App {

	private String name;
	public static int count;
	
	
	public static void Build(String language) {
		System.out.println("building an app using "+language);
	}
	
	
	
	
	
	App(String name){
		this.name=name;
		
	}
	
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
