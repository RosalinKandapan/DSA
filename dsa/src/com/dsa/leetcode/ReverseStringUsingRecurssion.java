package leetcode;

public class ReverseStringUsingRecurssion {
	
	public static void reverseString(String s, int idx) {
		if(idx==0) {
			System.out.print(s.charAt(idx));
			return;
		}
		
		System.out.print(s.charAt(idx));
		reverseString(s,idx-1);
	}

	public static void main(String[] args) {
     String s="abcd";
     reverseString(s,s.length()-1);
	}

}
/*
 * Time Complexity O(n)
 * n->string length
 */
