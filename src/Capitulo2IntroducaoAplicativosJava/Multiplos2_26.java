package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

//(Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é
// um múltiplo do segundo e imprimir o resultado. [Dica: utilize o operador de resto.]

public class Multiplos2_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();
        System.out.print("Enter an other integer: ");
        int numberB = input.nextInt();

        if(numberA%numberB == 0){
            System.out.printf("%d is multiple of %d.", numberA, numberB);
        }else {
            System.out.printf("%d is not multiple of %d.", numberA, numberB);
        }
    }

}
