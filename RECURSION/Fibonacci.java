package RECURSION;

import java.util.*;

public class Fibonacci {
    public static int Fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void print(int n, int c) {
        if (c > n) {
            return;
        }
        System.out.print(Fibo(c) + " ");
        print(n, c + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for Fibonacci series = ");
        int x = sc.nextInt();
        System.out.println("Fibonacci series = ");
        print(x - 1, 0);
    }
}
/*
 * output for n = 10
 * Fibonacci series =
 * 0 1 1 2 3 5 8 13 21 34
 */
