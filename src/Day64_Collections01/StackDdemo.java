package Day64_Collections01;

import java.util.Stack;

public class StackDdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.push(60);
		numsStack.push(70);
		
		
		System.out.println(numsStack.toString());
		System.out.println(numsStack.pop());
		System.out.println(numsStack.peek());
		System.out.println(numsStack.toString());
		System.out.println(numsStack.get(0));
		
		

	}

}
