package PART_1;

import java.util.*;

public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit up to which primes are required: ");
        int n = sc.nextInt();

        int p[] = new int[n];
        int c = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                p[c] = i;
                c++;
            }
        }

        System.out.println("Primes up to " + n + " = ");
        for (int i = 0; i < c; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
}
