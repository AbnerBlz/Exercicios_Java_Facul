package Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Livro flow = new Livro("Flow", "Mihaly", 1990);
        Livro lotr = new Livro("Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro simbolos = new Livro("O Homem e Seus Símbolos", "C.G. Jung", 1964);

        flow.getInfo();
        lotr.getInfo();
        simbolos.getInfo();

    }
}
