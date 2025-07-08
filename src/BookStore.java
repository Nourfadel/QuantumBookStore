import java.util.*;


public class BookStore {
    private Map<String,Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(),book);
        System.out.println("Quantum book store: added book " + book.getIsbn());
    }

    public void removeExpireBook(int currentYear , int maxAge){
        List<String> expiredBooks = new ArrayList<>();
        for(Book b : inventory.values()){
            if(currentYear - b.getYear() > maxAge){
                expiredBooks.add(b.getIsbn());
            }
        }
        for(String id : expiredBooks){
            Book removedBook = inventory.remove(id);
            System.out.println("Quantum book store: removed " + removedBook.getIsbn());

        }

    }


    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new RuntimeException("Quantum book store: Book not found");
        }
        if (!book.isPurchasable()) {
            throw new RuntimeException("Quantum book store: Book is not purchasable");
        }
        return book.buyBook(quantity, email, address);
    }




}
