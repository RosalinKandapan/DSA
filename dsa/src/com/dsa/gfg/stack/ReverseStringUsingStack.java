package com.dsa.gfg.stack;
class Stack {
    int size;
    int top;
    char[] a;
 
    // function to check if stack is empty
    boolean isEmpty() { return (top < 0); }
 
    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }
    
    public void push(char ch) {
    	if(top>=size) {
    		System.out.println("stack over flow");
    	}
    	else a[++top] = ch;
    }
    public char pop() {
    	if(top<0) {
    		System.out.println("stack under flow");
    		return 0;
    	}else {
    		char c = a[top];
        	top--;
        	return c;
    	}
    }
}
public class ReverseStringUsingStack {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Geeks");
		 int n = s.length();
	        Stack obj = new Stack(n);
	        for (int i=0;i<n;i++) {
	        	obj.push(s.charAt(i));
	        }
	        for(int i =0;i<n;i++) {
	        	char c=obj.pop();
	        	s.setCharAt(i, c);
	        	
	        }
	        System.out.println("Reverse string is :"+s);
	}

}
