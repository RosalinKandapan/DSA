import javafx.util.Pair;

public class MaxMinInAnArray {
	
	static class Pair {
		 
        int min;
        int max;
    }

	public static Pair getMinMax(int[] arr, int n) {
		 Pair minMax = new Pair();
		 
		 if(n==1) {
			 minMax.max =arr[0];
			 minMax.min =arr[0];
		 }
		 if(n!=1) {
			 if(arr[0]>arr[1]) {
				 minMax.max =arr[0];
				 minMax.min =arr[1];
			 } else {
				 minMax.max =arr[1];
				 minMax.min =arr[0];
			 }
			 for(int i =2; i<n; i++) {
				 if(arr[i]>minMax.max) {
					 minMax.max=arr[i];
				 } else if(arr[i]<minMax.min) {
					 minMax.min=arr[i];
				 }
			 }
		 }
		return minMax;
	}
	
	
	public static void main(String args[]) {
		int [] arr = {1000, 11, 445, 1, 330, 3000};
		 int arr_size = 6;
	        Pair minmax = getMinMax(arr, arr_size);
	        System.out.println(minmax.max +"And" +minmax.min +" ");
	}
}


/*
 * Time Complexity: O(n)
Auxiliary Space: O(1) as no extra space was needed.
 */
