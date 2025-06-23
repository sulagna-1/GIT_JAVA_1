package RECURSION;

import java.util.*;

public class Prime {
    public static boolean isPrime(int n, int d) {
        if (n < 0) {
            return false;
        } else if (d == 1) {
            return true;
        } else if (n % d == 0) {
            return false;
        }
        return isPrime(n, d - 1);
    }

    public static void printNum(int n) {
        if (n == 1) {
            return;
        }
        printNum(n - 1);
        if (isPrime(n, n / 2)) {
            System.out.print(n + ", ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        System.out.println("The prime numbers are = ");
        printNum(n);

    }
}
/*
 * output for n = 20
 * The prime numbers are =
 * 2, 3, 5, 7, 11, 13, 17, 19
 */
