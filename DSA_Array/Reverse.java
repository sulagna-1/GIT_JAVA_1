package DSA_Array;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length = ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Reverse array = ");
        int start = 0;
        int end = n - 1;
        int temp;
        while (start < end) {
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
        for (int num : ar) {
            System.out.println(num + " ");
        }
    }
}
