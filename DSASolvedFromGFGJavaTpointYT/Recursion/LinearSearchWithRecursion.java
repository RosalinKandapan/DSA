package Recursion;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
	static int indexNumber;
	static int index;

	public static int Search(int[] arr, int index, int target) {

		if (arr[index] == target) {
			return index;
		}
		return Search(arr, index - 1, target); // method return 0
	}

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static ArrayList<Integer> findAllIndex(int[] arr, int index, int target) {
		if (index == -1) {
			return list;
		}

		if (arr[index] == target) {
			list.add(index);
		}
		return findAllIndex(arr, index - 1, target); //if method is void no need to write return
	}

	public static void main(String[] args) {
		int[] arr = { 19, 2, 4, 1, 19 };
		index = arr.length - 1;
		int indexNumber = Search(arr, index, 19);
		System.out.println("index number is:" + indexNumber);
		System.out.println(findAllIndex(arr, index, 19));
	}

}
