package Recursion;
// 0 1 1 2 3 5 8 13
public class Fibonacci_recussion {
	
	public static int fact(int n) {
		if(n<2) {
			return n;
		}
       return  fact( n-1) + fact( n-2);

		
	}

	public static void main(String[] args) {
 int ans =   fact(10);
 System.out.println(ans);
	}

}
