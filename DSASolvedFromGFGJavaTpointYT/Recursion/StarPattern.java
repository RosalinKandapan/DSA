package Recursion;

public class StarPattern {
	
	public static void triangle(int r ,int c) {
		
		if(r==0) {
			return;
		}
		
		if(c<r) {
			System.out.print("*");
			triangle(r , c+1); //when stack will clear/finish executing (when method return)then only sysout will print.
			//System.out.print("*"); to print forward triangle
		} else {
			System.out.println();
			triangle(r-1 , 0);
			//System.out.println(); //to print forward triangle
			
		}
	}

	public static void main(String[] args) {
		triangle(4,0);
	}

}
