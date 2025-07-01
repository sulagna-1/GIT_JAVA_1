package Exception_Generics;

public class GenericCount {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = { "A", "B", "A", "C" };
        System.out.println("Count of A: " + count(arr, "A"));
    }
}
