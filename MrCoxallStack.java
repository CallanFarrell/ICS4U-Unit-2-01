/*************************************
 * Created by: Callan Farrell.
 * Created on: Mar 2020
 * Created for: ICS4U
 * This program uses the class Stack, and pushes three numbers to it
 **************************************/

public class MrCoxallStack {
  /************************************
  * This program creates a stack.
  ***********************************/
  public static void main(String[] args) {
    // Instantiates stack
    Stack stack = new Stack();

    // Push 3 numbers
    stack.push(4);
    stack.push(8);
    stack.push(3);
    System.out.println(stack.toString());
  }
}