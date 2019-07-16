package Day60_Polimorphism02;

import java.util.ArrayList;
import java.util.Collections;

public class Pizza{
	  private String size;
	  private int cheeTopping;
	  private int peperoniTopping;
	  private int hamTopping;
	  


	public int getCheeTopping() {
		return cheeTopping;
	}

	public void setCheeTopping(int cheeTopping) {
		this.cheeTopping = cheeTopping;
	}

	public int getPeperoniTopping() {
		return peperoniTopping;
	}

	public void setPeperoniTopping(int peperoniTopping) {
		this.peperoniTopping = peperoniTopping;
	}

	public int getHamTopping() {
		return hamTopping;
	}

	public void setHamTopping(int hamTopping) {
		this.hamTopping = hamTopping;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Pizza(String size, int cheeTopping, int peperoniTopping, int hamTopping) {
		super();
		this.size = size;
		this.cheeTopping = cheeTopping;
		this.peperoniTopping = peperoniTopping;
		this.hamTopping = hamTopping;
	}

	public double calcCost() {
		
		return cheeTopping;
		
	}
	
  
	
}
	
	
	
	
	