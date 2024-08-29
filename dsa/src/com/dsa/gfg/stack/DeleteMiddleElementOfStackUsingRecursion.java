package com.dsa.gfg.stack;
import java.util.Iterator;
import java.util.Stack;
public class DeleteMiddleElementOfStackUsingRecursion {
	
	public static void deleteMid(Stack<Integer> stck, int n, int curr) {
	
		if(stck.empty() || curr==n) {
			return;
		}
		Integer x = stck.pop();
		
		deleteMid(stck,n, curr+1);
		if(curr!=n/2) {
			stck.push(x);
		}
	}

	public static void main(String []args) {
		Stack<Integer> stck = new Stack<>();
		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);
		stck.push(5);
		stck.push(6);
		stck.push(7);
		deleteMid(stck, stck.size(),0);
		for (int i = 0; i < stck.size(); i++) {
			 System.out.print(stck.get(i));
		}
		for(Integer s :stck ) {
			System.out.print(s);
		}
		Iterator<Integer> st = stck.iterator();
		while(st.hasNext()){
		System.out.print(st.next());
		}
		
		while(!stck.empty()){
			Integer s = stck.pop();
			System.out.print(s +" ");
		}
	}
}
/*Time Complexity: O(N), For the Traversing.
Auxiliary Space: O(N), For the Vector.
After iterating the stack using for, foreach, 
Iterator , the stack is print from  bottom to top however
if you are using while loop and pop() at a time 
it will print top to bottom
*/