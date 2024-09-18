package com.dsa.gfg.stack;
import java.util.Stack;

public class EvaluatePostfixExpression {
	static int postFix(String s) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char exp = s.charAt(i);
			if(Character.isDigit(s.charAt(i))) {
				stack.push(exp - '0');
		}
			else
			{
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch(exp) {
				case '+':
					stack.push(val1+ val2);
					break;

				case '*':
					stack.push(val1 * val2);
					break;

				case '-':
					stack.push(val1 - val2);
					break;

				case '/':
					stack.push(val1/ val2);
					break;
				}
			}
		}

		return stack.pop();

	}

	public static void main(String[] args) {
		String expr = "231*+9-";
		System.out.println(postFix(expr));
	}

}
