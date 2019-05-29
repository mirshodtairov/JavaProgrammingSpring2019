package OOPReplit;

public class persianCarpet {
	
	 public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	  
	   public persianCarpet() {
		  width=300.0;
		  length=300.0;
		  isPersian=false;
		  unitPrice=0;
		  totalPrice= 200.0;
	}
	   
	   public persianCarpet(double width,double length,double unitPrice,boolean isPersian) {
		   this.width=width;
		   this.length=length;
		   this.unitPrice=unitPrice;
		   this.isPersian=isPersian;
		   if(isPersian==true) {
			   totalPrice=(width + length) * unitPrice+200;
		   }else {
		   totalPrice=(width + length) * unitPrice;
		   
		   }
	   }
	   
	   

}
