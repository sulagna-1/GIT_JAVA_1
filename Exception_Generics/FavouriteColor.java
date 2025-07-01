package Exception_Generics;

public class FavouriteColor {
    public static void main(String[] args) {
        String[] colors = { "Red", "Blue", "Green" };
        try {
            System.out.println(colors[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index out of bounds!");
        }
        try {
            colors[1] = null;
            System.out.println(colors[1].length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception: Null pointer!");
        }
    }
}
