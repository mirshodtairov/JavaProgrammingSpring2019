package Day46_StaticKeyword;

public class Campus {
	
	private String city;
	
	
	
	static {
		System.out.println("Static block N1");
	}
	static {
		System.out.println("Static block N2");
	}
	
	
	
	public Campus (String city){
		System.out.println("constarctor");
        this.city=city;	
	}
	
	
	public static void campusInfo() {
		System.out.println("Wllcome to compus");
	}
	
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
