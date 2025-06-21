package PART_1;

import java.util.*;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to obtain it's reverse = ");
        int n = sc.nextInt();
        int num = n;
        int num1 = 0;
        System.out.println("Before reverse = " + n);
        while (n != 0) {
            int res = n % 10;
            num1 = num1 * 10 + res;
            n /= 10;
        }
        System.out.println("After swap = " + num1);
    }
}
/*
 * output for n = 564
 * Before reverse = 564
 * After reverse = 465
 */
