package RECURSION;

import java.util.*;

public class Pallindrome_str {
    public static boolean isPallindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPallindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word = ");
        String str = sc.nextLine();
        if (isPallindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Pallindrome");
        } else {
            System.out.println(str + " is not a Pallindrome");
        }
    }
}
/*
 * output for str = madam
 * madam is a Pallindrome
 * 
 */