package com.dsa.gfg.stack; 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParenthesisCheckerWithoutStack {
	
	public static Boolean areParenthesisBalanced(String s) {
		int i = -1;
		char[] charArray = new char[s.length()];
		for(char ch : s.toCharArray()) {
			if(ch == '('|| ch == '{'|| ch =='[') {
				charArray[++i] = ch;
			}else {
				if(i>=0 && ((charArray[i]=='('&& ch ==')') ||
						(charArray[i]=='{'&& ch =='}')||
						(charArray[i]=='['&& ch ==']'))){
					i--;
				}else {
					return false;
				}
			}
		}
		return i == -1;
	}
	public static void main(String[] args) {
		String stack = "([]){{}";
		 
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
