package model;

public class Book {

    private String bookName;
    private String authorName;
    private boolean isBookRead;

    //constructor
    public Book(String name, String author, boolean read){
        this.bookName = name;
        this.authorName = author;
        this.isBookRead = read;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isBookRead() {
        return isBookRead;
    }

    public void setBookRead(boolean bookRead) {
        this.isBookRead = bookRead;
    }



    @Override
    public String toString() {
        return "[📚 " + bookName + " | " + authorName + " | Read: " + (isBookRead ? "✅" : "❌") + "]";
    }

}
