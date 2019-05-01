package day11;

import java.util.Scanner;

public class tollRoad {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Vehicle Type:"); //1 , 2
        int carType = keyboard.nextInt(); 
		System.out.println("Is it rush hour: yes | no");
        String rushHour = keyboard.next();//yes or no
        
        //check if rushHour string is "yes" => assign true to isRushHour
        // if it is "no" , assign false to isRushHour 
        boolean isRushHour;
        if(rushHour.equalsIgnoreCase("yes")) {
            isRushHour = true;
        }else {
            isRushHour = false;
        }
        
        System.out.println(isRushHour);

	}

}
