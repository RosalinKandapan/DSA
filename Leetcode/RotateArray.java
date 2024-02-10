/*
 * first need to devde while array in to 2 part part  k = k % nums.length; 
 * 1part will reverse first then 2nd part will reverse
 * then whole array will reverse.
 * for -ve k case, scenario is added
*/
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = new int[7];
		arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        int k =3;
        rotate(arr,3);
	}

	public static int[] reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
		return nums;
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; 
        //for -ve scenario
        if(k < 0){ 
            k += nums.length;
        }
        nums = reverse(nums, 0, nums.length - k - 1);
        nums = reverse(nums, nums.length - k, nums.length - 1);
        nums = reverse(nums, 0, nums.length - 1);
        for(int num: nums) {
    		System.out.print(num);
    	}
    }
}
