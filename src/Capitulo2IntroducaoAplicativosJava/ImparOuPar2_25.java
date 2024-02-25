package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

// (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par.
// [Dica: utilize o operador de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]

public class ImparOuPar2_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();

        if(numberA%2 == 0){
            System.out.printf("%d it's a par number ", numberA);
        }else{
            System.out.printf("%d it's a odd number ", numberA);
        }
        input.close();
    }
}
