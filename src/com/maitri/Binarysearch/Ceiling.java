package com.maitri.Binarysearch;

public class Ceiling {
    public static void main(String[] args){
        int[] arr = {7, 8, 9, 11, 12, 15, 16};
        int target = 10;
        int ans = ceilingNum(arr, target);
        System.out.println(ans);
    }
    //smallest element >= target
    static int ceilingNum(int[] arr, int target){
            //if target is greater than the greatest element in array
            if(target > arr[arr.length - 1]){
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return arr[mid]; //to return index -> mid
                }
            }
            return arr[start];
    }
}
