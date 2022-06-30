package com.maitri.arrays;

import java.util.Arrays;

public class PassFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 98, 3, 36};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 107;
    }
}
