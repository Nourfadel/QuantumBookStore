public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook(new PaperBook("ISBN001", "The Java Way", "Alice", 2010, 50.0, 10));
        store.addBook(new EBook("ISBN002", "Learn Quantum", "Bob", 2022, 25.0, "PDF"));
        store.addBook(new DemoBook("ISBN003", "Quantum Display Only", "Charlie", 2005, 0.0));

        store.removeExpireBook(2025, 15);

        try {
            double total = store.buyBook("ISBN001", 2, "Nour@gmail.com", "123 Street, City");
            System.out.println("Quantum book store: Total paid: $" + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double total = store.buyBook("ISBN002", 1, "Ramzy@gmail.com", "");
            System.out.println("Quantum book store: Total paid: $" + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("ISBN003", 1, "fadel@gmail.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
