package com.maitri.Binarysearch;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndex {
    public static void main(String[] args){
        int[] nums = {1,2,1,5,6,4,3,1};
        int ans = peakIndexInMountainArray(nums);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) { //dec part
                //end != mid - 1 cuz this may be possible ans but still look at left
                end = mid;
            } else {
                //asc part of array
                start = mid + 1; // mid+1 element > mid element
            }
        }

        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // if we are saying that only one item is remaining, cuz of the best possible ans
        return start; // or return end as both are =
    }
}
