package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

//(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses
// números e imprima sua soma, produto,
//diferença e quociente (divisão).
public class Aritmetica2_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();
        System.out.print("Enter an other integer: ");
        int numberB = input.nextInt();
        System.out.println("-*-*-*RESULTS-*-*-*");
        System.out.printf("sum %d + %d = %d\n", numberA, numberB, numberA+numberB);
        System.out.printf("product %d * %d = %d\n", numberA, numberB, numberA*numberB);
        System.out.printf("difference %d - %d = %d\n", numberA, numberB, numberA-numberB);
        System.out.printf("quotient %d / %d = %d", numberA, numberB, numberA/numberB);

        input.close();
    }

}
