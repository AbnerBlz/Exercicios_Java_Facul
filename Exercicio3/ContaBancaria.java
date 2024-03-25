package Exercicio3;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo = 0;

    ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    void depositar(int valor) {
        this.saldo += valor;
    }

    void sacar(int valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Você não tem saldo o suficiente.");
        }

    }

    void verSaldo() {
        System.out.println(this.nomeTitular + ", seu saldo é: " + this.saldo);
    }

}
