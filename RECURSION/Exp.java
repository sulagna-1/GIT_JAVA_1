package RECURSION;

import java.util.*;

public class Exp {
    public static int Power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * Power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base = ");
        int b = sc.nextInt();
        System.out.println("Enter the exponent value = ");
        int p = sc.nextInt();
        int res = Power(b, p);
        System.out.println(b + " ^ " + p + " = " + res);
    }
}
/*
 * output for b = 5 and p = 2
 * 5 ^ 2 = 25
 */
