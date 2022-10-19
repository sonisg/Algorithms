package com.company.basics;

public class FibonacciSeries {

    static void fib(int n){

        int firstNo = 0;
        int secondNo = 1;
        int c =0;
        while(c < n) {
            System.out.println(firstNo);
            int thirdNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = thirdNo;
            c++;
        }
    }
    public static void main(String args[])
    {
        int n = 15;
        fib(n);
    }

    /** Time Complexity = O(n) **/
}
