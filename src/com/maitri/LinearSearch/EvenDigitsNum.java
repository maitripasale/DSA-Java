package com.maitri.LinearSearch;

public class EvenDigitsNum {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int num = -56798;
        System.out.println(digits(num));
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int element : nums){
            if(evenDigits(element)){
                count++;
            }

        }
        return count;
    }

    static boolean evenDigits(int num){
        int NoOfDigits = digits(num);
        return NoOfDigits % 2 == 0;
    }
    static int digits(int num){
        if(num < 0){
            num *= -1;
        }
        if(num == 0)
            return 1;

//        int count = 0;
//
//        while(num > 0){
//            num /= 10;
//            count++;
//        }
//        return count;
//          OR
        return (int)(Math.log10(num)) + 1;
 //       int ct=0;
//        for(int i:nums){
//            if((Integer.toString(i)).length()%2==0) ct++;
//        }
//        System.gc();
//        return ct;
    }
}
