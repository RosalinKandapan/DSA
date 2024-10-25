package com.dsa.gfg.stack;
import java.util.Stack;
public class ConvertInfixExpressionToPostfix {
	int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

      // Function to perform infix to postfix conversion
    void infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the scanned character is
            // an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
                result.append(c);

            // If the scanned character is
            // an ‘(‘, push it to the stack.
            else if (c == '(')
                st.push('(');

            // If the scanned character is an ‘)’,
            // pop and add to the output string from the stack
            // until an ‘(‘ is encountered.
            else if (c == ')') {
                while (st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); 
            }

            // If an operator is scanned
            else {
                while (!st.isEmpty() && (prec(c) < prec(st.peek()) ||
                                         prec(c) == prec(st.peek()))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
    	ConvertInfixExpressionToPostfix gfg = new ConvertInfixExpressionToPostfix();
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        gfg.infixToPostfix(exp);
    }
}
/*
 * Time Complexity: O(N), where N is the size of the infix expression
Auxiliary Space: O(N), where N is the size of the infix expression
 */