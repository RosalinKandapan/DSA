package com.dsa.gfg.stack;
import java.util.Stack;
import java.util.StringTokenizer;


public class ReverseIndividualWords {
	
	public static void reverseWord(String str) {
		Stack<Character> st = new Stack<>();
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}else {
				while(st.empty()==false){
					System.out.print(st.pop());
				}
					System.out.print(" ");
			}
			
		}
		//for last word which don't have space
		while(st.empty()==false) {
			System.out.print(st.pop());
		}
	}
	public static void main (String [] args) {
		String str = "Geeks For Geeks";
		StringTokenizer iss = new StringTokenizer(str);
		while(iss.hasMoreTokens()) {
			String word = iss.nextToken();
			System.out.println(new StringBuilder(word).reverse().toString());
		}
		System.out.println("....");
		reverseWord(str);
	}

}

/*
 * Time Complexity: O(n), where n is the length of the string
Auxiliary Space: O(n), where n is the length of the string
*/
