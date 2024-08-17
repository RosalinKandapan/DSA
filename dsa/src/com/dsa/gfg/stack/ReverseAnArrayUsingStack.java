package com.dsa.gfg.stack;

public class ReverseAnArrayUsingStack {
	
	int top;
	int[] a;
	int size;
 
	// constructor
	
	ReverseAnArrayUsingStack(int n)
	{
		top = -1;
		size = n;
		a = new int[size];
		
		
	}
	
	
	//push
	
	public void push(int ele) {
		if(top>=size) {
			System.out.println("stack overflow");
		}else {
			a[++top] = ele;
		}
	}
	//pop
	public int  pop() {
		int el;
		if (top < 0) {
            System.out.println(
                "Stack Underflow");
            return 0;
        }else {
        	 el = a[top--];
        }
		
		return el;
	}
	
	
	
	public static void main(String[] args) {
		int n = 4;
		int [] arr = {12,13,45,48};
		ReverseAnArrayUsingStack obj = new ReverseAnArrayUsingStack(n);
		for(int i =0; i<arr.length;i++) {
			obj.push(arr[i]);
		}
		for(int i =0; i<n;i++) {
			int popele=	obj.pop();
			arr[i] =popele;
		}
		for(int i =0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
