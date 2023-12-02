package Recursion;
//5! = 5*4*3*2*1 = 120  
public class factorialNumberRecursively {
	
	/* public static int factorial(int n){
		if(n==0 || n==1) {
			return 1;
		}
		return n* factorial( n-1);
		
	}
	public static void main (String [] args) {
		
		int ans = factorial(5);
		System.out.println(ans);
	} */
	
	
	public static int print(int n){
		if(n==5) {
			return n;
		}
		return  n + print( n+1);
		
	}
	public static void main (String [] args) {
		
		int ans = print(1);
		System.out.println(ans);
	}

}
/*
 * Time Complexity: O(n),The time complexity of the above code is O(n) as the recursive function is called n times. 
Space Complexity: O(n),The space complexity is also O(n) as the recursive stack of size n is used.
 */
