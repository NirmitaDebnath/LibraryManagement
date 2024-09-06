package management;

import java.util.ArrayList;
import java.util.List;

import models.Book;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBookByIsbn(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed with ISBN : " + isbn);
                return;
            }
        }
        System.out.println("No book found with ISBN : " + isbn);
    }

    public Book searchBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public void listBooks(){
        for(int i =0;i< books.size();i++){
            Book book=books.get(i);
            System.out.println(book);
        }
    }

}
