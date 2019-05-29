package Day49;

public class AudioBook extends Book{
   
	 private double Length;
	 private String Narrator;
	 
	 
	 public void listen(){
		 System.out.println("Listening to "+getTitle()+" by "+getAuthor()+" and narrayed by "+getNarrator());
	 }
	 
	 
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public String getNarrator() {
		return Narrator;
	}
	public void setNarrator(String narrator) {
		Narrator = narrator;
	}
	 
}
