package Day49;

public class PaperBook extends Book {
	
	private int pages;
	
	public String toString() {
		return getTitle()+" "+getType()+" "+getPages()+" "+getPrice();
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
