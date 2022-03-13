package com.maitri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //String fruit = sc.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("sweet red fruit");
//            case "Banana" -> System.out.println("great calcium");
//            case "Orange" -> System.out.println("High in Vitamin c");
//            default -> System.out.println("please enter valid fruit");
//        }

        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
