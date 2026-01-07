/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main4_3 {
    public static void main (String[] args) {
            Book myBook = new Book();
            myBook.title = "Java Programming";
            myBook.price = 299.0;
            
            Library myLibrary = new Library();
            myLibrary.libraryName = "Central Tech Library";
            
            myLibrary.addBook(myBook, 1);
            
            myLibrary.printLibraryDetails();
    }
}
