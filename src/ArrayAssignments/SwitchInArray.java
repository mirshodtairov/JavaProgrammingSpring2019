package ArrayAssignments;

public class SwitchInArray {

	public static void main(String[] args) {
		String[] kitchenItems = { ""
				+ "Knife " , "Wooden Spoon ", "Dishwasher ", "Pan ", "Cups ", "plates" };
		for (String item : kitchenItems) {
			
		item=item.toLowerCase().trim();
//			item=item.toUpperCase();
			//item=item.trim();
			
			switch (item) {
			case "knife":
				System.out.println("knife is used to cut");
				break;
			case "wooden Spoon":
				System.out.println("wooden Spoon is uesd to eat soup");
				break;
			case "dishwasher":
				System.out.println("dishwasher is used to wash dishes");
				break;
			case "pan":
				System.out.println("Pan is used to sear or fry food");
				break;
			case "cups":
				System.out.println("Cups are used to drink liquid");
				break;
			case "plates":
				System.out.println("Plates are used to eat out them");
				break;
			
			}
		}

	}

}
