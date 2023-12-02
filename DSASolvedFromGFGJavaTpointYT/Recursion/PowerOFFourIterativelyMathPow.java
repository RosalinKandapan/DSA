package Recursion;

public class PowerOFFourIterativelyMathPow {

	 public static boolean isPowerOfFour(int n)
	    {
	        if (n != 0 && n == (int)Math.pow(4, (Math.log(n) / Math.log(4)))) {
	            return true;
	        }
	        return false;
	    }
	 
	    public static void main(String[] args)
	    {
	       
	        int test_no = 2;
	        if (isPowerOfFour(test_no)) {
	            System.out.print(test_no + " is a power of 4 ");
	        }
	        else {
	            System.out.print(test_no
	                             + " is not a power of 4");
	        }
	    }

}
