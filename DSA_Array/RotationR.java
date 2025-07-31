package DSA_Array;

import java.util.*;

public class RotationR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter array length = ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        // Input array elements
        System.out.println("Enter the values -");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        // Input rotation key
        System.out.println("Enter key for rotation = ");
        int k = sc.nextInt();
        k = k % n; // To handle cases when k > n

        // Rotation logic (right shift by 1, repeated k times)
        for (int r = 0; r < k; r++) {
            int last = ar[n - 1]; // store last element

            for (int i = n - 1; i > 0; i--) {
                ar[i] = ar[i - 1]; // shift elements to right
            }

            ar[0] = last; // put last at first position
        }

        // Output rotated array
        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

        sc.close();
    }
}
