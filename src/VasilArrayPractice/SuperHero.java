package VasilArrayPractice;

import java.util.ArrayList;

public class SuperHero {
	
	
	public static void main(String[] args) {
		String [] arr1 = {"word"};
		String [] arr3 = new String [] {"apple", "kiwi"};
		String  [] arr2= new String[1];
		arr2[0]= "word";
	//	arr2[1]= "new word";
		
		
		  String[] superheroes = { "Spiderman", "Iron man", "Hulk", 
                  "Wonder Woman", "Thor", "Batman", "Hellboy",
                  "Superman", "Flash", "Captain America", "Ant Man", "Aquaman" };
		  
		  
		  int counter= 0;
		  ArrayList<String> spacedHero = new ArrayList<>();
		  
		  
		  
		  
		  for (int i = 0; i < superheroes.length; i++) {
			if(superheroes[i].contains(" ")) {

				spacedHero.add(superheroes[i]);
				counter++;
					
					
				}
			}
			
			System.out.println(spacedHero);
			System.out.println(counter);
			
		}
	}
	
	
	



