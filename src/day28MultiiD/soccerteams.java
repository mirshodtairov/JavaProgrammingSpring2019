package day28MultiiD;

import java.util.Arrays;

public class soccerteams {

	public static void main(String[] args) {
		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Bojan";
		teams[0][5] = "Bade";

		teams[1][0] = "olim";
		teams[1][1] = "mirshod";
		teams[1][2] = "nurs";
		teams[1][3] = "dmitriy";
		teams[1][4] = "roman";
		teams[1][5] = "usman";

		System.out.println(teams[0][0]);
		System.out.println(teams[1][3]);

		System.out.println(teams.length);
		System.out.println(teams[0].length);
		System.out.println(teams[1].length);

		System.out.println(Arrays.deepToString(teams));
		
		
		int states [][] = {{132, 345, 564},{1231,345,785},{786,6756,675}};
		
		
		System.out.println(states[0][1]);
		System.out.println(Arrays.deepToString(states));
		
		int [][] values = new int [4][];
		values[0]= new int [] {2,45,23};
		values[1]= new int [] {2,435,423};
		
		values[2]= new int [2];
		values[2][0] =55;
		values[2][1]= 88;
		
		values[3]=new int [] {2,4,6,7,68};
		
				
				
			
		}

	}

