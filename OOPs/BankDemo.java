package OOPs;

class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0;

    void setBankName(String name) {
        this.bankName = name;
    }

    void setAmount(double amount) {
        if (amount >= 1000) {
            this.depositAmount = amount;
            totalAmount += amount;
        } else {
            System.out.println("Minimum deposit should be 1000");
        }
    }

    void showData() {
        System.out.println("Bank Name: " + bankName + ", Deposit: Rs." + depositAmount);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];
        for (int i = 0; i < 5; i++) {
            banks[i] = new Bank();
            banks[i].setBankName("Bank_" + (i + 1));
            banks[i].setAmount(1000 + i * 500); // Example deposits
        }

        for (Bank b : banks)
            b.showData();

        double min = banks[0].depositAmount;
        String minBank = banks[0].bankName;

        for (Bank b : banks) {
            if (b.depositAmount < min) {
                min = b.depositAmount;
                minBank = b.bankName;
            }
        }

        System.out.println("\nTotal Amount Deposited: Rs." + Bank.totalAmount);
        System.out.println("Bank with Minimum Deposit: " + minBank + " (Rs." + min + ")");
    }
}
