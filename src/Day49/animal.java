package Day49;

public class animal {
	
	private String type;
	
	public animal() {
		System.out.println("Animal Constractor");
		type = "undifined";
	}
	
	public animal(String type) {
		System.out.println("Animal 1 arg cconstructor ");
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
