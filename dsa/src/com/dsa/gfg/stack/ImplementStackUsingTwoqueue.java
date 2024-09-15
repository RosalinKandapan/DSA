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
	
	 static int top()
     {
         if (q1.isEmpty())
             return -1;
         return q1.peek();
     }
	  static void pop()
      {

          // if no elements are there in q1
          if (q1.isEmpty())
              return;
          q1.remove();
      }
	  
	 

		
	public static void main(String[] args) {
		
		ImplementStackUsingTwoqueue implementStackUsingTwoqueue = new ImplementStackUsingTwoqueue();
		implementStackUsingTwoqueue.push(1);
		implementStackUsingTwoqueue.push(2);
		implementStackUsingTwoqueue.push(3);
		for(Integer qw:q1) {
			 System.out.println("qw"+qw);
		}
		//System.out.println("current size: " + implementStackUsingTwoqueue.size());
        System.out.println(implementStackUsingTwoqueue.top());
        implementStackUsingTwoqueue.pop();
        System.out.println(implementStackUsingTwoqueue.top());
        implementStackUsingTwoqueue.pop();
        System.out.println(implementStackUsingTwoqueue.top());

      //  System.out.println("current size: " + implementStackUsingTwoqueue.size());
    	Queue<Integer> q3 = new LinkedList<Integer>();
    	q3.add(1);
    	q3.add(2);
    	q3.add(3);
    	for(Integer qq :q3) {
    		System.out.println("q3"+qq);
}
	}

}
