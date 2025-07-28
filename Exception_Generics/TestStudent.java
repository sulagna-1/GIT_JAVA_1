package Exception_Generics;
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) throws MarksOutOfBoundException {
        if (marks > 100) {
            throw new MarksOutOfBoundException("Marks cannot be greater than 100!");
        }
        this.name = name;
        this.marks = marks;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        try {
            Student s = new Student("Alice", 110);
        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
