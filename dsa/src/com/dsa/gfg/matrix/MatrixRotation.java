package com.dsa.gfg.matrix;

public class MatrixRotation {
	 // Function to rotate a N x M matrix by 90 degrees in clockwise direction
    static int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] newMat = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMat[j][n - i - 1] = mat[i][j];
            }
        }

        // Copy the rotated matrix back to the original matrix
        return newMat;
    }

    // Function to print the matrix
    static void displayMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Function call to rotate the matrix
     int ans[][]=   rotateMatrix(mat);

        // Print the rotated matrix
        displayMatrix(ans);
    }
}

/*
 * Time Complexity: O(N*M), as we are using nested loops for traversing the matrix.

Auxiliary Space: O(N*M), as we are using extra space for new matrix.
 */
