public class PaperBook extends Book {

    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return stock > 0;
    }

    @Override
    public double buyBook(int quantity, String email, String address) {
        if(quantity > stock) {
            throw new IllegalArgumentException("Quantity exceeds stock");
        }
        stock -= quantity;

        System.out.println("Quantum Book Store: shipping " + quantity + " from " + title + " to " + address);
        return price * quantity;
    }
}
