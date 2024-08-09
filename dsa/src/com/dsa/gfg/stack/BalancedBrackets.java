package com.dsa.gfg.stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
static boolean areBracketsBalanced(String str) {
	Deque<Character> deque = new ArrayDeque<Character>();
	for (int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch == '{' ||ch == '['|| ch =='(' ){
			deque.push(ch);
		} else {
			char check;
			switch(ch) {
			case ']':
				check = deque.pop();
				if(check == '{'|| check == '(') return false;
				break;
			case '}':
			check = deque.pop();
			if(check == '['|| check == '(') return false;
			break;
			case ')':
			check = deque.pop();
			if(check == '{'|| check == '[') return false;
			break;
			}
		}
	}
  return (deque.isEmpty());
}
	public static void main(String[] args) {
		String s = "[(])";
		if(areBracketsBalanced(s)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
