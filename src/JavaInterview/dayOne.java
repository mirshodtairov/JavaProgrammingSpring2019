package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class dayOne {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Name");
		String str1 = str.toString();
		System.out.println(str1);
		int [] arr = {2,4,4,6,6,7};
		System.out.println(remove(arr));

	}
	
	public static ArrayList<Integer> remove(int [] bbb) {
		ArrayList<Integer> list= new ArrayList<>();
		
		
		for (int i = 0; i < bbb.length; i++) {
			for (int j = 0; j < bbb.length; j++) {
				if (bbb[i]==bbb[j]&& i!=j) {
					list.add(i);
				}
			}
			
		}
		
		return list;
		
	}
////	Your assignment: 1. Create a return method that can remove duplicated values
//	 * from an int Array. Do not use Set interfaces. 2. Create a method that can
//	 * divide two numbers without using division operators and Math class.
//	 * /

}
/*
 * 
 * 1. How do you combine two Strings?
 * 
 * 
 * 2. What’s the differences between StringBuffer and StringBuilder? What’s
 * synchronization?
 * 
 * whats syncronization ? StringBuffer & StrungBuilder: mutable version of
 * sequences of characters
 * 
 * 3. Tell me the differences between void and non-void methods void does not
 * returns any value non void has a return keyword(data type must be same as
 * return type)
 * 
 * 4.Can you explain what is 'public static void' ? public means that the method
 * is visible and can be called from other objects of other types. ... This
 * means that you can call a static method without creating an object of the
 * class. void means that the method has no return value. If the method returned
 * an int you would write int instead of void
 * 
 * 
 * 
 * 5. Briefly explain the differences between Array and ArrayList ArrayList can
 * change its size Array cant. ArrayList is part of collection framework in
 * Java. Therefore array members are accessed using [], while ArrayList has a
 * set of methods to access elements and modify them. Array is a fixed size data
 * structure while ArrayList is not. One need not to mention the size of
 * Arraylist while creating its object.
 * 
 * 6. What are the primitives and wrapper classes in java? Their differences As
 * the name suggests, wrapper classes are objects encapsulating primitive Java
 * types. Each Java primitive has a corresponding wrapper: boolean, byte, short,
 * char, int, long, float, double. Boolean, Byte, Short, Character, Integer,
 * Long, Float, Double. Null can be assigned to Wrapper classes Wrapper classes
 * has methods but primitive doesnt Primitive has default value
 * 
 * 
 * 7. Explain me the method overloading and method overriding? Return type of
 * overloaded method should be same or not? Can you overload and override the
 * constant methods? Overloading occurs when two or more methods in one class
 * have the same method name but different parameters. Overriding means having
 * two methods with the same method name and parameters Only instance methods
 * can be overridden (besides final, private)
 * 
 * 
 * 8. differences between instance variable, class variables and local
 * variables? Instance veritable belongs to object Class variable is static
 * variable, can be called through class name Local variable belongs to method
 * or class You can not give access modifiers to local variable
 * 
 * 
 * 
 * 
 * 
 * 9. what’s an instance method ? What is static method? instance method belongs
 * to object static method belong to class there is no object instance in the
 * static methods
 * 
 * 10. what’s constructor? Declaration ? 
 * A class contains constructors that are
 * invoked to create objects from the class blueprint. Constructor declarations
 * look like method declarations—except that they use the name of the class and
 * have no return type.
 * it can have any access modifires 
 * 
 * 
 * 
 * 11. inner class VS outer class 1. Outer class be static? 2. Can inner class
 * be static? 3. Can you create an object from the inner class? 4. can we have
 * main method in inner class ?
 * Outer class can not be static
 * Inner class can be static 
 * Main method can be in inner class only if its static 
 * You can create object of inner class only if its  static
 * To inherit inner class class must be static 
 * 
 * 
 * 
 * 12. what are the blocks in java that you have used in your framework?
 * InIt block, static , finally
 * 
 * 13. difference between final and finally?
 * final is specifier 
 *     it is applicable only to : method, Variable and class
 *     
 * finally is a block and must be declare in TRY CATCH block in exception 
 *   
 * 
 * 
 * 14. What is toString method in java.
 * it is converter to to String 
 * Arrays can be
 * 
 * 
 * 15. Did you use Encapsulation in your framework? How ? What’s the befits of
 * using encapsulation?
 * 
 * 
 * 
 * Your assignment: 1. Create a return method that can remove duplicated values
 * from an int Array. Do not use Set interfaces. 2. Create a method that can
 * divide two numbers without using division operators and Math class.
 * 
 * 
 */
