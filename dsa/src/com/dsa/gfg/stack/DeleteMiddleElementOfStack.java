package com.dsa.gfg.stack;
import java.util.Stack;
import java.util.Vector;
public class DeleteMiddleElementOfStack {

	public static void main(String []args) {
		int n2 = 5%2;
		int n1 = 5/2;
		System.out.println(n2 +" " +n1);
		Stack<Integer> stck = new Stack<>();
		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);
		stck.push(5);
		stck.push(6);
//		System.out.println("before loop");
//		while(!stck.empty()){
//			Integer s = stck.pop();
//			
//			System.out.print(s +" ");
//		}
		Vector<Integer> vec = new Vector<>();
		while(!stck.empty()) {
			vec.add(stck.pop());
		}
		int n = vec.size();
		if(vec.size()%2==0) {
			int target = n/2;
			for(int i =0; i<n; i++) {
				if(i==target) {
					continue;
				}
				else {
				stck.push(vec.get(i));	
				}
			}
		} else {
			int target = n/2;
			for(int i =0; i<n; i++) {
				if(i==target) continue;
				
				else {
				stck.push(vec.get(i));	
				}
		}
		
	 }
		while(!stck.empty()){
			Integer s = stck.pop();
			System.out.print(s +" ");
		}
	}
}
/*Time Complexity: O(N), For the Traversing.
Auxiliary Space: O(N), For the Vector.*/