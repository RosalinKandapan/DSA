package com.dsa.gfg.array;

public class CommonElementsInThreeSortedArrays {
	static void findIntersection(int[] arr1, int[] arr2,
            int[] temp, int m, int n,
            int[] k)
{
int i = 0, j = 0;
// Loop to find the intersection of arr1[] and
// arr2[]
while (i < m && j < n) {
// ith element can't be a common element
if (arr1[i] < arr2[j]) {
i++;
}
// jth element can't be a common element
else if (arr2[j] < arr1[i]) {
j++;
}
// if arr1[i] == arr2[j]
else {
temp[k[0]] = arr1[i];
i++;
j++;
k[0]++;
}
}
}

public static void main(String[] args)
{

int[] arr1 = { 2, 5, 10 };
int[] arr2 = { 1, 2, 5};
int[] arr3 = { 2, 3, 5};
int n1 = arr1.length;
int n2 = arr2.length;
int n3 = arr3.length;

// temp array to store the common elements of arr1
// and arr2 arrays
int[] temp = new int[200000];

// ans array to store the common elements of temp
// and arr3 arrays
int[] ans = new int[200000];

int[] k = {
0
}; // Mutable integer to simulate pass-by-reference

// function call to find the temp array
findIntersection(arr1, arr2, temp, n1, n2, k);
int tempSize = k[0];
k[0] = 0;

// function call to find the ans array
findIntersection(arr3, temp, ans, n3, tempSize, k);

System.out.println(
"Common elements present in arrays are :");

// Printing the common elements
for (int i = 0; i < k[0]; i++) {
System.out.print(ans[i] + " ");
}
System.out.println();
}
}
