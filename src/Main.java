import controller.BookShelfController;
import view.BookShelfView;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShelfController bookShelfController = new BookShelfController();
        bookShelfController.loadBooksFromArchive();
        BookShelfView bookShelfView = new BookShelfView(new BookShelfController(), scanner);
        bookShelfView.showMenu();
        }
}
