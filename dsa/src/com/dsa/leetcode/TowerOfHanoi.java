package leetcode;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n, String source, String helper, String destination) {
		
		if(n==1) {
			towerOfHanoi( n,  source, helper, destination) ;
			System.out.println("transfer disk" + n +"from "+source +"to"+ destination);
			return;
		}
		
		towerOfHanoi( n-1,  source, destination ,  helper) ;
		System.out.println("transfer disk" + n +"from "+source +"to"+ destination);
		towerOfHanoi( n,  helper, source ,  destination) ;
		
	}

	public static void main(String[] args) {
		towerOfHanoi(1, "S", "H", "D");

	}

}
