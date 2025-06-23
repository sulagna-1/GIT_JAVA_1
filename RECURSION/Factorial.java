package RECURSION;

import java.util.*;

public class Factorial {
    public static int Fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * Fact(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        int res = Fact(n);
        System.out.println("The factorial of " + n + " = " + res);
    }
}
/*
 * output for n = 5
 * The factorial of 5 = 120
 */
