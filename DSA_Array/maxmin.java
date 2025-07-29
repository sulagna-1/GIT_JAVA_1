package DSA_Array;

import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length = ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the values = ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
            if (ar[i] < min)
                min = ar[i];
        }
        System.out.println("Max: " + max + ", Min: " + min);

    }
}
