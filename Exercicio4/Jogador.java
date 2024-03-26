package Exercicio4;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    void aumentaPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    void sobeNivel() {
        this.nivel++;
    }

    void exibeInfo() {
        System.out.println("Jogador " + this.nome + ", sua pontuação é: " + this.pontuacao + ", e você está no nivel "
                + this.nivel);
    }

}
