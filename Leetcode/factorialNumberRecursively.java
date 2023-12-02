package leetcode;

public class factorialNumberRecursively {
	static int factorial(int n)
    {
		System.out.println("Factorial of 5 is :" + n);
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
 
	public static void main(String[] args) {
		 int ans = factorial(5);
	        System.out.println("Factorial of 5 is :" + ans);
	    
	}

}
/*
 * Time Complexity: O(n),The time complexity of the above code is O(n) as the recursive function is called n times. 
Space Complexity: O(n),The space complexity is also O(n) as the recursive stack of size n is used.
 */
