public abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected int year;
    protected double price;

    public Book(String isbn, String title, String author, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public abstract boolean isPurchasable();
    public abstract double buyBook(int quantity,String email, String address);


    public String getIsbn() {
        return isbn;
    }


    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }

}
