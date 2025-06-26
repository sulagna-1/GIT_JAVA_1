package OOPs;

class Book {
    String BName;
    int BEdition;
    double BPrice;

    Book(String name, int edition, double price) {
        BName = name;
        BEdition = edition;
        BPrice = price;
    }

    void display() {
        System.out.println("Name: " + BName + ", Edition: " + BEdition + ", Price: " + BPrice);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java", 1, 500),
                new Book("Python", 2, 450),
                new Book("C++", 3, 700),
                new Book("DSA", 4, 650),
                new Book("AI", 5, 900)
        };

        Book maxBook = books[0];
        for (Book b : books) {
            b.display();
            if (b.BPrice > maxBook.BPrice)
                maxBook = b;
        }

        System.out.println("\nBook with max price:");
        maxBook.display();
    }
}
