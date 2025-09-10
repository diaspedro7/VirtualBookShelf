package controller;

import model.Book;

import java.util.ArrayList;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class BookShelfController {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBookInList(Book book){
        bookList.add(book);
    }

   public ArrayList<Book> getBookList(){
        return bookList;
    }

    public void saveBooksInArchive() {
        try{
            FileWriter fw = new FileWriter("bookList.csv");
            PrintWriter pw = new PrintWriter(fw);

            for(Book book : bookList){
                pw.println(book.getBookName() + ";" + book.getAuthorName() + ";" +
                        book.isBookRead());
            }
            pw.close();
            System.out.println("Books saved in bookList.csv");
        } catch (Exception e) {
            System.out.println("Error during saving books: " + e.getMessage());

        }
    }


    public void loadBooksFromArchive() {
        bookList.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader("bookList.csv"));
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";"); // separate by ;
                if (dados.length == 3) {
                    String nome = dados[0];
                    String autor = dados[1];
                    boolean lido = Boolean.parseBoolean(dados[2]);

                    Book book = new Book(nome, autor, lido);
                    bookList.add(book);
                }
            }

            br.close();
            System.out.println("Booklist loaded from bookList.csv");

        } catch (IOException e) {
            System.out.println("No previous file bookList.csv found, creating a new one.");
        }
    }


}
