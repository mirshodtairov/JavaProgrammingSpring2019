package OOPSavichJavaPractice;

public class Pet {

	private String name;
	private int age;
	private double weight;

	public Pet() {
		name = "No name yet";
		age = 0;
		weight = 0;
	}

	public Pet(String initialName, int initialAge, double initialWeight) {

		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error, Negative Weight Or Age");
			System.exit(0);
		}

	}

	public void Pet(String newName, int newAge, double newWeight) {

		name = newName;
		if ((newAge < 0) || (newWeight < 0)) {
			System.out.println("Error, Negative Weight Or Age");
			System.exit(0);

		} else {
			age = newAge;
			weight = newWeight;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
