package com.company.basics;

public class RecursiveFibonacci {

    static int fib(int n)
    {
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }

    public static void
    main(String args[])
    {
        // Given Number N
        int N = 15;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fib(i) + " ");
        }
    }

/** Time Complexity = O(2^n)**/
}
