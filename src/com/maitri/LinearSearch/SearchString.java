package com.maitri.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
//        String name = "Maitri Pasale";
//        char target = 'o';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.next();
        System.out.println("Enter the target character: ");
         String s = sc.next();
         char target = s.charAt(0);


        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(stringsearch2(name, target));

    }

    static boolean stringsearch(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){ // to use for-each loop, you need array collection. so tochararray()
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }

    static boolean stringsearch2(String str, char target)
    {
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
