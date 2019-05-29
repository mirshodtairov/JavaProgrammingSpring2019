package OopMyUnderstanding;

public class ChhampionsLegue {

	public static void main(String[] args) {

		Arsenal player1 = new Arsenal();
		System.out.println(player1.firstName = "Lucas");
		System.out.println(player1.isVengerPlayer = false);
		System.out.println(player1.lastName = "Toreira");
		System.out.println(player1.position = "Midfielder");
		System.out.println(player1.salary = 150.328);
		System.out.println(player1.numbeOnAShirt = 20);
		System.out.println(player1.toString());

		Liverpool player2 = new Liverpool();
		player2.dataOfPlayer("Sadio", "Mane", 10, "Left winger", 200.000);
		System.out.println(player2.toString());
		
		System.out.println(seePlayer());
		
		System.out.println(checkPlayer());
		
		
		

	}
	public static Liverpool seePlayer() {
		System.out.println("Can i see your payer?");
		System.out.println("hey player come here");
		
		Liverpool player3= new Liverpool();
		player3.dataOfPlayer("Roberto", "Ferminio", 9, "CentralForward", 275.000);
		return player3;
		
	}
	public static Arsenal checkPlayer(){
		Arsenal playerr4 = new Arsenal();
		playerr4.dataOfArsenalPayers("Ben", "Leno", 1, "GoalKeeper", 230.000, false);
		return playerr4;
		
	}
	

}