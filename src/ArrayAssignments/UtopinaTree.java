package ArrayAssignments;

public class UtopinaTree {

	public static void main(String[] args) {
		int treesize=0;
		for (int i = 1; i <= 3; i++) {
			treesize+=1;
			System.out.println("year" + i + " - growth 1 cm");
			System.out.println("tree size: "+treesize);

		}
		for (int i = 4; i <=10; i++) {
			treesize+=2;
			
			System.out.println("year" + i + " - growth 2 cm");
			System.out.println("tree size:"+treesize);
			
		}

	}

}
