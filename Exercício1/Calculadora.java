package Exercício1;

public class Calculadora {

    static int adicao(int num1, int num2) {
        return num1 + num2;
    }

    static int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    static int divisao(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("operação inválida,");
        } else {
            return num1 / num2;
        }
        return 0;
    }
}
