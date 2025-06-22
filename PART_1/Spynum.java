package PART_1;

import java.util.*;

public class Spynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int a = sc.nextInt();
        int num = a;
        int sum = 0;
        int prod = 1;
        while (num != 0) {
            int res = num % 10;
            sum = sum + res;
            prod *= res;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println(a + " is a spy number");
        } else {
            System.out.println(a + " is not a spy number");
        }
    }
}
/*
 * output for a = 1124
 * 1124 is a spy number
 */
