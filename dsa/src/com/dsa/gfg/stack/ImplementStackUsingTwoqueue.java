package com.dsa.gfg.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoqueue {
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();

	public static void push(int x) {
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();		
			}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	public static void main(String[] args) {
		
		ImplementStackUsingTwoqueue implementStackUsingTwoqueue = new ImplementStackUsingTwoqueue();
		implementStackUsingTwoqueue.push(1);
		implementStackUsingTwoqueue.push(2);
		implementStackUsingTwoqueue.push(3);
		implementStackUsingTwoqueue.push(4);


	}

}
