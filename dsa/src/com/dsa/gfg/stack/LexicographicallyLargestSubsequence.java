package com.dsa.gfg.stack;
import java.util.Stack;

public class LexicographicallyLargestSubsequence {

	 static String lexicoMaxSubsequence(String s, int n)
	    {
	        Stack<Character> st = new Stack<>();
	 
	        // Stores if any alphabet is present
	        // in the current stack
	        int[] visited = new int[26];
	        int[] cnt = new int[26];
	        for (int i = 0; i < 26; i++) {
	            visited[i] = 0;
	            cnt[i] = 0;
	        }
	 
	        // Findthe number of occurrences of
	        // the character s[i]
	        for (int i = 0; i < n; i++) {
	            cnt[s.charAt(i) - 'a']++;
	        }
	        for (int i = 0; i < n; i++) {
	 
	            // Decrease the character count
	            // in remaining string
	            cnt[s.charAt(i) - 'a']--;
	 
	            // If character is already present
	            // in the stack
	            if (visited[s.charAt(i) - 'a'] > 0) {
	                continue;
	            }
	 
	            // if current character is greater
	            // than last character in stack
	            // then pop the top character
	            while (!st.empty() && st.peek() < s.charAt(i)
	                   && cnt[st.peek() - 'a'] != 0) {
	                visited[st.peek() - 'a'] = 0;
	                st.pop();
	            }
	 
	            // Push the current character
	            st.push(s.charAt(i));
	            visited[s.charAt(i) - 'a'] = 1;
	        }
	 
	        // Stores the resultant string
	        String s1 = "";
	 
	        // Generate the string
	        while (!st.empty()) {
	            s1 = st.peek() + s1;
	            st.pop();
	        }
	 
	        // Return the resultant string
	        return s1;
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	        String S = "ababc";
	        int N = S.length();
	        System.out.println(lexicoMaxSubsequence(S, N));
	    }

}
/*
 * Time Complexity: O(N)
   Auxiliary Space: O(N)
 */
