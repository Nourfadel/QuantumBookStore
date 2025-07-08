public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        super(isbn, title, author, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double buyBook(int quantity, String email, String address) {
        System.out.println("Quantum Book Store: sending " + title + " ("+fileType+") " + " to " + email);
        return price * quantity;
    }


}
