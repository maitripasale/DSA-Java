package com.maitri.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {19, 50, 30, 2, 4, 18, 34, 58, 79};
        int target = 4;
        int t = 30;

        int ans = Linear(nums, target);
        System.out.println(ans);
        System.out.println(Linear4(nums, t,1 ,6));


    }
        //return element
        static int Linear2(int[] arr, int target){
            if(arr.length == 0) {
                return -1;
            }

            //run a loop
            for (int element : arr) {
                //check for every index element if it's equal to target
                if (element == target) {
                    return element;
                }
            }

            //if none of the element found in array
            return Integer.MAX_VALUE;

        }

        //return index
       static int Linear(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }

            //run a loop
            for (int index = 0; index < arr.length; index++) {
                // check for element at every index if it is = target
                //int element = arr[index];
                if (arr[index] == target) { // or element == target
                    return index;
                }
            }

            //if none of the element found in array
            return -1;
        }

        //return ture or false
        static boolean Linear3(int[] arr, int target){
            if(arr.length == 0) {
                return false;
            }

            //run a loop
            for (int element : arr) {
                //check for every index element if it's equal to target
                if (element == target) {
                    return true;
                }
            }

            //if none of the element found in array
            return false;

        }

        //search in Range
        static int Linear4(int[] arr, int target, int start, int end) {
            if (arr.length == 0) {
                return -1;
            }

            //run a loop
            for (int index = start; index <= end; index++) {
                // check for element at every index if it is = target
                //int element = arr[index];
                if (arr[index] == target) { // or element == target
                    return index;
                }
            }

            //if none of the element found in array
            return -1;
        }



}
