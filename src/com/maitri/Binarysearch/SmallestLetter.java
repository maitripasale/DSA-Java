package com.maitri.Binarysearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 's';

        System.out.println(nextGreatestLetter(letters, target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    //second way without BS algorithm
    public static char nextGreatestLetter1(char[] letters, char target){
        int tIntValue = target;

        for(char c: letters){

            int charIntValue = c;

            if(charIntValue > tIntValue){
                return c;
            }
        }

        return letters[0];
    }
}
