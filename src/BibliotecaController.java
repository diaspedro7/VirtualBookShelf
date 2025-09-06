import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaController {
    private static ArrayList<Livro> bookList = new ArrayList<>();

    void addBookInList(Livro book){
        bookList.add(book);
    }

    ArrayList<Livro> getBookList(){
        return bookList;
    }

}
