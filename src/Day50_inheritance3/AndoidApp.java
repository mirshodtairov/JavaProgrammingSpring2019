package Day50_inheritance3;

public class AndoidApp extends App{
	
	 private String developer;
	
	
	AndoidApp() {
		super("Adroid App");
	}
	
	AndoidApp(String name) {
		super(name);
		
	}

	
	
	
	

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	

}
