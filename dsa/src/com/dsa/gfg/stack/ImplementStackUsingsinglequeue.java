package com.dsa.gfg.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingsinglequeue {
    Queue<Integer> q = new LinkedList<Integer>();


	void push(int val) 
    {
        // get previous size of queue
        int size = q.size();
         
        // Add current element
        q.add(val);
         
        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++) 
        {
            // this will add front element into
            // rear of queue
            int x = q.remove();
            q.add(x);
        }
    }
	public static void main(String[] args) {
		
		ImplementStackUsingsinglequeue queue = new ImplementStackUsingsinglequeue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
	}

}
