package leetcode;

public class ReverseNumberWithRecurssion {
	
	static int sum=0;
	
	public static int reverseNumber(int n) {
		if(n==0) {
			return n;
		}
		int rem =n%10;
		
		sum= sum*10+rem;
		 reverseNumber(n/10);
		 return sum;
		
	}

	public static void main(String[] args) {
		reverseNumber(1342);
		System.out.println("reverse:"+sum);
	}

}
