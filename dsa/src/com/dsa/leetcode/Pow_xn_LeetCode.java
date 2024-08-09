package leetcode;

public class Pow_xn_LeetCode {
	public static double  power(double x, int n) {
		if(n==0) {
			return 1;
			}
		if(n<0) {
		double	 np =n*-1;
		double npp=np*np;
			double xmm=1.0/0.27; 
			System.out.println("xm"+ xmm);
			return xmm;
		}
			double xnm1= power( x, n-1); //method will call till n==0
			double xn =x*xnm1;
			System.out.println("xn"+ xn);
			return xn;
		
	
	}

	public static void main(String[] args) {
		power(34.00515, -3);
	}

}

/*
 * Tc-O(n)(looping from 1-n)
 * sC-O(1)(not using any extra space )
 * */
 


/* Second Approach:
 * 	double ans=1.0;
		long   nn=n;
		if(nn<0) nn =-1*nn;
		while(nn) {
			if(nn%2) {
				ans= ans*x;
				nn= nn-1;
			}else {
				x=x*x;
				nn=nn/2;
			}
			
		}
		if(nn<0) ans= (double)(1.0)/ (double)(ans);
		return (int) ans;
 */
