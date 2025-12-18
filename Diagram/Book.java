public class Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    
    public void printDetails() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Year Published: "+yearPublished);
        System.out.println("Price: $"+price);
        if (isAvailable) {
            System.out.println("Available: Yes");
        }
        else {
            System.out.println("Available: No");
        }
    }
    
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
    
    public void markAsUnavailable() {
        isAvailable = false;
    }
    
    public void markAsAvailable() {
        isAvailable = true;
    }
    
    public boolean isPublishedAfter(int year) {
        return yearPublished > year;
    }
}

public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        }
        else if (slot == 2) {
            book2 = book;
        }
        else if (slot == 3) {
            book3 = book;
        }
    }
    
    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        }
        else if (slot == 2) {
            book2 = null;
        }
        else if (slot == 3) {
            book3 = null;
        }
    }
    
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        if (book1 != null) {
            book1.printDetails();
            System.out.println("");
        }
        else {
            System.out.println("No book in this slot.");
            System.out.println("");
        }
        if (book2 != null) {
            book2.printDetails();
            System.out.println("");
        }
        else {
            System.out.println("No book in this slot.");
            System.out.println("");
        }
        if (book3 != null) {
            book3.printDetails();
            System.out.println("");
        }
        else {
            System.out.println("No book in this slot.");
            System.out.println("");
        }
    }
    
    public void checkBookAvailability(int slot) {
        Book targetBook = null;
        if (slot == 1) {
            targetBook = book1;
        }
        else if (slot == 2) {
            targetBook = book2;
        }
        else if (slot == 3) {
            targetBook = book3;
        }
        if (targetBook != null) {
            System.out.println(targetBook.title + " is available.");
        }
        else {
            System.out.println("Book in slot" + slot + " is not available.");
        }
    }
    
    public void updateBookPrice(int slot, double newPrice) {
        Book targetBook = null;
        if (slot == 1) {
            targetBook = book1;
        }
        else if (slot == 2) {
            targetBook = book2;
        }
        else if (slot == 3) {
            targetBook = book3;
        }
        
        if (targetBook != null) {
            targetBook.updatePrice(newPrice);
            System.out.println("Updated price of " + targetBook.title + " to $" + newPrice + ".");
        }
        else {
            System.out.println("No book in this slot.");
        }
    }
    
    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        }
        else {
            System.out.println("No book in this slot.");
        }
    }
}