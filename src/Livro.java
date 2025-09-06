public class Livro {
    private String nome;
    private String autor;
    private boolean lido;

    //construtor
    public Livro(String nome, String autor, boolean lido){
        this.nome = nome;
        this.autor = autor;

        this.lido = lido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public boolean getLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    // toString para exibir bonito
    @Override
    public String toString() {
        return "Livro: " + nome + " - " + autor + " - Status: [" + lido + "]";
    }

}
