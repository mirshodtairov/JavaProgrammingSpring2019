package Day50_inheritance3;

public class IphoneApp extends App{
	
	
	
	IphoneApp(String name) {
		super(name);
		
	}
	IphoneApp() {
		super("Iphone App");
	
	}
	
	
	
	
	


	private String developer;

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	

}
