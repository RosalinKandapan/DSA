package array;

public class MergeSortedArrayWithExtraSpace {
static int left,right,index=0;

	public static int[] mergeArray(int[] arr1, int [] arr2, int [] arr3) {
		while(left<arr1.length && right<arr2.length) {
			if(arr1[left]<arr2[right]) {
				arr3[index] = arr1[left];
				index++; left++;
			} else {
				arr3[index] = arr2[right];
				index++; right++;
			}
		}
		while(left<arr1.length) {
			arr3[index]=arr1[left];
			index++; left++;
		}
		while(right<arr2.length) {
			arr3[index]=arr2[right];
			index++; right++;
		}
		return arr3;
	}
	public static void main(String[] args) {
     int [] arr1 = {1,2,5};
     int [] arr2 = {3,6};
     int [] arr3 = new int[arr1.length+arr2.length];
     
   int [] ans=  mergeArray(arr1, arr2, arr3);
   for (int i :ans) {
	   System.out.println(i);
   }
	}

}
