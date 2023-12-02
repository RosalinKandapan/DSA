package leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x=10, temp;
		int reverse=0;
		temp=x;
		while(x !=0)
		{
			int remainder=x%10;
			reverse=reverse*10+remainder;
			x=x/10;
            
		}
         if(temp==reverse && !(temp <0))
            {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            } 

	}
	
	

}
