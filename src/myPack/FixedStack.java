/**
 * 
 */
package myPack;																				// Package declared
public class FixedStack implements Stack {													// Class FixedStack Declared- An implementation of Stack that uses fixed storage. 
	  private int stackSize[ ];																// Array declared
	  private int top;																		// Variable declared
	  
	  FixedStack(int size) {																// constructor to create stack with size
	   	stackSize=new int[size];															// new instance created
	    top=-1; }																			// value assigned to variable
	        
	  public void push(int I) {																// This method adds new entry to the top of the stack 
	     if(top==stackSize.length-1) {														// if loop expression .. to find stack overflow
	            System.out.println("\nStack Overflows");									// This will print the argument in the next line
	            int stackArray[ ]=new int[stackSize.length * 2];							// new instance created 		
	            for(int myInteger=0;myInteger<stackSize.length;myInteger++)					// for loop expression.. to increase the size of the stack
	            stackArray[myInteger]=stackSize[myInteger];									// array is assigned a integer value
	            stackSize=stackArray;														// value of array size is assigned to object stackArray
	            stackSize[++top]=I;}														// above conditions are true then push the value at top of the stack 
	     else																				// else condition 			
	            stackSize[++top]=I;}														// push the value at top of the stack 
	             
	  public int pop() {																	// Pop an item into the stack 
	     if(top<0) {																		// if the value a the top of the stake is less the 0 
	       System.out.println("Stack is empty. - Now Adding the entry.");					// This will print the argument in the next line
	       return stackSize[top++];}														// increment the the top of the stack 
	     else																				// else loop 
	       return stackSize[top--];}														// decrement the top of the stack		
}																							// FixecStack class closed
