package Capitulo4OperacoesDeAtribuicao.calculadorComissaoVendas4_19;

import java.util.Scanner;
/*Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula
e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.*/
public class SalesComissionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        final double baseSalary = 200.0;

        final double commissionRate = 0.09;


        double[] itemPrices = {239.99, 129.75, 99.95, 350.89};


        int[] itemsSold = new int[itemPrices.length];
        for(int i = 0; i < itemPrices.length; i++) {
            System.out.printf("Enter the number of Item %d sold: ", (i + 1));
            int positive = scanner.nextInt();
            if(positive > -1) {
                itemsSold[i] = positive;
            }
        }

        // total sales
        double totalSales = 0.0;
        for (int i = 0; i < itemPrices.length; i++) {
            totalSales += itemsSold[i] * itemPrices[i];
        }

        double total = baseSalary + (totalSales * commissionRate);


        System.out.printf("The salesperson's total for the week are: $%.2f%n", total);

        scanner.close();
    }

}
