package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Twosum {
	    public static int[] twoSum(int[] nums, int target) {
	        int n=nums.length;
	        Map<Integer,Integer> map=new HashMap<>();
	        int[] result=new int[2];
	        for(int i=0;i<n;i++){
	            if(map.containsKey(target-nums[i])){//4-3 
	                result[1]=i;////1 =3
	                result[0]=map.get(target-nums[i]); //4-3=1
	                return result;
	            }
	            map.put(nums[i],i);
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	    	int[] nums = new int [] {1,3,2};
	    	twoSum( nums, 4);
	    }
}
