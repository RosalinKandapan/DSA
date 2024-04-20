
public class ArrayLeftRotations {
	
	public static int[] arrayRotate(int [] arr, int d, int n) {
		int p = 1;
		while(p<=d) {
		int last = arr[0];
		for(int i =0; i<n-1;i++) {
			arr[i] = arr[i+1];
			
		}
		arr[n-1]= last;
		p++;
		}
		return arr;
	}

	public static void main (String[]a) {
		
		int arr[] = {1,2,3,4,5};
		for(int a1: arr) {
			System.out.print(a1);
		}
		System.out.println();
		int d= 2;
		int n= arr.length;
	int[] ans=	arrayRotate(arr,d,n);
	for(int a1: ans) {
		System.out.print(a1);
	}
	
	}
}
/**
Time Complexity: O(N * d)
Auxiliary Space: O(1)
*/