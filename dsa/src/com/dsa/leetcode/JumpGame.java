package com.dsa.leetcode;
public class JumpGame {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int[] arr2 = new int[7];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 0;
        arr[4] = 4;
        
        arr2[0] = 3;
        arr2[1] = 2;
        arr2[2] = 1;
        arr2[3] = 0;
        arr2[4] = 4;
     boolean ans =   canJump(arr2);
     System.out.println(ans);
	}
        
        public static boolean canJump(int[] nums) {
            int reachable = 0;
            for(int i = 0; i < nums.length; i ++) {
                if(i > reachable) return false;
                reachable = Math.max(reachable, i + nums[i]);
            } 
            return true;
         }
	
}