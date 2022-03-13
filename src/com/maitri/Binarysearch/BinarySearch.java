package com.maitri.Binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] bs = {2, 6, 8, 13, 16, 20, 29, 30, 47};
        int target = 30;
        int ans = binaryS(bs, target);
        System.out.println(ans);

    }

    static int binaryS(int[] arr, int target) {
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
        return -1;
    }
}
