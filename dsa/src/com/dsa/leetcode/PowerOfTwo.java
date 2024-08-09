package leetcode;

public class PowerOfTwo {
	  public static boolean isPowerOfTwo(int n) {

          int val = n & n-1;
          if(n>0 && val==0){
              return true;
          } 
              return false;
  }
	public static void main(String[] args) {
		boolean ans= isPowerOfTwo(4);
		System.out.println(ans);
	}

}

/*
 * int val = n & n-1;
            if(!(n<=0) && val==0){
                return true;
            } 
                return false;
 */
