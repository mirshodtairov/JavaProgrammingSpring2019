package Day27;

public class tools {

	public static void main(String[] args) {
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project
		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };
		for (int i = 0; i < tools.length; i++) {
			if (tools[i].contains("Java")) {
				System.out.println("\"Java\" programming language");
			} else if (tools[i].contains("Selenium")) {
				System.out.println("\"Selenium\" Test Automation");
			} else if (tools[i].contains("TestNG")) {
				System.out.println("\"TestNG\" Unit Tests");
			} else if (tools[i].contains("JUnit")) {
				System.out.println("\"JUnit\" Unit Tests");
			} else if (tools[i].contains("Cucumber")) {
				System.out.println("\"Cucumber\" BDD Style testing");
			} else if (tools[i].contains("Git")) {
				System.out.println("\"Git\" Version control");
			} else if (tools[i].contains("Maven")) {
				System.out.println("\"Maven\" Building and execution for project");

			}

		}

	}
}
