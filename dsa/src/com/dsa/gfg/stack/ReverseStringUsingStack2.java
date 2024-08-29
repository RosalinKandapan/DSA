package com.dsa.gfg.stack;
import java.util.Stack;
public class ReverseStringUsingStack2 {
	
	static void the_helper(StringBuilder str){
		//stack which takes char input.
		Stack<Character> s = new Stack<>();
		//we push all char in stack.
		for(int i=0;i<str.length();i++) s.push(str.charAt(i));
		//here we clear all char present in str.
		str.delete(0, str.length());
		// as stack is LIFO DS we append all char and our string is reverse now.
		while(!s.empty()){
		str.append(s.peek());
		s.pop();
		}
		}
		public static void main(String[] args) {
		//string we want to reverse.
		StringBuilder str = new StringBuilder("GeeksQuiz");
		//the function that make all necessary changes.
		the_helper(str);
		//finally return/output the reverse string
		System.out.println("Reversed string is : " + str);
		}
}
