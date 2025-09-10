package view;

import controller.BookShelfController;
import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookShelfView {
    private BookShelfController bookShelfController;
    private final Scanner scanner;

    public BookShelfView(BookShelfController bookShelfController, Scanner scanner){
        this.bookShelfController = bookShelfController;
        this.scanner = scanner;
    }

    public Book createNewBook(){
        while(true){
            scanner.nextLine();
        try{
            System.out.println("\n====================");
            System.out.println("   ADD A NEW BOOK   ");
            System.out.println("====================");
        System.out.print("1. Type the book's name: ");
        String bookName = scanner.nextLine();
        System.out.print("2. Type the author's name: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("3. Have you finished reading? (true or false) ");
        boolean bookRead = scanner.nextBoolean();

            System.out.println("\n**BOOK ADDED SUCCESSFULLY**");
        return new Book(bookName, bookAuthor, bookRead);
        }
        catch (Exception e) {
            System.out.println("Invalid input, try again.");

        }
        }
    }

    void showBookList(){
        ArrayList<Book>  bookList = bookShelfController.getBookList();
        System.out.println("\n====================");
        System.out.println("   YOUR BOOKLIST   ");
        System.out.println("====================");
        System.out.println(bookList);

    }

    public void showMenu(){

        while(true) {
            try {
                System.out.println("\n====================");
                System.out.println("       MENU         ");
                System.out.println("====================");
                System.out.println("1. View book list");
                System.out.println("2. Add a new book");
                System.out.println("3. Exit");
                System.out.print("Your choice: ");

                int digito = scanner.nextInt();


                switch (digito) {
                    case 1:
                        showBookList();
                        break;
                    case 2:
                        Book book = createNewBook();
                        bookShelfController.addBookInList(book);
                        break;
                    case 3:
                        bookShelfController.saveBooksInArchive();
                        System.out.println("Goodbye...");
                        return;
                    default:
                        System.out.println("Input a valid number.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                scanner.nextLine();
            }

        }
    }

}
