package com.dsa.gfg.stack; 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParenthesisChecker {
	
	public static Boolean areParenthesisBalanced(String str) {
	//	Stack<String> stack = new Stack<>();
		
		 // Using ArrayDeque is faster than using Stack class
		Deque<Character> stack  = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
              //  continue;
            }
            if (stack.isEmpty())
            	return false;
            char check;
            switch(x) {
            case'}':
            	check = stack.pop();
            	if(check == '(' || check=='[')
            		return false;
            break;
            case']':
            	check = stack.pop();
            	if(check == '(' || check=='{')
            		return false;
            break;
            case ')':
            check =stack.pop();
          	if(check == '[' || check=='{')
        		return false;
          	break;
		}
	}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String stack = "([{}])";
		 
        // Function call
        if (areParenthesisBalanced(stack))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        }
	}

/*
 * Time Complexity: O(N), Iteration over the string of size N one time.
Auxiliary Space: O(N) for the stack. 
*/
