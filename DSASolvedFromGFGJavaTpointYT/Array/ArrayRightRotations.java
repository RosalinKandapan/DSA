
public class ArrayRightRotations {
	
	public static int[] arrayRotate(int [] arr, int d, int n) {
		int p = 1;
		while(p<=d) {
		int first = arr[n-1];
		for(int i =n-1; i>0;i--) {
			arr[i] = arr[i-1];
			
		}
		arr[0]= first;
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
d - represents the complexity of some operation or nested loop within the algorithm.
*/