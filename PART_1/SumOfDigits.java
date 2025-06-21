package PART_1;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while (n != 0) {
            int res = n % 10;
            sum = sum + res;
            n /= 10;
        }
        System.out.println("Sum of the digits in " + num + " = " + sum);
    }
}
/*
 * output for num = 123
 * Sum of the Digits in 123 = 6
 */