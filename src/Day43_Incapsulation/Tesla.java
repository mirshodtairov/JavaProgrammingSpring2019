package Day43_Incapsulation;

public class Tesla {

	private String model;
    private int range;
    private double zeroTo60;
    private double price;
    private boolean selfDriving;
    private boolean validModel;
    
    
    
    public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
        setModel(model);
        setPrice(price);
        setRange(range);
        setZeroTo60(zeroTo60);
        setSelfDriving(selfDriving);
    }
    
    
    public void setModel(String model) {
        if(isValidModel(model) == true) {
            this.model = model;
        }else {
            System.out.println("Invalid model");
            this.model = "unknown";
        }
        
    }
    
    public String getModel() {
        return model;
    }
    
    
    public void setRange(int range) {
        this.range = range;
    }
    
    public int getRange() {
        return range;
    }
    
    public void setZeroTo60(double zeroTo60) {
        this.zeroTo60 = zeroTo60;
    }
    
    public double getZeroTo60() {
        return zeroTo60;
    }
    
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    
    
    
    public void setSelfDriving(boolean selfDriving) {
        this.selfDriving = selfDriving;
    }
    
    public boolean isSelfDriving() {
        return selfDriving;
    }
    
    public String toString() {
        return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
                + ", selfDriving=" + selfDriving + "]";
    }
    public boolean isValidModel(String model) {
        model = model.toLowerCase();
    
        if(model.equals("model s") ||   //switch(model){
           model.equals("model x") ||   //case "model s":
           model.equals("model 3") ||   //case "model x":
           model.equals("model y")||    //case "model y":
           model.equals("roadster")) {  //case "roadster":
            return true;                // return true;
        }                               //default:
        return false;                   //return false;
        
    }
    
    
    
}