package DSA_Array;

import java.util.*;

public class RotationL {
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

        // Input number of rotations
        System.out.println("Enter key for rotation = ");
        int k = sc.nextInt();
        k = k % n; // handles k > n

        // Rotate left by 1, k times
        for (int r = 0; r < k; r++) {
            int first = ar[0]; // store first element

            for (int i = 0; i < n - 1; i++) {
                ar[i] = ar[i + 1]; // shift elements to the left
            }

            ar[n - 1] = first; // put first at last
        }

        // Output rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

        sc.close();
    }
}
