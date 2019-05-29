package Inheritance_YouTube;

public class puppy {
	
	private String collor;
	private int age;
	private int pounds;	
	
	public String getCollor() {
		return collor;
	}
	public void setCollor(String collor) {
		if (collor.equalsIgnoreCase("Brown") || collor.equalsIgnoreCase("White")) {
			this.collor = collor;
			System.out.println("Im taking this cutie with me");
			
		}else{System.out.println(this.collor = collor+" i might come back once you have that collor pets");
		
		
		}
			
			
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>2 && age <4) {
			this.age = age;
			System.out.println("It is a good size dog, i m taking it");
		}else {
			this.age = age;
			System.out.println(" this god is too big");
		}
			
		
		
	}
	public int getPounds() {
		return pounds;
	}
	public void setPounds(int pounds) {
		if(pounds<4) {
		this.pounds = pounds;}
		else {
			System.out.println(pounds+" pound-  this is not small puppy, anymore it grown dog");
			this.pounds = pounds;
		}
	}
	
	
	
	public void sleep() {
		System.out.println("puppy is Sleeping");
		
	}
	public void eat() {
		System.out.println("puppy is Eating");
	}
	
	
	public void getInfo(String collor, int age, int pounds ) {
		setCollor(collor);
		
		setAge(age);
		
		setPounds(pounds);
		
		
	}
	public void voice() {
		System.out.println("vouf-vouf");
		
	}
	
 
	

}
