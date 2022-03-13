package com.maitri.LinearSearch;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {13, 60, -7, 2, 0, -8, 56, 100, 4000};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
