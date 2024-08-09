package com.dsa.leetcode;
public class JumpGame2 {

int totalJums, coverage, lastJumpIdx =0 ;
    
    public int jump(int[] nums) {
        int destination = nums.length-1;
        if (nums.length==1) return 0;
        for(int i =0; i<nums.length-1;i++){
            coverage = Math.max(coverage, i+nums[i]);
            if(i ==lastJumpIdx){
                lastJumpIdx = coverage;
                totalJums ++;
            if(coverage>=destination) return totalJums;
             }
        }
        return totalJums;
    }
	public static void main(String[] args) {

		
	}

}
