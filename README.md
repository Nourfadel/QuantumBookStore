# Quantum Bookstore

Quantum Bookstore is an object-oriented Java project that simulates an online bookstore system supporting multiple book types.  
The system is designed with extensibility in mind using polymorphism and clean architecture principles.

---

## 📚 Features

- ✅ Add books to inventory:
    - PaperBooks (shipped, with stock)
    - EBooks (digital, with file type)
    - ShowcaseBooks (demo only, not for sale)
- 🧹 Remove outdated books based on publish year
- 🛒 Buy books by ISBN:
    - Updates stock for PaperBooks
    - Sends to ShippingService (simulated)
    - Sends to MailService for EBooks (simulated)
- 🚫 Prevent purchase of non-purchasable books
- 💬 All messages are prefixed with `Quantum book store`

---

## 🧱 Project Structure

QuantumBookstore/
├── Book.java # Abstract base class
├── PaperBook.java # Subclass for physical books
├── EBook.java # Subclass for digital books
├── ShowcaseBook.java # Subclass for demo-only books
├── Bookstore.java # Main inventory and service logic
└── QuantumBookstoreFullTest.java # Test class with example usage


---

## 🧪 Sample Output
Quantum book store: added book ISBN001
Quantum book store: added book ISBN002
Quantum book store: added book ISBN003
Quantum book store: removed ISBN003
Quantum Book Store: shipping 2 from The Java Way to 123 Street, City
Quantum book store: Total paid: $100.0
Quantum Book Store: sending Learn Quantum (PDF)  to Ramzy@gmail.com
Quantum book store: Total paid: $25.0
Quantum book store: Book not found


