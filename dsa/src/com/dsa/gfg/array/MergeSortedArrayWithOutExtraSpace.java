package com.dsa.gfg.array;


public class MergeSortedArrayWithOutExtraSpace {
static int left,right,index=0;

	public static int[] mergeArray(int[] arr1, int [] arr2) {
		while(left<arr1.length && right<arr2.length) {
			if(arr1[left]<arr2[right]) {
			    left++;
			} else {
				arr1[left++] = arr2[right];
				left++; right++;
			}
		}
//		while(left<arr1.length) {
//			arr3[index]=arr1[left];
//			index++; left++;
//		}
//		while(right<arr2.length) {
//			arr3[index]=arr2[right];
//			index++; right++;
//		}
		return arr1;
	}
	public static void main(String[] args) {
     int [] arr1 = {1,2,3,0,0,0};
     int [] arr2 = {2,5,6};
        int [] ans=  mergeArray(arr1, arr2);
//   for (int i :ans) {
//	   System.out.println(i);
//   }
	}

}
/* Time complexity is O(n+m) because both the array adding in different arraylist
 * space complexity is O(n) because adding extra space
 */
