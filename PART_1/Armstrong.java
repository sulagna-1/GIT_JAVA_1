package PART_1;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        n = num;
        while (n != 0) {
            int res = n % 10;
            sum += Math.pow(res, c);
            n /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
/*
 * output for num = 153
 * 153 is Armstrong number
 */
