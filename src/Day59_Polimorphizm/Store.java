package Day59_Polimorphizm;

public class Store {

	public static void main(String[] args) {
        Flammable hs= new HiarSpray();
        hs.CatchFire();
        
        Flammable pt = new PropaneTank();
        pt.CatchFire();
        
        
	}

}
