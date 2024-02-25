package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

//(Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
//no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.

public class InteirosMaioresEMenores2_24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();
        System.out.print("Enter an other integer: ");
        int numberB = input.nextInt();
        System.out.print("Enter an other other integer: ");
        int numberC = input.nextInt();
        System.out.print("Enter an other other other integer: ");
        int numberD = input.nextInt();
        System.out.print("Enter an other other other other integer: ");
        int numberE = input.nextInt();

        int bigger = numberA;

        if (numberB > bigger) {
            bigger = numberB;
        }
        if (numberC > bigger) {
            bigger = numberC;
        }
        if (numberD > bigger) {
            bigger = numberD;
        }
        if (numberE > bigger) {
            bigger = numberE;
        }


        int smaller = numberA;
        if (numberB < smaller) {
            smaller = numberB;
        }
        if (numberC < smaller) {
            smaller = numberC;
        }
        if (numberD < smaller) {
            smaller = numberD;
        }
        if (numberE < smaller) {
            smaller = numberE;
        }


        System.out.println("The bigger is: " + bigger);
        System.out.println("The smaller is: " + smaller);


        input.close();
    }
}
