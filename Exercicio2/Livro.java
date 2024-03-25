package Exercicio2;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPubli;

    Livro(String tit, String aut, int ano) {
        this.titulo = tit;
        this.autor = aut;
        this.anoPubli = ano;
    }

    void getInfo() {
        System.out.println("O nome do livro é: " + this.titulo);
        System.out.println("O autor do livro é: " + this.autor);
        System.out.println("O ano de publicação do livro é: " + this.anoPubli);
    }

}
