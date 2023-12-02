package Recursion;

public class Sum {
	static	int sumNum=0;

	  static int sumReverse(int n) {
		  if(n==0) {
			  return n;
		  }
	sumNum= n%10 + sumReverse(n/10);
		return sumNum; 
		
	}
	public static void main(String[] args) {
sumReverse(1342);

System.out.println("execute:" +sumNum);	
}

}
