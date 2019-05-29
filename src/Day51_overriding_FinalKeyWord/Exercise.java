package Day51_overriding_FinalKeyWord;


public class Exercise {
	
	
	

	public int perform(int minutes) {

		System.out.println("performing general exercise");
		return minutes * 4;

	}

}



//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
class Running extends Exercise {

	public int perform(int minutes) {
		System.out.println("running general exercise");
		return minutes * 10;

	}
	

}


class Sprint extends Running{
	
}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
class Swimming extends Exercise {
	public int perform(int minutes) {
		System.out.println("swimming general exercise");
		return minutes * 11;
	}
}

class Yoga extends Exercise {
	public int perform(int minutes) {
		System.out.println("yoga general exercise");
		return minutes * 8;
	}
}

class JiuJitsu extends Exercise {
	public int perform(int minutes) {
		System.out.println("JiuJitsu general exercise");
		return minutes * 11;
	}

}
class Snowbording extends Exercise{
	
	public int perform(int minutes) {
		super.perform(10);
		System.out.println("Snowboarding general exercise");
		return minutes * 7;
	}
	
}
