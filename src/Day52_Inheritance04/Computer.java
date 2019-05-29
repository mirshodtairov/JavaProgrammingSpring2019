package Day52_Inheritance04;

public class Computer {
	
	private String models;
	private String collor;
	
	
	public Computer() {
		super();
		
	}
	
	public boolean equals(Computer other) {
		
		if(models.equals(other.models)&&
				collor.equals(other.collor)){
			return true;
			
			
		}
		return false;
		
	
	}



	public Computer(String models, String collor) {
		super();
		this.models = models;
		this.collor = collor;
	}
	public String getModels() {
		return models;
	}
	public void setModels(String models) {
		this.models = models;
	}
	public String getCollor() {
		return collor;
	}
	public void setCollor(String collor) {
		this.collor = collor;
	}
	

}

