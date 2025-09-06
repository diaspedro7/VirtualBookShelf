import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaView {
    private BibliotecaController bibliotecaController;
    private Scanner scanner;

    public BibliotecaView(BibliotecaController bibliotecaController, Scanner scanner){
        this.bibliotecaController = bibliotecaController;
        this.scanner = scanner;
    }

    public Livro newLivro(){
        System.out.println("Adicione um novo livro ---");
        System.out.print("1. Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.print("2. Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();
        System.out.print("3. Já terminou de ler? (true ou false) ");
        boolean lidoLivro = scanner.nextBoolean();
        return new Livro(nomeLivro, autorLivro, lidoLivro);
    }

    void showBookList(){
        ArrayList<Livro>  bookList = bibliotecaController.getBookList();
        System.out.println("--- Todos os seus livros ---\n" + bookList + "\n------");

    }

    public void showMenu(){
        while(true) {
            System.out.println("Menu ---");
            System.out.println("Digite 1 para ver a lista de livros");
            System.out.println("Digite 2 para adicionar um livro");
            System.out.println("Digite 3 para encerrar programa");

            int digito = scanner.nextInt();

            switch (digito){
                case 1:
                    showBookList();
                    break;
                case 2:
                    Livro livro = newLivro();
                    bibliotecaController.addBookInList(livro);
                    break;
                case 3:
                    System.out.println("Goodbye ;) ...");
                    return;
            }

        }
    }
}
