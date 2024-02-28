package Capitulo2IntroducaoAplicativosJava;

import java.util.Scanner;

/*
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para S. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
também pode empregar a constante Math.PI predefinida para o valor de S. Essa constante é mais precisa que o valor 3,14159. A classe
Math é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
diâmetro = 2r
circunferência = 2Sr
área = Sr2
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de saída em uma
instrução System.out.printf.*/

public class AreaDeCirculo2_28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();


        System.out.printf("Diameter: %.2f\n", (float) 2 * radius);
        System.out.printf("Circumference: %.3f\n", 2 * Math.PI * radius);
        System.out.printf("Area: %.3f\n", Math.PI * radius * radius);

        input.close();
    }
}
