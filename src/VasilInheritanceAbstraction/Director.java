package VasilInheritanceAbstraction;

public class Director {
	
	public static void main(String[] args) {
		
		
				
		
		Director director1 = new Director("russo");
		fantasy avangers = new fantasy("PG13", 1, "evengers", director1);
		fantasy avangers2 = new fantasy("PG13", 1, "evengers", director1);
		System.out.println(avangers.calculateFee(5));
		System.out.println(avangers.equals(avangers2));
		
		
	}
	
	private String name;
	
	public Director(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
//======================================================================================
abstract class Movie {
	private String name;
	private int idNunber;
	private String title;
	private Director director;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(String name, int idNunber, String title, Director director) {
		super();
		this.name = name;
		this.idNunber = idNunber;
		this.title = title;
		this.director = director;
	}
	public int getIdNunber() {
		return idNunber;
	}
	public void setIdNunber(int idNunber) {
		this.idNunber = idNunber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	//this  is not overriding
	public boolean equals(Movie o) {
		return (o.idNunber==this.idNunber);
	}
	
	public abstract double calculateFee(int numberDays);
	
}
class Action extends Movie{

	public Action(String name, int idNunber, String title, Director director) {
		super(name, idNunber, title, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFee(int numberDays) {
       	return  numberDays*3;
	
	}
	
}
class comedy extends Movie{

	public comedy(String name, int idNunber, String title, Director director) {
		super(name, idNunber, title, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFee(int numberDays) {
		
		return numberDays*2.50;
	}
	
}
class drama extends Movie{

	public drama(String name, int idNunber, String title, Director director) {
		super(name, idNunber, title, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFee(int numberDays) {
		
		return numberDays*2;
	}
	
	
	
}

class horror extends Movie{

	public horror(String name, int idNunber, String title, Director director) {
		super(name, idNunber, title, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFee(int numberDays) {
		// TODO Auto-generated method stub
		return numberDays*1.50;
	}
	
	
}
class fantasy extends Movie{

	public fantasy(String name, int idNunber, String title, Director director) {
		super(name, idNunber, title, director);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFee(int numberDays) {
		// TODO Auto-generated method stub
		return numberDays*3.50;
	}
	
	
}

/*
 * Write a class Director taht contains: - private instance name type of String.
 * - a constructor that accepts a String corresponding to the directors name. -
 * a toString method that returns 'Name: name'. Create an abstract class named
 * Movie that can be used with your video rental business. The Movie class
 * should track the Motion Picture Association of America (MPAA) rating (for
 * example, Rated G, PG-13, R), ID Number, movie title and director( use
 * Director class) with appropriate accessor and mutator methods (private
 * instance variables, getters/setters).
 * 
 * Add a constructor that accepts four parameters. Constructor must initialize
 * all instance variables of class Movie.
 * 
 * Also create an equals() method that overrides Objects equals() method, where
 * two movies are equal if their ID number is identical. Next, create four
 * additional classes named Action, Comedy, Drama, Horror and Fantasy that are
 * derived from Movie.
 * 
 * Finally, create abstract method named calcLateFees that takes as input the
 * number of days a movie is late and returns the late fee for that movie.
 * Action movies have a late fee of $3/day, comedies are $2.50/day, dramas are
 * $2/day, horrors are $1.25/day and fantasy movies are $3.50/day
 */

