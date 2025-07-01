package Exception_Generics;

public class GenericPrintArray {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] strArray = { "A", "B", "C" };
        printArray(intArray);
        printArray(strArray);
    }
}
