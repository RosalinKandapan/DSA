package com.dsa.gfg.matrix;
public class TraverseMatrix {
//Iteratively
	public static void print(int [][]arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
	
	//recursively
	
	private static final int N = 3;
    private static final int M = 3;
 
    // Recursive function to traverse the matrix
    private static void traverse(int[][] arr, int i, int j) {
        // If the current position is the bottom-right corner of

    	// the matrix
        if (i == N - 1 && j == M - 1) {
            // Print the value at that position
            System.out.println(arr[i][j]);
            // End the recursion
            return;
        }
 
        // Print the value at the current position
        System.out.print(arr[i][j] + ", ");
 
        // If the end of the current row has not been reached
        if (j < M - 1) {
            // Move right
            traverse(arr, i, j + 1);
        }
        // If the end of the current column has been reached
        else if (i < N - 1) {
            // Move down to the next row
            traverse(arr, i + 1, 0);
        }
    }
	
	public static void main(String [] args) {
		int arr[][] = {{1,2,3},
					{6,7,0},
					{4,5,6,9},
					{1,2,3,4}};
		print(arr);
		traverse(arr,0,0);
	}
}
