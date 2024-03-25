package Exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1241, "José da Silva");

        conta1.depositar(1000);
        conta1.verSaldo();

        conta1.sacar(1001);
    }
}
