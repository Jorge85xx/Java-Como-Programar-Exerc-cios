package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

/*
(Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339, o programa deve imprimir
4   2   3   3   9
Suponha que o usuário insira o número correto de dígitos. O que acontece quando você insere um número com mais de cinco dígitos?
O que acontece quando você insere um número com menos de cinco dígitos?
[Dica: é possível fazer este exercício com as técnicas que aprendeu neste capítulo.
Você precisará tanto das operações de divisão como das de resto para “selecionar” cada dígito.]
* */
public class SeparandoOsDigitosEmUmInteiro2_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number with 5 decimal places: ");
        int numbers = input.nextInt();

        if(numbers <= 99999){
            System.out.printf("%d %s", (numbers/10000) % 10, "  "); //qualquer número menor que 10 dividido por 10 o resto é o próprio número
            System.out.printf("%d %s", (numbers/1000) % 10, "  ");
            System.out.printf("%d %s", (numbers/100) % 10, "  ");
            System.out.printf("%d %s", (numbers/10) % 10, "  ");
            System.out.printf("%d %s", numbers % 10, "  ");
        }else {
            System.out.println("-----ERROR: You enter number more than 5 integers------");
        }

        input.close();
    }
}
