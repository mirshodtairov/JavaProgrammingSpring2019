package Day43_Incapsulation;

public class Pet {
	
	private String type;
	private String name;
	
	
	
	
	public Pet(String type, String name) {
		
		this.type = type;
		this.name = name;
	}
	public Pet(){
		System.out.println("No Args Constractor");
	}
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Mew");
			break;
		case "dog":
			System.out.println("gav gav");
			break; 
		case "bird":
			System.out.println("chick - chirick");
			break; 
		case "goat":
		case "sheep":
			System.out.println("bhaaaa bhaaa");
			System.out.println("mheee mheeee");
			break;
		case "rooster":
			System.out.println("kukareku");
			break;
			default:
			System.out.println("...");
			
		}
		
	}
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
