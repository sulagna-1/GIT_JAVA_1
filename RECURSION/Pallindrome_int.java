package RECURSION;

import java.util.*;

public class Pallindrome_int {
    public static int Pallindrome(int x, int y) {
        if (x == 0) {
            return y;
        }
        int res = x % 10;
        y = y * 10 + res;
        return Pallindrome(x / 10, y);
    }

    public static boolean isPallindrome(int a) {
        int rev = Pallindrome(a, 0);
        return a == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        if (isPallindrome(n)) {
            System.out.println(n + " is a Pallindrome number");
        } else {
            System.out.println(n + " is not a Pallindrome number");
        }
    }
}
/*
 * output for n = 121
 * 121 is a Pallindrome number
 */