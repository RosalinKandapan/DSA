package Recursion;

import java.util.Arrays;

public class BubbleSort {
	static int [] arr= {1,4,2,3,0};
	static  void sorting(int [] arr, int r, int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
		if(arr[c]>arr[c+1]) {
			int temp= arr[c];
			arr[c]= arr[c+1];
			arr[c+1] = temp;
		}
		sorting(arr, r,  c+1);

		} else {
			sorting(arr, r-1,  0);
		}
	}	
	public static void main(String[] args) {
		sorting(arr, arr.length-1,  0);
		System.out.println(Arrays.toString(arr));
   }
}