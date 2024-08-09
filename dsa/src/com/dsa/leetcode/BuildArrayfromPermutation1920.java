package com.dsa.leetcode;
public class BuildArrayfromPermutation1920 {
	public int[] buildArray(int[] nums) {
        int [] ans = new int [nums.length];
        int n = nums.length;
        for (int i =0; i<n ; i++ ){
            int index = nums[i];
            ans[i] = nums[index];
        }
        return ans;
    }

}
