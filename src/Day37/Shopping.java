package Day37;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("paper towel");
        shoppingList.add("dish soap");
        shoppingList.add("trash bag");
        shoppingList.add("clorox");
        shoppingList.add("gloves");
        shoppingList.add("shovel");
        
        //print number of items
        int count = shoppingList.size();
        System.out.println("Total count: " + count);
        //print all items in single line
        System.out.println(shoppingList.toString());
        //print first and last item in single line
        System.out.println(shoppingList.get(0) +" | " +
                           shoppingList.get(count-1));
        
        shoppingList.remove("paper towel");
        shoppingList.remove("shovel");
        System.out.println(shoppingList.toString() );
        System.out.println(shoppingList.get(0));
        shoppingList.remove(0);
        System.out.println(shoppingList.toString() );
        
    }
}