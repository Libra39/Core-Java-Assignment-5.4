package myPack;																									// Package declared
public class VariableStack implements Stack {																	// Class VariableStack Declared- An implementation of Stack that uses fixed storage. 
    private int stackSize[ ];																					// array declared
    private int top;																							// variable declared
    
    VariableStack(int size){																					// constructor to create stack with size
    	stackSize=new int[size];																				// new instance created
            top=-1;}																							// value assigned to variable
    
    private void increaseStackCapacity(){                                                                       // method created to increase the capacity of the of the stack
        int[] stackArray = new int[this.stackSize.length*2];													// new instance created
        for(int myInteger=0;myInteger<stackSize.length;myInteger++){											// increasing the size of the stack
            stackArray[myInteger] = this.stackSize[myInteger]; }												// array is assigned a integer
        this.stackSize = stackArray;}																			// stack size is equal to an array
    
    private boolean isStackFull() {																				// This method returns true if the stack is full
    	return (top == stackSize.length - 1);}																	// if stack is full then top of the stack is equal to the size of stack -1	
    
    public void push(int I){																					// This method adds new entry to the top of the stack
        if(this.isStackFull()){																					// if loop expression .. method is called
            System.out.println(("Dynamic/Variable Stack is Full - Now Dynamic/Variable is overflowing. "		// This will print the argument in the next line
            		           + "\nIncreasing the capacity of the Stack."));
            this.increaseStackCapacity();}																		// called the method increaseStackCapacity()
        System.out.println(+I);																					// print the variable I value
        this.stackSize[++top] = I;}																				// increment the size of the stack and stored in the variable I
    
    public boolean isStackEmpty() {																				// This method returns true if the stack is empty
        return (top == -1); }
       
    public int pop() {																							// This method removes an entry from the top of the stack
        if(this.isStackEmpty()){																				// if loop ... method is called
            try {																								// try block starts
				throw new Exception("Stack is empty. Can not remove element.");									// exception handled	
			} catch (Exception e) {																				// catch statement
			   e.printStackTrace();	}
            }																									// if loop closed	
        int I = this.stackSize[top--];																			// variable I assigned the value of stack size
        System.out.println("Stake is full - Now Removing entry : "+I);											// print the argument at the new line
        return I;																								// if condition is true then give the value of variable I
    }																											// pop() method closed
}																												// VariableStack class closed
