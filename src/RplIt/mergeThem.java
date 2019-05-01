package RplIt;

public class mergeThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeStrings("wooden", "spooners"));
		

	}
	 public static String mergeStrings(String one, String two) {
		 StringBuilder output = new StringBuilder();
		 int i =0;
	        for(; i< one.length(); ++i){
	            output.append(one.charAt(i));
	            if(i < two.length()){
	                output.append(two.charAt(i));
	            }
	        }
	        if(i < two.length()){
	            for(; i<two.length(); ++i){
	                output.append(two.charAt(i));
	            }
	        }
	        return output.toString();
	    }
	    }