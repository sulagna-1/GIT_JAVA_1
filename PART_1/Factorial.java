package PART_1;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to obtain desired factorial = ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
            System.out.print(i + " x " + " ");
        }
        System.out.println();
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
/*
 * output for n = 5
 * 5 x 4 x 3 x 2 x 1
 * Factorial of 5 = 120
 */
