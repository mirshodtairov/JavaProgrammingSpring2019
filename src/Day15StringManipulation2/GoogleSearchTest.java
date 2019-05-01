package Day15StringManipulation2;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";

		if (pageTitle.startsWith(item)) {
			System.out.println("page title check passed");
		} else {
			System.out.println("page title check passed failed");
		}
 		if (pageTitle.endsWith("ch")) {
			System.out.println("page title check passed");
		} else {
			System.out.println("page title check passed failed");
		}
	}

}
