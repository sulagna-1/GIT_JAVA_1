package Exception_Generics;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        // String
        Box<String> stringBox = new Box<>();
        Box<String> stringBox2 = stringBox;
        stringBox.set("Hello");
        System.out.println("StringBox2: " + stringBox2.get());
        stringBox2.set("World");
        System.out.println("StringBox: " + stringBox.get());

        // Integer
        Box<Integer> intBox = new Box<>();
        Box<Integer> intBox2 = intBox;
        intBox.set(100);
        System.out.println("IntBox2: " + intBox2.get());
        intBox2.set(200);
        System.out.println("IntBox: " + intBox.get());

        // Object
        Box<Object> objBox = new Box<>();
        Box<Object> objBox2 = objBox;
        objBox.set("A String");
        System.out.println("ObjectBox: " + objBox2.get());
        objBox2.set(123);
        System.out.println("ObjectBox: " + objBox.get());
    }
}
