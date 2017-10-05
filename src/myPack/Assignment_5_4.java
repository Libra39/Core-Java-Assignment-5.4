/**
 * 
 */
package myPack;																			// Package declared
public class Assignment_5_4 {															// class declared
/**
 * 
 * Create an interface Stack in package myPack with following methods
 * Methods:
 * • void push(int I)
 * • int pop()
 * 
 * Create two subclasses inheriting the Stack interface.
 * class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
 * in the constructor. If the number of integers exceeds the size, “Stack overflow” message should be displayed.
 * 
 * class VariableStack that can accept numbers more than its size. The size of the Stack will be
 * specified in the constructor. If the number of integers exceeds the size, the stack should
 * automatically grow to accommodate the new element.
 * 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
	public static void main(String[] args) throws Exception {							// Main method started
	  FixedStack fixedstack=new FixedStack(3);											// new instance created
        for(int myInteger=1;myInteger<5;myInteger++)									// push some numbers onto the stack 
        	fixedstack.push(myInteger);													
        for(int myInteger=0;myInteger<4;myInteger++)									// pop those numbers off the stack 
                System.out.println(fixedstack.pop());									// print the method
        System.out.println("Fixed Stack is full - Now Fixed Stack is Overflowing\n");   // print the argument in the next line
        
      VariableStack variablestack =new VariableStack(5);								// new instance created
      System.out.println("Dynamic/Variable Stack Loading .....");  						// print the argument in the next line
      for(int myInteger=1;myInteger<9;myInteger++)										// push some numbers onto the stack 
      	variablestack.push(myInteger);
      
        for(int myInteger=0;myInteger<5;myInteger++){									// pop those numbers off the stack
            try {																		// try block started
            	variablestack.pop();													// pop() method called
            } catch (Exception e) {														// catch statement 
               e.printStackTrace();}													
       }																				// for loop closed	
    }																					// Main method closed
}																						// class closed
