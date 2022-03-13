package com.maitri;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        //System.out.println(isArmStrong(n));

        //print all 3 digit Armstrong number
        for(int i = 100; i < 1000; i++)
        {
            if(isArmStrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    //to check whether num is Armstrong or not
    private static boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return sum == original;

    }
}
