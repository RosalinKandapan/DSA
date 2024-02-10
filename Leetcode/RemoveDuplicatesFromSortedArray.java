
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 3;
        
       
       int ans2 = removeDuplicates(arr);
       System.out.println(ans2);
		
	}
public static int removeDuplicates(int[] nums) {
        
        int occurance =1;
        int index =1;
        int k = 2;
 for(int i=1; i<nums.length;i++){
     if(nums[i]==nums[i-1]){
     occurance ++;
     } else {
          occurance = 1;
      }
      if(occurance <= k ){
          nums[index] = nums[i];
          index++;
      }
 }
      return index;  
    }
}
