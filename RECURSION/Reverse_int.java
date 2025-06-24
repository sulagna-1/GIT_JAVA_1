package RECURSION;

import java.util.*;

public class Reverse_int {
    public static int Reverse(int x, int rev) {
        if (x == 0) {
            return rev;
        }
        int res = x % 10;
        rev = rev * 10 + res;
        return Reverse(x / 10, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int r = Reverse(n, 0);
        System.out.println("Original = " + n);
        System.out.println("Revered = " + r);

    }
}
/*
 * output for n = 56
 * Original = 56
 * Revered = 65
 */
