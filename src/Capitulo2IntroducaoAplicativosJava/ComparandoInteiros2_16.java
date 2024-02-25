package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

//(Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e
// exiba o número maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal".
public class ComparandoInteiros2_16 {
    public static void main(String[] args) {
        //Criando o scanner para o input de numeros
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();
        System.out.print("Enter an other integer: ");
        int numberB = input.nextInt();
        if (numberA>numberB){
            System.out.printf("%d is larger %d.", numberA, numberB);
        } else if (numberB>numberA) {
            System.out.printf("%d is larger %d.", numberB, numberA);
        } else{
            System.out.println("These numbers are equals.");
        }
        input.close();
    }
}
