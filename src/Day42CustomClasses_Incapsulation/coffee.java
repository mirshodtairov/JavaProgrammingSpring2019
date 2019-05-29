package Day42CustomClasses_Incapsulation;

public class coffee {

	String name;
    String size;
    double price;
    int calories;
    
    
    
    public void getCoffeeInfo() {
        System.out.println("name: " + name.toUpperCase() + "\n"+ " size: " + size +"\n" +" price: " + price +"\n"+ " calories: " + calories);
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setSize(String newSize) {
        
        size = newSize;
        
        if(newSize.equalsIgnoreCase("tall") ||
                newSize.equalsIgnoreCase("grande") ||
                newSize.equalsIgnoreCase("venti")) {
                size = newSize;
            }else {
                System.out.println("ERROR: Invalid Size - " + newSize);
                size = "unknown";
            }
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    
    public void setCalories(int newCal) {
        calories = newCal;
    }
    
    public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
        name = newName;
        size = newSize;
        price = newPrice;
        calories = newCal;
    }
}