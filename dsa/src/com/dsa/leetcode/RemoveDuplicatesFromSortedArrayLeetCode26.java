package leetcode;

public class RemoveDuplicatesFromSortedArrayLeetCode26 {
 public static int removeDuplicates(int[] nums) {
	 int j=1;
	 for(int i=0; i<nums.length-1;i++) {
	 if(nums[i]!=nums[i+1]){
        // nums[j] = nums[i+1];
         j++;
         }   
	 }
 return j;
 }
	
	public static void main (String[] args) {
		int [] arr = {1,1,3,6,7,8,8,8,0,};
		int ans =removeDuplicates(arr);
		System.out.println(ans);
	}
}
