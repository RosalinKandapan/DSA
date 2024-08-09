package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesByMatch_Hackerrank {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		System.out.println(arr);
		int i = 0;
		int count = 0;
		while (i < arr.size() - 1) {
			Collections.sort(arr);
			if ((arr.get(i) ^ arr.get(i + 1)) == 0) {
				i += 2;
				count += 1;
			} else {
				i += 1;
			}
		}
		System.out.println("count" + count);

/*
 * (2 ^ 1)->3
 * 0 ^ 1->1
 * 1 ^ 1) ->0
 * 0 ^ 0 ->0
 * 0 ^ 3 ->3
 * 3 ^ 3 ->0
 */
 

	}

}
