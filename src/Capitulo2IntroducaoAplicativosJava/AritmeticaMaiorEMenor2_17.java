package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

//(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto
// e os números menores e maiores. Utilize as técnicas mostradas na Figura 2.15(if's).
// [Observação: o cálculo da média neste exercício deve resultar
//em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
public class AritmeticaMaiorEMenor2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberA = input.nextInt();
        System.out.print("Enter an other integer: ");
        int numberB = input.nextInt();
        System.out.print("Enter an other other integer: ");
        int numberC = input.nextInt();

        System.out.println("-*-*-*RESULTS-*-*-*");

        System.out.printf("sum between %d, %d and %d is %d\n", numberA, numberB, numberC, numberA+numberB+numberC);
        System.out.printf("average between %d, %d and %d is %d\n",numberA, numberB, numberC, (numberA+numberB+numberC)/3 );
        System.out.printf("product between %d, %d and %d is %d\n", numberA, numberB, numberC, numberA*numberB*numberC);

        System.out.println( "Comparison between smaller integers" );

        if( numberA < numberB)
            System.out.printf( "%d < %d\n" , numberA , numberB );
        if( numberA < numberC)
            System.out.printf( "%d < %d\n" , numberA , numberC );
        if( numberB < numberA)
            System.out.printf( "%d < %d\n" , numberB , numberA );
        if( numberB < numberC)
            System.out.printf( "%d < %d\n" , numberB , numberC );
        if( numberC < numberA)
            System.out.printf( "%d < %d\n" , numberC , numberA );
        if( numberC < numberB)
            System.out.printf( "%d < %d\n" , numberC , numberB );

        System.out.println( "Comparison between larger integers" );

        if( numberA > numberB)
            System.out.printf( "%d > %d\n" , numberA , numberB );
        if( numberA > numberC)
            System.out.printf( "%d > %d\n" , numberA , numberC );
        if( numberB > numberA)
            System.out.printf( "%d > %d\n" , numberB , numberA );
        if( numberA > numberC)
            System.out.printf( "%d > %d\n" , numberB , numberC );
        if( numberC > numberA)
            System.out.printf( "%d > %d\n" , numberC , numberA );
        if( numberC > numberB)
            System.out.printf( "%d > %d\n" , numberC , numberB );

        input.close();
    }
}
