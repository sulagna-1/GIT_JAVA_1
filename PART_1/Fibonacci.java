package PART_1;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms required = ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci seqjence = " + first + " " + second);
        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }
}
