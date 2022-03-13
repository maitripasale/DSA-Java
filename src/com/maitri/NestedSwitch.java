package com.maitri;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch(empId)
        {
            case 1:
                System.out.println("Maitri");
                break;
            case 2:
                System.out.println("Neil");
                break;
            case 3:
                System.out.println("emp 3");

                switch (department)
                {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                    default:
                        System.out.println("No department found");
                }
                break;
            default:
                System.out.println("enter valid emp id");
        }
    }
}
