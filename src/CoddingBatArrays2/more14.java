package CoddingBatArrays2;

public class more14 {

	public static void main(String[] args) {
		int [] nums= {1,4,1};
		  int counter1=0;
		  int counter4=0;
		for(int i= 0; i < nums.length; i++ ){
		    if (nums[i]==1){
		      counter1++;
		    }
		    if(nums[i]==4){
		      counter4++;
		    }
		  }
		System.out.println(counter1);
		System.out.println(counter4);
//		  if(counter1>counter4){
//		    return true;
//		  }
//		  return false;
//		}


	}

}
