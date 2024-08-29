package com.dsa.gfg.stack;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
public class ReverseStackUsingQueue {
	
	public static void reverse(Stack<Integer> stack) {
		Queue<Integer> que = new PriorityQueue<>();
		while(!stack.isEmpty()) {
			que.add(stack.peek());
			stack.pop();
			que.add(stack.pop());
		}
		
		while(!que.isEmpty()) {
			stack.push(que.peek());
			que.poll();
		}
	}

	public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    Iterator itr = stack.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next());
    	}
    reverse(stack);
    System.out.println();
     itr = stack.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next());
    	}
    }

}
