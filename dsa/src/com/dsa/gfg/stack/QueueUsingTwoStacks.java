package com.dsa.gfg.stack;
import java.util.Stack;
public class QueueUsingTwoStacks {
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	
public static void enQueue(int x) {
	
	while(!stack1.isEmpty()) {
		stack2.push(stack1.pop());
	}
	stack1.push(x);
	
	while(!stack2.isEmpty()) {
		stack1.push(stack2.pop());
	}
}

public static int deQue() {
	if(stack1.isEmpty()) {
		return -1;
	}
	int x = stack1.peek();
	stack1.pop();
	return x;
}
	public static void main(String[] args) {
		QueueUsingTwoStacks queue= new QueueUsingTwoStacks();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println(queue.deQue());
		System.out.println(queue.deQue());
		System.out.println(queue.deQue());

	}

}



/*
 * Class name you can use Queue
 */
