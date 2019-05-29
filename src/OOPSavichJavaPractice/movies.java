package OOPSavichJavaPractice;

import java.util.ArrayList;

public class movies {

	private String title;
	private int year;
	private String ActorName;
	private String ActrisName;
	
	private ArrayList <String> newMovieas = new ArrayList<>();

	public ArrayList<String> getNewMovieas() {
		return newMovieas;
	}

	public void setNewMovieas(ArrayList<String> newMovieas) {
		this.newMovieas = newMovieas;
	}

	@Override
	public String toString() {
		return "movies [title=" + title + ", year=" + year + ", ActorName=" + ActorName + ", ActrisName=" + ActrisName
				+ "]";
	}

	public movies() {

	}

	public movies(String title, int year, String ActorName, String ActrisName) {
		this.title = title;
		this.year = year;
		this.ActorName = ActorName;
		this.ActrisName = ActrisName;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public void setActorName(String actorName) {
		ActorName = actorName;
	}

	public void setActrisName(String actrisName) {
		ActrisName = actrisName;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getActorName() {
		return ActorName;
	}

	public String getActrisName() {
		return ActrisName;
	}

}
