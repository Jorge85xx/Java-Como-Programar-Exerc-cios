package Capitulo4OperacoesDeAtribuicao.quilometragemDeCombustivel4_17;

import java.util.Scanner;
/*uilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista
monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-*-*-*-*-CONSUMPTION CALCULATOR-*-*-*-*-");

        int totalKilometers = 0;
        int totalLiters = 0;
        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter the kilometers driven (or -1 to quit): ");
            int kilometers = input.nextInt();

            if (kilometers == -1) {
                continueInput = false;
                break;
            }

            System.out.print("Enter the liters of gasoline consumed: ");
            int liters = input.nextInt();

            double consumption = (double) kilometers / liters;
            System.out.printf("Kilometers per liter for this trip: %.2f km/l%n", consumption);

            totalKilometers += kilometers;
            totalLiters += liters;
        }

        if (totalKilometers > 0 && totalLiters > 0) {
            double totalConsumption = (double) totalKilometers / totalLiters;
            System.out.printf("Total kilometers driven: %d km%n", totalKilometers);
            System.out.printf("Total liters of gasoline consumed: %d liters%n", totalLiters);
            System.out.printf("Overall kilometers per liter: %.2f km/l%n", totalConsumption);
        } else {
            System.out.println("No trips were entered.");
        }

        input.close();
    }
}
