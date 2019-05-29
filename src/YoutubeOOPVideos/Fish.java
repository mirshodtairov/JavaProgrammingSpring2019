package YoutubeOOPVideos;

public class Fish extends Animals{
	
	public Fish(int age, String name, String type) {
		super(age, name, type);
		// TODO Auto-generated constructor stub
	}
	String name;
	int age;
	String fromWhere;
	
	
	
	
	
	public void swim() {
		System.out.println(name + " swimming....");
		
	}
	public void rest() {
		System.out.println(name+" resting....");
		
	}

}
