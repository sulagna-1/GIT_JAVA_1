package RECURSION;

import java.util.*;

public class Decrease {
    public static void Print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        Print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        Print(n);

    }
}
/*
 * outout for n = 20
 * 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 */
