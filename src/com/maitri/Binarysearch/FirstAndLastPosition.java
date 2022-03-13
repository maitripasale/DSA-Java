package com.maitri.Binarysearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args){
    int[] arr = {5,7,7,8,8,10};
    int target = 8;
    int[] ans = searchRange(arr, target);
    System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        // check for first occurrence of target
        ans[0] = searchIndex(nums, target, true); // start
        if(ans[0] != -1) {
            ans[1] = searchIndex(nums, target, false); //end
        }
        //ans[0] = start, ans[1] = end;
        return ans;
    }

    // this method returns the index value of target
    static int searchIndex(int[] nums, int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;

            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                //possible ans found
                ans = mid;
                if(startIndex){
                    end = mid - 1;

                }
                else{
                    start = mid + 1;
                }

            }
        }
        return ans;

    }
}
