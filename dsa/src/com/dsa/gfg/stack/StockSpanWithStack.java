package com.dsa.gfg.stack;
import java.util.Stack;
public class StockSpanWithStack {
	public  static void calculateSpan(int []price, int n, int s[]) {
		s[0]=1;
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		for(int i =1; i<n; i++) {
			while(!st.isEmpty()&& price[st.peek()]<=price[i]) 
				st.pop();
			s[i] = st.isEmpty()?i+1:i-st.peek();
			st.push(i);
		}
	}

	public static void main(String[] args) {

		int[] price = {10,4,5,90,1,20,80};
		int n = price.length;
		int []s = new int[n];
		calculateSpan(price, n, s);
	}

}
