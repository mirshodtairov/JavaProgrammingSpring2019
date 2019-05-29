package Day53_Inheritance06;

public class City {

	private int id;
	private String name;
	public int count= 100;

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;

	}

	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City) obj;
		if (this.id == anotherCity.id && this.name == anotherCity.name) {
			return true;

		}
		return false;

	}

	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void buildARoad() {
        System.out.println("City - building a road");
    }
    
    public void letBuildARoad() {
        buildARoad();
    }

}
