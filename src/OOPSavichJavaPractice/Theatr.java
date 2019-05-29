package OOPSavichJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class Theatr {

	public static void main(String[] args) {
		
		movies movie = new movies();
		
		movie.setTitle("Avatar");
		movie.setActorName("Sam Worthington");
		movie.setActrisName("Zoe Saldana");
		movie.setYear(2001);
		
		
		System.out.println(movie.getActorName());
		
		movie.setActorName("Nicolas Cage");
		
		System.out.println(movie.getActorName());
		
		
		System.out.println(movie.toString());
		
		movie.setActorName("Unknown");
		
		System.out.println(movie.toString());
		
		System.out.println(movie.getYear());
		
		
		
		movie.setYear(2000);
	    System.out.println(	movie.toString());
	    
	    
		System.out.println("=============================================================");
		
		
		
		
		movies movies1= new movies("Titanic", 1996, "Leonardo DiCaprio", "Kate Winslet");
		
		System.out.println(movies1.toString());
		
		System.out.println(movies1.getTitle().substring(0,3)+"s");
		
	
		
		System.out.println(movies1.getActorName()+" falls in love with "+movies1.getActrisName());
		
		System.out.println(movies1.getTitle()+" becomes one of the best sellers in the world");
		
	
		movies1.setTitle("Terminator2");
		movies1.setActorName("Arnold Schwrsneger");
		movies1.setActrisName("Sara Conor");
		movies1.setYear(1992);
		
		System.out.println(movies1.toString());
		
		movies movie3=new movies();
		
		ArrayList<String> m= new ArrayList<>();
		m.add("Lion King");
		m.add("2Thanos");
		
		movie3.setNewMovieas(m);
		System.out.println(movie3.getNewMovieas());
		
		
		
		
		
		

	}

}
