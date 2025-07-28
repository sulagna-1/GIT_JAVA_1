package Exception_Generics;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        try {
            int num = sc.nextInt();
            if (num < 0) {
                throw new NumberFormatException("Negative number not allowed!");
            }
            System.out.println("Your lucky number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
