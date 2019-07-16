package Day56;

public abstract class Browser {
	String name;
	static int id;
	
	public Browser(String name, int id) {
		
	}
	
	public Browser() {
		System.out.println("Creating a Browser");
	}
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	public void close() {
		System.out.println("closinng the browser");
	}
	

}

//***************************************************************

class Chrome extends Browser{

	@Override
	public void navigate(String url) {
		System.out.println("url "+url);		
	}

	@Override
	public void displayWebpage() {
		System.out.println("diplay the page of Chrome");
		
	}

	@Override
	public boolean launch() {
	    System.out.println("1 2 3");
		return false;
	}
	
}
//***************************************************************

class FairFox extends Browser{
	
	

	@Override
	public void navigate(String url) {
		System.out.println("url "+url);
		
	}

	@Override
	public void displayWebpage() {
		System.out.println(" diplaying Fairfox");
		
	}

	@Override
	public boolean launch() {
	    System.out.println("4 5 6");
		return false;
	}
	
	
	
	
}