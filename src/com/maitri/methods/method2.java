package com.maitri;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {

//        int ans = sum2(20, 40);
//        System.out.println(ans);
//    }
//
//        static int sum2(int a, int b){
//            int sum = a + b;
//            return sum;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String person = sc.nextLine();
        String naam = greeting(person);
        System.out.println(naam);

    }

         static String greeting(String name) {
            String message = "Hello " + name +". Welcome to Dubai";
            return message;
    }
}
