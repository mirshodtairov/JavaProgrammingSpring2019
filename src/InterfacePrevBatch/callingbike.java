package InterfacePrevBatch;

public interface callingbike {
	public static void main(String[] args) {
		
//		MyBike mb = new MyBike();
//		mb.changeDirection();
//		mb.StepOnPaddle();
//		mb.changeDirection();
//		System.out.println(mb.toString());
//		System.out.println(mb.name);
//		System.out.println(mb.gear);
//		
		
		MyBike mb2= new MyBike();
		MountainBike mountBike2= new MountainBike();
		
		mountBike2.flip();
		MountainBike.race();
		mountBike2.Spin();
		mountBike2.jump();
		System.out.println("=====================================");
		mb2.flip();
	    mb2.Spin();
	    mb2.jump();
	    System.out.println("=====================================");
	    
	    
	    mountBike2.StepOnPaddle();
	    mb2.StepOnPaddle();
	    System.out.println("=====================================");
	    mountBike2.StopTheBike();
	    mountBike2.StartTheBike();
	    
	    System.out.println("=====================================");
	    bike bike = new MountainBike();
	    bike.StopTheBike();
	    bike.StartTheBike();
	    
	    System.out.println("=====================================");
	    bike bike2 = new MyBike();
	    bike2.StartTheBike();
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
