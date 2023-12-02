package Recursion;

public class PowerOFFourRecursively {
	
	public static boolean isPowerOfFour(int n) {
		if(n==1) {
			return true;
		}
	boolean ans=	isPowerOfFour(n/4);
		return ans;
	}

	public static void main(String[] args) {
	boolean answer=	isPowerOfFour(65);
	System.out.println(answer);
	}

}
