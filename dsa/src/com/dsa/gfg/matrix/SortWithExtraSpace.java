package com.dsa.gfg.matrix;

import java.util.Arrays;

public class SortWithExtraSpace {
	
	public static int[][] sortMatrix(int[][]mat, int n ){
		int [] temp = new int[n*n];
		int k =0;
		for(int i =0; i<mat.length;i++) {
			for (int j =0; j<mat[0].length; j++) {
				temp[k++] = mat[i][j];
			}
		}
		Arrays.sort(temp);
		k =0;
		for(int i =0; i<mat.length;i++) {
			for (int j =0; j<mat[0].length; j++) {
				mat[i][j] = temp[k++];
			}
		
	}
		return mat;
	}
		
		 static void printMat(int mat[][], int n)
		    {
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++)
		                System.out.print( mat[i][j] + " ");
		            System.out.println();
		        }
		    }

	public static void main(String[] args) {
		int [][] mat = {{4,5,6},{4,5,9},{7,8,9}};
		int n= 3;
		printMat(mat, n);
		sortMatrix(mat,n);
		printMat(mat, n);

	}

}
/*Time Complexity: O(n2log2n). 
Auxiliary Space: O(n2), since n * n extra space has been taken.*/
