package OOPs;

class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0.0;
    }

    Deposit(long p, int t, double r) {
        this.principal = p;
        this.time = t;
        this.rate = r;
    }

    Deposit(long p, int t) {
        this(p, t, 0.0);
    }

    Deposit(long p, double r) {
        this(p, 0, r);
    }

    void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal: " + principal + ", Time: " + time + ", Rate: " + rate + ", Total: " + totalAmt);
    }
}

public class Deposit_1 {
    public static void main(String[] args) {
        // Using Constructor 1: No parameters
        Deposit d1 = new Deposit();
        d1.calcAmt();
        System.out.println("Deposit using default constructor:");
        d1.display();

        // Using Constructor 2: All parameters
        Deposit d2 = new Deposit(10000, 2, 5.5);
        d2.calcAmt();
        System.out.println("Deposit using (long, int, double):");
        d2.display();

        // Using Constructor 3: principal and time
        Deposit d3 = new Deposit(8000, 3);
        d3.calcAmt();
        System.out.println("Deposit using (long, int):");
        d3.display();

        // Using Constructor 4: principal and rate
        Deposit d4 = new Deposit(5000, 4.5);
        d4.calcAmt();
        System.out.println("Deposit using (long, double):");
        d4.display();
    }
}
