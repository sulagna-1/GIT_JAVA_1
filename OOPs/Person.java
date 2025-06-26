/*Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person */
package OOPs;

import java.util.*;

class Person_1 {
    int age;
    String name;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void DisplayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person_1 p1 = new Person_1();
        p1.setData("Rohan", 20); // as per assignment, direct value

        Person_1 p2 = new Person_1();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        p2.setData(name, age);

        System.out.println("\n--- Person 1 Details ---");
        p1.DisplayData();

        System.out.println("\n--- Person 2 Details ---");
        p2.DisplayData();

        System.out.println();
        if (p1.age < p2.age)
            System.out.println(p1.name + " is younger.");
        else if (p2.age < p1.age)
            System.out.println(p2.name + " is younger.");
        else
            System.out.println("Both are of the same age.");
    }
}
