package management;

import java.util.Scanner;
import models.Book;

public class LibraryManager {
    private static LibraryManager instance;
    private Library library;

    private LibraryManager() {
        library = new Library();
    }

    
    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Manager Menu : ");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. List Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book details (title, author, ISBN, isAvailable, fileSize for EBook): ");

                   
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean available = scanner.nextBoolean();
                    System.out.print("Enter file size for EBook and 0 for Physical Book: ");
                    int fileSize = scanner.nextInt();
                    scanner.nextLine();  

                   
                    Book book = BookFactory.createBook(fileSize > 0 ? "EBook" : "Book", title, author, isbn, available, fileSize);
                    library.addBook(book);  

                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter ISBN of Book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBookByIsbn(removeIsbn);
                    break;

                case 3:
                    System.out.print("Enter title of Book to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(searchTitle);
                    System.out.println(foundBook != null ? foundBook : "Book not found");
                    break;

                case 4:
                    library.listBooks();
                    break;

                case 5:
                    System.out.println("Thank you for choosing our Library Management System!");
                    return;  

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
