import java.util.Arrays;

public class MergeSortedArray88 {
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>= 0){
            if(nums1[i]>nums2[j]){
                 nums1[k] =nums1[i];
                   k--;
                   i--;
             
            } else {
                nums1[k]  = nums2[j];
             j--;
             k--;  
            }
        }
        while(i>=0){
            nums1[k] =nums1[i];
            k--; i--;
        }

         while(j>=0){
            nums1[k] =nums2[j];
            k--;
            j--;
        }
         return nums1;
    }

	public static void main (String [] args) {
		int [] nums1= {0};
		int [] nums2= {1};
		int m=0;
		int n=1;
		
	int[] ans=	merge(nums1,m,nums2,n);
	System.out.println(Arrays.toString(ans));
	}
 
}
/*space complexity we are not using any extra space
 * time complexicy O(n+m) becausewe are inserting k element to final array
 */
