package OOPVasil_Review;

public class HotDogStand {

	private int id;
	private int sold;
	private static int total;

	public HotDogStand(int id, int sold) {
		this.id = id;
		this.sold = sold;
	}

	public void justSold() {
		this.sold++;
		this.total++;

	}

	public static int getTotal() {
		return total;
	}

	public int getSold() {
		return this.sold;
	}

}

/*
 * You operate several hot dog stands distributed throughout a city. - Create a
 * class named HotDogStand that has an instance variable for the hot dog stands
 * ID number and an instance variable for how many hot dogs the stand has sold
 * that day.
 * 
 * - Create a constructor that allows a user of the class to initialize both
 * values.
 * 
 * - Also create a method named justSold that increments by one the number of
 * hot dogs the stand has sold. - The idea is that this method will be invoked
 * each time the stand sells a hot dog so that you can track the total number of
 * hot dogs sold by the stand. - Add another method that returns the number of
 * hot dogs sold.
 * 
 * - Finally, add a static variable "total" that tracks the total number of hot
 * dogs sold by all hot dog stands and a static method that returns the value in
 * this variable.
 * 
 * - Finally, add a static variable "total" that tracks the total number of hot
 * dogs sold by all hot dog stands and a static method that returns the value in
 * this variable.
 * 
 * ###Create a class ControlPanel with a main method to test your class with at
 * least three hot dog stands that each sell a variety of HotDogs.
 * 
 * - Main method should asks user to enter command. - A command can be "sold",
 * which in result would ask for cart number and increment its pointer. -
 * Another command can be "print", which will also asks for cart number and
 * print how many hotdogs that cart sold. - One command would be "print-all",
 * that will result in printing how many HotDogs were sold by all carts. - Call
 * Static method of HotDogStand for "print-all". Lastly, anything else will
 * terminate the program.
 * 
 * 
 * 
 * 
 */
