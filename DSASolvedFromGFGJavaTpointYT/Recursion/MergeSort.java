package Recursion;

import java.util.Arrays;

public class MergeSort {

public static void main(String[] args) {
int [] arr = {5,4,3,2,1,0};
int [] ans= mergeSort(arr); 
// arr= mergeSort(arr); 
System.out.println(Arrays.toString(ans));
	}
	public static int [] mergeSort(int [] arr) {
		if(arr.length == 1) {
			return arr;
		}
	int	mid =arr.length/2;
		int[] leftArray =mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] rightArray =mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
	return	merge(leftArray,rightArray);
		
	}	
	public static int [] merge(int [] first,int [] second ) {
		int i=0;
		int j=0;
		int k=0;
	
		int [] mergeArray = new int [first.length+second.length];
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mergeArray[k]=first[i];
				i++;
				
			} else {
				mergeArray[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			mergeArray[k] =first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			mergeArray[k] =second[j];
			j++;
			k++;
		}
		return mergeArray;
   }
}