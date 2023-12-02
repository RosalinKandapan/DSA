package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlusMultArray_hackerrankGoldmanSach {
	public static String plusMult(List<Integer> A) {
	int n = A.size();
	int odd_sum = 0;
	int x = 0;
	int y = 0;
	int even_sum = 0;
	for(int i = 0; i < n; i ++)
	{
	if (i%2 ==0)
	{
	if(x%2==0)
	{
	even_sum += A.get(i);
	x++;
	}
	else
	{
	even_sum *= A.get(i);
	x++;
	}
	}
	else
	{
	if(y%2==0)
	{
	odd_sum += A.get(i);
	y++;
	}
	else
	{
	odd_sum *= A.get(i);
	y++;
	}
	}
	}
	x = even_sum % 2;
	y = odd_sum % 2;
	if(x > y)
	{
		System.out.println("e");
	return "EVEN";
	}
	else if(x < y)
	{
		System.out.println("O");
	return "ODD";
	}
	System.out.println("N");
	return "NEUTRAL";
	}
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		A.add(9);
		A.add(10);

	}
}
