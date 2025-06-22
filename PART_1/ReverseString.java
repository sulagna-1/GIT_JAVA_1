package PART_1;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be reversed = ");
        String str = sc.nextLine();
        String str_rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str_rev = str_rev + str.charAt(i);
        }
        System.out.println("The reversed string = " + str_rev);
    }
}
/*
 * output for str = Java
 * The reversed string = avaJ
 */
