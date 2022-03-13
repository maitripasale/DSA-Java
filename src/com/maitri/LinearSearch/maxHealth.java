package com.maitri.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/submissions/
public class maxHealth {
    public static void main(String[] args){
        int[][] arr = { {2,8,7},
                        {7,1,3},
                        {1,9,5}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        //row = person
        //col = account
        int ans = Integer.MIN_VALUE;
        for(int[] row : accounts){ //for(person=0; person<accounts.length; person++)
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for(int col : row) //for(acc=0; acc<accounts[person].length; acc++)
                sum += col;
            // now we have sum of person's accounts
            // check with overall ans
            if (sum > ans) { //OR ans = Math.max(ans, sum);
                ans = sum;
            }


        }
        return ans;
    }


}
