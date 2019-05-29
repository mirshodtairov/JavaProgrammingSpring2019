package Day50_inheritance3;

public class Google extends SearchEngine {
	
	public int search(String item) {
		System.out.println("Searching for "+ item);
		int resultsCount= item.length();
		return resultsCount;
	}
	public void search(String item, String item2) {
		System.out.println("Searching for "+ item+" + "+item2);
		int resultsCount= item.length()+item2.length();
		System.out.println(resultsCount);
	}
	
	String clickResult() {
		System.out.println("Click result");
		return "Search result page";
	}


}
