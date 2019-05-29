package Day53_Inheritance06;

public class Cities extends City {
	
	
	public Cities(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		City baku = new City(123, "Baku");
		System.out.println(baku.toString());

		City istanbul = new City(444, "Istanbul");
		City anotherCity = new City(444, "Istanbul");

		if (istanbul.equals(anotherCity)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());

	}

	
}
