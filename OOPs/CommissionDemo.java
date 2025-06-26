package OOPs;

import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double getCommission() {
        if (sales < 0)
            return -1;

        if (sales < 100)
            return 0.02 * sales;
        else if (sales < 5000)
            return 0.05 * sales;
        else
            return 0.08 * sales;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        Commission c = new Commission(sales);
        double commission = c.getCommission();

        if (commission == -1)
            System.out.println("Invalid Input");
        else
            System.out.println("Commission = Rs. " + commission);
    }
}
