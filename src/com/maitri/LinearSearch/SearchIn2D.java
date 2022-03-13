package com.maitri.LinearSearch;

import java.util.*;


public class SearchIn2D {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 30, 5},
                {40, 59, 3, 1, 4},
                {156, 23, 78}
        };


        int target = 4;
        int[] ans = search(arr, target);
        // without Arrays.toString it'll return hashcode as variable passes to Object parameter and default its toString() method.
        System.out.println(Arrays.toString(ans));

        int max = maxitem(arr);
        System.out.println(max);
        System.out.println(minitem(arr));
    }

        static int[] search(int[][] arr, int target) {

            for(int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target)
                        return new int[]{row, col}; // new array will return which is not declared, hence new int[]
                }
            }

            return new int[]{-1,-1};
        }
        
        //search for max element 
        static int maxitem(int[][] arr) {
            int max = Integer.MIN_VALUE;
            for (int[] row : arr) {
                for (int element : row) {
                    if (element > max) { //arr[row][col] > max -> max = arr[row][col]
                        max = element;
                    }
                }
            }

            return max;
        }

    //search for min element
    static int minitem(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element < min) { //arr[row][col] < min -> min = arr[row][col]
                    min = element;
                }
            }
        }

        return min;
    }
}
