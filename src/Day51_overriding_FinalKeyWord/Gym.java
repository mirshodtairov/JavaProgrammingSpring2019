package Day51_overriding_FinalKeyWord;

public class Gym {

	public static void main(String[] args) {
		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JiuJitsu j = new JiuJitsu();
		Sprint sp= new Sprint();
		Snowbording sn= new Snowbording();
		
		
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(20));
		System.out.println(s.perform(39));
		System.out.println(y.perform(40));
		System.out.println(j.perform(42));
		System.out.println(sp.perform(456));
		System.out.println(sn.perform(100));
	}

}
