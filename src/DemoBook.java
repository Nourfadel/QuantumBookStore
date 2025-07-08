public class DemoBook extends Book {

    public DemoBook(String isbn, String title, String author, int year, double price) {
        super(isbn, title, author, year, price);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

    @Override
    public double buyBook(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Demo book is not for sale");
    }


}
