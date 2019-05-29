package Day49;

public class BarnsAndNobels {

	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setTitle("Intoduction to java programming");
		ebook.setAuthor("Savitch");
		ebook.setPages(1002);
		ebook.setSize(500);
		ebook.setPages(60);
		ebook.setType("Teck book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPages());
		
		
		ebook.readEBook(90);
		
		AudioBook ABook= new AudioBook();
		
	
    	ABook.setNarrator("Marufjon");
    	ABook.setTitle("OCA");
    	ABook.setAuthor("Jannne");
    	
    	ABook.listen();
    	
    	PaperBook PBook = new PaperBook();
    	PBook.setAuthor("Malcoln Glagwell");
    	PBook.setTitle("kusless");
    	
    	System.out.println(PBook.toString());

	}

}
