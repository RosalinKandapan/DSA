package com.dsa.gfg.string;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] arr)
    {
       int n = arr.length;
       // take temp_prefix string and assign first element of arr : a.
       String result = arr[0];
       
       // Iterate for rest of element in string.
       for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(arr[i].indexOf(result) != 0){
               
                // update matched substring prefx
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
	
//	/*
//	 * public String longestCommonPrefix(String[] a)
//	
//    {
//        int size = a.length;
// 
//        /* if size is 0, return empty string */
//        if (size == 0)
//            return "";
// 
//        if (size == 1)
//            return a[0];
// 
//        /* sort the array of strings */
//        Arrays.sort(a);
// 
//        /* find the minimum length from first and last string */
//        int end = Math.min(a[0].length(), a[size-1].length());
// 
//        /* find the common prefix between the first and
//           last string */
//        int i = 0;
//        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
//            i++;
// 
//        String pre = a[0].substring(0, i);
//        return pre;
//    }
//*/
 
    // Driver Function to test other function 
    public static void main(String[] args)
    {
    	LongestCommonPrefix gfg = new LongestCommonPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                                   gfg.longestCommonPrefix(input));
    }
}
