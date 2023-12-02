package Recursion;

public class printN {
	static int num;

	public static void main(String[] args) {
		fun(1);
		System.out.println("numis: "+num);
	}

	static int fun(int n) {
		if (n == 8) {
			return n;
		}
		System.out.println(n);
		return num= fun (n + 1); //first base func return 5so, return 5
//for --n && n--

	}
}
