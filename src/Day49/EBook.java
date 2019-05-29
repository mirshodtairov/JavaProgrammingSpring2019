package Day49;

public class EBook extends Book{
	private int Size;
	private int Pages;
	
	public void readEBook(int pageNum) {
		System.out.println("Reading "+getTitle()+" at page "+pageNum+"...."+" Author: "+getAuthor());
	}
	
	
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		Pages = pages;
	}
	

}
