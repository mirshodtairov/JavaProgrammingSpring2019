
public class SuperKeyword_Navin {

	public static void main(String[] args) {

		B obj = new B();
		obj.showTheName();

	}
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
class A {

	String name = "Samir";

	public void LetterA(char passit) {

		System.out.println("Im the first letter " + passit);

	}

}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
class B extends A {

	String name = "Abdallah";

	public void showTheName() {

		System.out.println(super.name);
	}

	public void LetterZ(char passitagian) {
		super.LetterA('A');
		System.out.println("Im the last letter " + passitagian);

	}

}
