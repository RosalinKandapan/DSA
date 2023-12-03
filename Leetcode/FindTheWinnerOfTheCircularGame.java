package leetcode;

public class FindTheWinnerOfTheCircularGame {
	
	public static int solve(int n, int k) {
		if(n==1) {
			return 0;
		}
		return (solve(n-1,k)+k)%n;
	}

	public static void main(String[] args) {
int ans = solve(5,2)+1;
System.out.println(ans);
	}

}
