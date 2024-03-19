package Exercício1;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Opção de cálculo: ");
        System.out.println("1 - Adição ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        int opcao = Integer.parseInt(leitor.nextLine());

        System.out.println("Insira agora o primeiro número: ");
        int num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Insira agora o segundo número: ");
        int num2 = Integer.parseInt(leitor.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + Calculadora.adicao(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + Calculadora.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + Calculadora.multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + Calculadora.divisao(num1, num2));
                break;
            default:
                System.out.println("operação inválida.");
                break;
        }
        leitor.close();
    }

}
