package OOPs;

class Complex {
    int real;
    int img;

    void Set(int a, int b) {
        real = a;
        img = b;
    }

    void Display() {
        System.out.println("Real = " + real + " Imag = " + img);
    }

    public Complex add(Complex c1, Complex c2) {
        Complex t = new Complex();
        t.real = c1.real + c2.real;
        t.img = c1.img + c2.img;
        return t;
    }
}

public class Comp_num {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex res = new Complex();
        c1.Set(4, 5);
        c2.Set(6, 5);
        res = res.add(c1, c2);
        System.out.println("Sum = ");
        res.Display();

    }

}
