package array;

public class MinimumNumberOfArray {
	
	public static int min(int arr[]) {
		int min =arr[0];
		for(int i=1; i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
		}
		return min;
	}

	public static void main(String[] args) {
//		int arr[]= new int [5];
//		arr[0]=5;
		
//		int a[]= {5,6,1,8,-1};
//		int ans=	min(a);
		int ans =min(new int[] {7,6,0,7,2});
		System.out.println("Minimum Number is: "+ ans);

	}

}
