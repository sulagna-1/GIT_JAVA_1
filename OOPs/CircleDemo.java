package OOPs;

class PointType {
    double x, y;

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.println("Point at (" + x + ", " + y + ")");
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class CircleType extends PointType {
    double radius;

    void setRadius(double r) {
        this.radius = r;
    }

    void printRadius() {
        System.out.println("Radius = " + radius);
    }

    void printArea() {
        System.out.println("Area = " + Math.PI * radius * radius);
    }

    void printCircumference() {
        System.out.println("Circumference = " + 2 * Math.PI * radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        CircleType c = new CircleType();
        c.setPoint(5, 10);
        c.setRadius(7);
        c.showPoint();
        c.printRadius();
        c.printArea();
        c.printCircumference();
    }
}
