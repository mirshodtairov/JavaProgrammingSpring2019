package RplIt;

import java.util.*;

public class AppendAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>aaa=new ArrayList<>();
		aaa.add(12);
		aaa.add(2);
		aaa.add(-4);
		aaa.add(-3);
		aaa.add(1);
		System.out.println(appendPosSum(aaa));
		

	}
	public static ArrayList<Integer>appendPosSum(ArrayList<Integer> ints){
		ArrayList<Integer> newList= new ArrayList<>();
		int sum=0;
		
		for (int i = 0; i < ints.size(); i++) {
			if (ints.get(i)>0) {
				newList.add(ints.get(i));
				sum+=ints.get(i);
				
			}
			
			
		}
		
		newList.add(sum);
		return newList;
		
		
	}
}
	
	


