package Day50_inheritance3;

public class AppsFactory {

	public static void main(String[] args) {
		IphoneApp iApp= new IphoneApp();
		IphoneApp iApp2= new IphoneApp("Uber");
		
		AndoidApp andrApp= new AndoidApp();
		AndoidApp andrApp2= new AndoidApp("Unknown");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(andrApp.getName());
		System.out.println(andrApp2.getName());
		
		
		App.count= 33;
		System.out.println(IphoneApp.count);
		AndoidApp.count=100;
		System.out.println("App count "+App.count);
		System.out.println("iphone count "+IphoneApp.count);
		System.out.println("android count "+AndoidApp.count);
		
		App.Build("swift");

		AndoidApp.Build("JS");
	

		IphoneApp.Build("Java");
	

	}

}
