package RECURSION;

import java.util.*;

public class GCD {
    public static int funcGCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return funcGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int a = sc.nextInt();
        System.out.println("Enter the value = ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + "," + b + " = " + funcGCD(a, b));

    }
}
/*
 * Output for 6, 12
 * GCD of 6,12 = 6
 */
