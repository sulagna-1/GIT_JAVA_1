package PART_1;

import java.util.*;

public class GCD {
    public static int Greatest_Divisor(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;

    }

    public static int LCM(int x, int y) {
        return x * y / Greatest_Divisor(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 2 numbers to find GCD and LCM :- ");
        System.out.println("Enter the first number a = ");
        int a = sc.nextInt();
        System.out.println("Enter the second number b = ");
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + "," + b + " = " + Greatest_Divisor(a, b));
        System.out.println("The LCM of " + a + "," + b + " = " + LCM(a, b));
    }
}/*
  * output for 6, 12 =>
  * The GCD of 6,12 = 6
  * The LCM of 6,12 = 12
  */
