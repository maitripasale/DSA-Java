package com.maitri.Binarysearch;

public class Floor {
    public static void main(String[] args){
        int[] arr = {7, 8, 9, 11, 12, 15, 16};
        int target = 17;
        System.out.println(floorNum(arr,target));
    }

    //return index : greatest element <= target
    static int floorNum(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}

