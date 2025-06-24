package RECURSION;

import java.util.*;

public class Reverse_str {
    public static String Reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return s.charAt(s.length() - 1) + Reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word = ");
        String str = sc.nextLine();
        String str_rev = Reverse(str);
        System.out.println("Original word = " + str);
        System.out.println("Reversed string = " + str_rev);
    }
}
/*
 * output for str = Java
 * Original word = Java
 * Reversed string = avaJ
 */
